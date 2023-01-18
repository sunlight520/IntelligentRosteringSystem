package com.example.intelligent_rostering_system.controller;

import com.example.intelligent_rostering_system.service.ex.taiPang;
import com.example.intelligent_rostering_system.util.JsonResult;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.hibernate.service.spi.ServiceException;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {
    public static final int OK = 200;
    @ExceptionHandler({ServiceException.class, FileUploadException.class})
    public JsonResult<Void> handleException(Throwable e) {
        JsonResult<Void> result = new JsonResult<Void>(e);
        if (e instanceof taiPang) {
            result.setState(4000);
        } else {
            result.setState(4001);
        }
        return result;
    }
}
