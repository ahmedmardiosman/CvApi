package com.qa.persistence.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.qa.persistence.domain.Admin;
@Repository
public interface IMySqlRepository extends CrudRepository<Admin, Long>{

}
