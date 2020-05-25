package com.mcb.creditfactory.dto;


import com.fasterxml.jackson.annotation.JsonTypeName;
import com.mcb.creditfactory.external.CollateralType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeName("airplane")
public class AirplaneDto implements Collateral {
    private Long id;
    private String brand;
    private String model;
    private String manufacturer;
    private Short year;
    private BigDecimal value;
    private Integer place;

    @Override
    public LocalDate getDate() {
        return LocalDate.now ( );
    }

    @Override
    public CollateralType getType() {
        return CollateralType.AIRPLANE;
    }
}
