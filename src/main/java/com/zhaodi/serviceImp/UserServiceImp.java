package com.zhaodi.serviceImp;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhaodi.service.UserService;
@Service
public class UserServiceImp implements UserService {
    public String getName() {
        return "heimaniubi";
    }
}
