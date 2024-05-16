package com.tourismagency.pdv.mapper;

import com.tourismagency.pdv.dto.CustomerDTO;
import com.tourismagency.pdv.entity.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerMapper {

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

    public Customer mapToCustomer(CustomerDTO customerDTO){
        return new Customer(customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getBirtDate(),
                customerDTO.getIdEnrollment(),
                customerDTO.getEnrollmentNumber(),
                customerDTO.getRgNumber(),
                customerDTO.getProfile(),
                customerDTO.getPhoneNumber(),
                customerDTO.getCellNumber(),
                customerDTO.getEmail(),
                customerDTO.getAddress(),
                customerDTO.getAddressNumber(),
                customerDTO.getNeighborhood(),
                customerDTO.getZipCode(),
                customerDTO.getCity(),
                customerDTO.getState(),
                customerDTO.getCountry(),
                customerDTO.getProfession(),
                customerDTO.getSex(),
                customerDTO.getPassport(),
                customerDTO.getPassportValidity(),
                customerDTO.getObservation());
    }
}
