package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Portfolio {

    @OneToOne
    private Client client;

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private LocalDate creationDate;
}
