package com.example.intelligent_rostering_system.controller;

import com.example.intelligent_rostering_system.entity.Lxp;
import com.example.intelligent_rostering_system.service.LxpService;
import com.example.intelligent_rostering_system.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/lxp")
@CrossOrigin
public class LxpController extends BaseController{
    @Autowired
    private LxpService lxpService;
    @GetMapping("getLxpById")
    public JsonResult<Lxp> getLxpById(Integer id){
        Lxp lxp = lxpService.getLxpById(id);
        String message = "信息";
        return new JsonResult<Lxp>(OK, message, lxp);
    }
}
