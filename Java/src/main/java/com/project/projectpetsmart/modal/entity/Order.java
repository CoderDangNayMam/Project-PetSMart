package com.project.projectpetsmart.modal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "`order`")
public class Order extends BaseEntity{

    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "`quantity`")
    private int quantity;

    @Column(name = "`totalPrice`")
    private int totalPrice;

    @ManyToOne
    @Column(name = "`accountId`")
    private Account account;

    @ManyToOne
    @Column(name = "`accountId`")
    private Product product;

    @Column(name = "`status`")
    private Status status;
}
