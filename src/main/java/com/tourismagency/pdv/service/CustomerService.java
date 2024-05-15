package com.tourismagency.pdv.service;

import com.tourismagency.pdv.dto.CustomerDTO;
import com.tourismagency.pdv.entity.Customer;
import com.tourismagency.pdv.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    private ModelMapper mapper = new ModelMapper();

    public List<CustomerDTO> findAll(){
        return customerRepository.findAll().stream().map(customer ->
                new CustomerDTO(customer.getId(),
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
                                customer.getObservation())).collect(Collectors.toList());
    }

    public CustomerDTO save(CustomerDTO customer){
        Customer customerToSave = mapper.map(customer, Customer.class);
        customerRepository.save(customerToSave);
        return new CustomerDTO(customerToSave.getId(),
                               customerToSave.getName(),
                               customerToSave.getBirtDate(),
                               customerToSave.getIdEnrollment(),
                               customerToSave.getEnrollmentNumber(),
                               customerToSave.getRgNumber(),
                               customerToSave.getProfile(),
                               customerToSave.getPhoneNumber(),
                               customerToSave.getCellNumber(),
                               customerToSave.getEmail(),
                               customerToSave.getAddress(),
                               customerToSave.getAddressNumber(),
                               customerToSave.getNeighborhood(),
                               customerToSave.getZipCode(),
                               customerToSave.getCity(),
                               customerToSave.getState(),
                               customerToSave.getCountry(),
                               customerToSave.getProfession(),
                               customerToSave.getSex(),
                               customerToSave.getPassport(),
                               customerToSave.getPassportValidity(),
                               customerToSave.getObservation());
    }
}
