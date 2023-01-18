package com.example.intelligent_rostering_system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Table(name = "shop")
public class Shop {
    @Id
    @Column (name = "id", nullable = false,unique = true)
    private String id;
    @Column (name = "name", nullable = false,unique = false)
    private String name;
    @Column (name = "address", nullable = true,unique = false)
    private String address;
    @Column (name = "size", nullable = false,unique = false)
    private float size;
}
