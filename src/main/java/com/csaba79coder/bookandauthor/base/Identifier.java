package com.csaba79coder.bookandauthor.base;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
public class Identifier {

    @GeneratedValue
    @Column(name = "id", nullable = false)
    UUID id;
}
