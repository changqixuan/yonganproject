package com.yongaan.upmseurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "upms-eureka-yongan")
public interface UserService {

    @RequestMapping("userlist")
    public Object userlist();

}
