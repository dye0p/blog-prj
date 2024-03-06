package com.dyeop.blog.damain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

@Getter
@MappedSuperclass
public abstract class BaseEntity {

    @Column(name = "create_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "modified_date")
    @LastModifiedBy
    private String modifiedDate;
}
