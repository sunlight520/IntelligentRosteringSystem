package com.example.intelligent_rostering_system.entity;

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
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "id", nullable = false,unique = true)
    private String id;
    @Column (name = "name", nullable = false,unique = false)
    private String name;
    @Column (name = "mail", nullable = false,unique = true)
    private String mail;
    @Column (name = "position", nullable = false,unique = false)
    private String position;
    @Column (name = "shop", nullable = false,unique = false)
    private String shop;
}
