package com.ms.userservice.userservice.service;

import com.ms.userservice.userservice.VO.Department;
import com.ms.userservice.userservice.VO.UserDept;
import com.ms.userservice.userservice.entity.User;
import com.ms.userservice.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        return userRepository.save(user);
    }


    public UserDept findUserWithDept(Long userId) {
        log.info("In user service : user id:"+userId);
        UserDept userDept = new UserDept();
        User user = userRepository.findById(userId).get();
        log.info("In user service : user dept id:"+user.getDeptId());

       /* Department department = restTemplate.getForObject("http://localhost:9001/departments/findDepartment/"+user.getDeptId()
        , Department.class);*/
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/findDepartment/"+user.getDeptId()
                , Department.class);
        userDept.setUser(user);
        userDept.setDept(department);
        return userDept;

    }
}