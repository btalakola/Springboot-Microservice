package com.ms.departmentservice.departmentservice.service;

import com.ms.departmentservice.departmentservice.entity.Department;
import com.ms.departmentservice.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department dept) {
        log.info("Inside save department of DepartmentService");
        return departmentRepository.save(dept);
    }

    public Department findDepartmentById(Long deptId) {
        log.info("Inside findDepartmentById of DepartmentService");
        return departmentRepository.findById(deptId).get();
    }
}
