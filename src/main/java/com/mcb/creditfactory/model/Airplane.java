package com.mcb.creditfactory.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AIRPLANE")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String manufacturer;
    @Column(name = "year_of_issue")
    private Short year;
    @Column(name = "fuel_capacity")
    private Integer fuelCapacity;
    private Integer place;
    @ElementCollection(targetClass = BigDecimal.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "airplane_value", joinColumns = @JoinColumn(name = "airplane_id"))
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST})
    private Set<BigDecimal> value;
}


