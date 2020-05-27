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
@Table(name = "CAR")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private Double power;

    @Column(name = "year_of_issue")
    private Short year;
    @ElementCollection(targetClass = BigDecimal.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "car_value", joinColumns = @JoinColumn(name = "car_id"))
    @Cascade({org.hibernate.annotations.CascadeType.PERSIST})
    private Set<BigDecimal> value;


}
