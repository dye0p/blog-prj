package com.dyeop.blog.damain;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;

@Getter
@MappedSuperclass
public abstract class BaseEntity {//공통 매핑 정보

    @Column(name = "create_date")
    @CreatedDate
    private String createdDate;

    @Column(name = "modified_date")
    @LastModifiedBy
    private String modifiedDate;
}
