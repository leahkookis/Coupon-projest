package com.lea.server.dal;


import com.lea.server.beans.CompanyDto;
import com.lea.server.entity.Company;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICompanyDal extends CrudRepository<Company, Long> {

    boolean existsByName(String name);

    @Query("SELECT new com.lea.server.beans.CompanyDto(com.id, com.name, com.address, com.phoneNumber) FROM Company com WHERE com.id= :id")
    CompanyDto findById(@Param("id")long id);

    @Query("SELECT new com.lea.server.beans.CompanyDto(com.id, com.name, com.address, com.phoneNumber) FROM Company com")
    List<CompanyDto> findAll(Pageable pageable);
}
