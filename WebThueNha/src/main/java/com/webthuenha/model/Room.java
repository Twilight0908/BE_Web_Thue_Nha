package com.webthuenha.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "room")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


//    @Column
//    private String title;
    // tao thuoc tinh title kieu text khong phai kieu varchar
    @Column(columnDefinition = "TEXT")
    private String title;
//    @Column
//    private double square;
    // tao truong xet rang buoc not null cho square
    @Column(nullable = false)
    private double square;

    @Column(nullable = false)
    private int numberOfRooms;

    @Column(nullable = false)
    private int numberOfWcRooms;

    @Column(nullable = false)
    private double price;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String imageMain;

    @Column(nullable = false)
    private String status;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String detail;

    @Column(nullable = false)
    private String address;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Area area;
}
