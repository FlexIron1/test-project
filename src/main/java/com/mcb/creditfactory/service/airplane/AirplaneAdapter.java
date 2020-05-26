package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirplaneDto;
import com.mcb.creditfactory.external.CollateralObject;
import com.mcb.creditfactory.external.CollateralType;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
public class AirplaneAdapter implements CollateralObject {

    @Autowired
    AirplaneDto airplaneDto;


    @Override
    public BigDecimal getValue() {
        return airplaneDto.getValue().iterator().next();
    }

    @Override
    public Short getYear() {
        return airplaneDto.getYear();
    }

    @Override
    public LocalDate getDate() {
        return LocalDate.now();
    }

    @Override
    public CollateralType getType() {
        return CollateralType.AIRPLANE;
    }
}
