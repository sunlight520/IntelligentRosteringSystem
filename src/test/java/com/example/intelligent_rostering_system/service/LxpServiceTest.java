package com.example.intelligent_rostering_system.service;

import com.example.intelligent_rostering_system.entity.Lxp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class LxpServiceTest {
    @Autowired
    LxpService lxpService;
    @Test
    public void getLxpById(){
        Lxp lxp = lxpService.getLxpById(1);
        System.out.println(lxp.getPangBaoBei());
    }
}
