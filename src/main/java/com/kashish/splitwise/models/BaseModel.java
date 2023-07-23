package com.kashish.splitwise.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.repository.Temporal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Date;

import static javax.persistence.TemporalType.TIMESTAMP;

@Getter
@Setter
@MappedSuperclass
public class BaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreatedDate
   @javax.persistence.Temporal(TIMESTAMP)
    private Date createdAt;

    @LastModifiedDate
    @javax.persistence.Temporal(TIMESTAMP)
    private Date lastModifiedAt;
}
