package com.project.projectpetsmart.modal.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "`product`")
public class Product extends BaseEntity {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "`name`")
    private String name;

    @Column(name = "`price`")
    private int price;

    @Column(name = "`image`")
    private String image;

    @Enumerated(EnumType.STRING)
    @Column(name = "`category`")
    private Category category;

    @Column(name = "`description`")
    private String description;
}
