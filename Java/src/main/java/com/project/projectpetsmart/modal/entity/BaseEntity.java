package com.project.projectpetsmart.modal.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;

import java.util.Date;

@Data
@MappedSuperclass
public class BaseEntity {
    @Column(name = "created_date")
    protected Date createdDate;
    @Column(name = "updated_date")
    protected Date updatedDate;
    @Column(name = "created_by")
    protected String createdBy;
    @Column(name = "updated_by")
    protected String updatedBy;

    /**
     * Hàm này gọi khi entity được thêm mới
     */
    @PrePersist
    public void onPrepersist(){
        this.createdDate = new Date();
        this.createdBy = "Created by Nam";
    }

    /**
     * Hàm này gọi tới khi entity được update
     */
    @PreUpdate
    public void onPreUpdate(){
        this.updatedDate = new Date();
        this.updatedBy = "Updated by Nam";
    }
}
