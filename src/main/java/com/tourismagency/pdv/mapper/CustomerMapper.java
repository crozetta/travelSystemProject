package com.tourismagency.pdv.mapper;

import com.tourismagency.pdv.dto.CustomerDTO;
import com.tourismagency.pdv.entity.Customer;
import org.modelmapper.ModelMapper;

import java.util.stream.Collectors;

import java.util.stream.Collectors;

public class CustomerMapper {

    private ModelMapper mapper = new ModelMapper();

    public CustomerDTO customerToDTO(Customer customer){
        return new CustomerDTO(customer.getId(),
                customer.getName(),
                customer.getBirtDate(),
                customer.getIdEnrollment(),
                customer.getEnrollmentNumber(),
                customer.getRgNumber(),
                customer.getProfile(),
                customer.getPhoneNumber(),
                customer.getCellNumber(),
                customer.getEmail(),
                customer.getAddress(),
                customer.getAddressNumber(),
                customer.getNeighborhood(),
                customer.getZipCode(),
                customer.getCity(),
                customer.getState(),
                customer.getCountry(),
                customer.getProfession(),
                customer.getSex(),
                customer.getPassport(),
                customer.getPassportValidity(),
                customer.getObservation());
    }
}
