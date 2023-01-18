package com.example.intelligent_rostering_system.dao;

import com.example.intelligent_rostering_system.entity.Lxp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "lxpRepository")

public interface LxpRepository extends JpaRepository<Lxp,Integer> {
    Lxp getLxpById(Integer id);
}
