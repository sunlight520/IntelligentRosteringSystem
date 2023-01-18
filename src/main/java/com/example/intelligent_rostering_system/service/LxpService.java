package com.example.intelligent_rostering_system.service;

import com.example.intelligent_rostering_system.entity.Lxp;
import org.springframework.stereotype.Service;

@Service

public interface LxpService {
    Lxp getLxpById(Integer id);
}
