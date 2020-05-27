package com.mcb.creditfactory.service.car;

import com.mcb.creditfactory.dto.CarDto;
import com.mcb.creditfactory.external.CollateralObject;
import com.mcb.creditfactory.external.CollateralType;

import java.math.BigDecimal;
import java.time.LocalDate;


public class CarAdapter implements CollateralObject {
    private CarDto car;


    CarAdapter(CarDto car) {
        this.car = car;
    }

    @Override
    public BigDecimal getValue() {
        return  car.getValue().iterator().next();
    }

    @Override
    public Short getYear() {
        return car.getYear();
    }

    @Override
    public LocalDate getDate() {
        // Для автомобилей дата оценки не используется, поэтому всегда берем текущую
        return LocalDate.now();
    }

    @Override
    public CollateralType getType() {
        return CollateralType.CAR;
    }
}
