package com.csaba79coder.bookandauthor.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jdk.jfr.Timestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
public class Auditable extends Identifier {

    @Column(name = "created_by", nullable = false)
    UUID createdBy;

    @Column(name = "updated_by", nullable = false)
    UUID updatedBy;

    @Timestamp
    @Column(name = "creation_time", nullable = false)
    LocalDateTime createdAt = LocalDateTime.now();

    @Timestamp
    @Column(name = "updated_time", nullable = false)
    LocalDateTime updatedAt = LocalDateTime.now();
}
