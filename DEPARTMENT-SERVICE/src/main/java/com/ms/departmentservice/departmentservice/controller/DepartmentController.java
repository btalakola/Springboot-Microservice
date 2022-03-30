package com.ms.departmentservice.departmentservice.controller;

import com.ms.departmentservice.departmentservice.entity.Department;
import com.ms.departmentservice.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/addDepartment")
    public Department saveDepartment(@RequestBody Department dept){
       log.info("Inside save department of deptController");
        return departmentService.saveDepartment(dept);
    }

    @GetMapping("/findDepartment/{deptId}")
    public Department findDepartmentById(@PathVariable("deptId") Long deptId){
    log.info("Inside findDepartmentById");
    return departmentService.findDepartmentById(deptId);
    }
}
