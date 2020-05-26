package com.mcb.creditfactory.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mcb.creditfactory.external.CollateralType;
import com.mcb.creditfactory.model.Value;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("car")
public class CarDto implements Collateral  {
    private Long id;
    private String brand;
    private String model;
    private Double power;
    private Short year;
    private Set<BigDecimal> value;


}
