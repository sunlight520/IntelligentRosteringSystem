package com.example.intelligent_rostering_system.service.impl;

import com.example.intelligent_rostering_system.dao.LxpRepository;
import com.example.intelligent_rostering_system.entity.Lxp;
import com.example.intelligent_rostering_system.service.LxpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LxpServiceImpl implements LxpService {
    @Autowired
    LxpRepository lxpRepository;
    @Override
    public Lxp getLxpById(Integer id){
        return lxpRepository.getLxpById(id);
    }
}
