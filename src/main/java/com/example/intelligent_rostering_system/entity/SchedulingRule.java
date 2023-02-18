package com.example.intelligent_rostering_system.entity;

import com.example.intelligent_rostering_system.util.JsonResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "SchedulingRule")
public class SchedulingRule {
    @Column(name = "ruleType", nullable = false,unique = false)
    private String ruleType;
    @Id
    @Column(name = "shop", nullable = true,unique = false)
    private String shop;
    @Column(name = "ruleValue", nullable = false,unique = false)
    private String ruleValue;
}
