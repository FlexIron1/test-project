package com.mcb.creditfactory.service.airplane;

import com.mcb.creditfactory.dto.AirplaneDto;
import com.mcb.creditfactory.external.ExternalApproveService;
import com.mcb.creditfactory.model.Airplane;
import com.mcb.creditfactory.repository.AirplaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//import com.mcb.creditfactory.external.ExternalApproveService;


@Service
public class AirplaneServiceImpl implements AirplaneService {

    @Autowired
    AirplaneRepository airplaneRepository;
    @Autowired
    private ExternalApproveService approveService;

    @Override
    public boolean approve(AirplaneDto airplaneDto) {
        return approveService.approve(new AirplaneAdapter(airplaneDto)) == 0;
    }

    @Override
    public Airplane save( Airplane airplane ) {
        return airplaneRepository.save ( airplane );
    }

    @Override
    public Optional<Airplane> load( Long id ) {
        return airplaneRepository.findById ( id );
    }

    @Override
    public Airplane fromDto( AirplaneDto dto ) {
        return new Airplane (
                dto.getId ( ) ,
                dto.getBrand ( ) ,
                dto.getModel ( ) ,
                dto.getManufacturer ( ) ,
                dto.getYear ( ) ,
                dto.getFuelCapacity(),
                dto.getPlace(),
                dto.getValue()

        );
    }

    @Override
    public AirplaneDto toDTO( Airplane airplane ) {
        return new AirplaneDto (
                airplane.getId ( ) ,
                airplane.getBrand ( ) ,
                airplane.getModel ( ) ,
                airplane.getManufacturer ( ) ,
                airplane.getYear ( ) ,
                airplane.getFuelCapacity(),
                airplane.getPlace(),
                airplane.getValue()

        );
    }

    @Override
    public Long getId( Airplane airplane ) {
        return airplane.getId ( );
    }
}
