package com.csaba79coder.bookandauthor.base.domain;

import com.csaba79coder.bookandauthor.base.Identifier;
import com.csaba79coder.bookandauthor.base.value.Availability;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "book")
@RequiredArgsConstructor
public class Book extends Identifier {

    @Column(name = "title", nullable = false)
    private String title;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Availability availability = Availability.AVAILABLE;
}
