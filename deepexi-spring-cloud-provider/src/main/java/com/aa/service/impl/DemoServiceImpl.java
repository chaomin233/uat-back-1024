package com.aa.service.impl;

import com.aa.service.DemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello() {
        return "welcome!";
    }
}
