package com.example.intelligent_rostering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "empPreference")
public class EmpPreference {
    @Column(name = "prefTyp", nullable = true,unique = false)
    private String prefTyp;
    @Id
    @Column(name = "employee", nullable = true,unique = false)
    private String employee;
    @Column(name = "prefDayVal", nullable = true,unique = false)
//    工作日偏好值
    private String prefDVal;
//    工作时间偏好值
    @Column(name = "prefTVal", nullable = true,unique = false)
    private String prefTVal;
/*
    拓展部分:工作时长偏好值
    @Column(name = "prefDuVal", nullable = true,unique = false)
    private String prefDuVal;
*/
}
