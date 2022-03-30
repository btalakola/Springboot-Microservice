package com.ms.userservice.userservice.VO;

import com.ms.userservice.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDept {

    private User user;
    private Department dept;

}
