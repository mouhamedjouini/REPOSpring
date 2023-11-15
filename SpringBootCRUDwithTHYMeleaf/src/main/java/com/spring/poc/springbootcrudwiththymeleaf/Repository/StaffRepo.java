package com.spring.poc.springbootcrudwiththymeleaf.Repository;

import com.spring.poc.springbootcrudwiththymeleaf.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepo extends JpaRepository<Staff, Integer> {

}
