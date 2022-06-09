package com.example.second_task2.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "description")
    private String description;

    public Product(String name, BigDecimal cost, String description) {
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

}
