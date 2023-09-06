package com.webthuenha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "oder")
public class Oder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String dateStart;

    @Column(nullable = false)
    private double totalPrice;

    @Column(nullable = false)
    private int numberOfMonths;

    @ManyToOne
    private Account account;

    @Column(nullable = false)
    private double presentPrice;

    @ManyToOne
    private Room room;

}
