package com.project.projectpetsmart.modal.entity;


import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "activeUser")
public class ActiveUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "uuid")
    private String uuid;

    @ManyToOne()
    @JoinColumn(name = "userId")
    private Account account;
}
