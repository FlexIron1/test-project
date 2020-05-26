package com.mcb.creditfactory.service.car;

import com.mcb.creditfactory.dto.CarDto;
import com.mcb.creditfactory.external.CollateralObject;
import com.mcb.creditfactory.external.CollateralType;
import com.mcb.creditfactory.model.Value;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;


public class CarAdapter implements CollateralObject {
    private CarDto car;
    Value value;

    public CarAdapter() {
    }

    public CarAdapter( CarDto car ) {
        this.car = car;
    }

    @Override
    public BigDecimal getValue() {
        return value.getValues();
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
