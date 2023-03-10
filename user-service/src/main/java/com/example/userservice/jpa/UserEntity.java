package com.example.userservice.jpa;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String encryptedPwd;
}
