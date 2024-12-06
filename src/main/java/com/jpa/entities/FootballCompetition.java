package com.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FootballCompetition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "names", columnDefinition = "VARCHAR(300)")
    private  String name;

    @Column(name = "Cuantity_Price")
    private  Integer cuantityPrice;

    @Column(name = "start_date", columnDefinition = "DATE")
    private  String startDate;

    @Column(name = "end_date", columnDefinition = "DATE")
    private  String endDate;
}






