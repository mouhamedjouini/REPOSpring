package com.spring.poc.springbootcrudwiththymeleaf.Service;

import com.spring.poc.springbootcrudwiththymeleaf.Repository.StaffRepo;
import com.spring.poc.springbootcrudwiththymeleaf.entities.Staff;

import java.util.List;

public interface StaffService {
    void save(Staff staff);
    List<Staff> getAll();
    Staff getById(Integer id);
    void delete(Staff staff);
}
