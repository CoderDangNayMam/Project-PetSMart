package com.project.projectpetsmart.modal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "`account`")

public class Account extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username",length = 50,unique = true)
    private String username;

    @Column(name = "fullname",length = 50)
    private String fullname;

    @Column(name = "`password`")
    private String password;

    @Column(name = "`email`",length = 50,unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "role")
    private Role role;

    @Column(name = "`avatar`")
    private String avatar;

    @Column(name = "`phoneNumber`")
    private int phoneNumber;

}
