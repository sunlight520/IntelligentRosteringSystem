package com.example.intelligent_rostering_system.service.ex;

import org.hibernate.service.spi.ServiceException;

public class taiPang extends ServiceException {

    public taiPang(String message, Throwable root) {
        super(message, root);
    }

    public taiPang(String message) {
        super(message);
    }

}
