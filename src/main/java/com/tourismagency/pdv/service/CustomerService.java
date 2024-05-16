package com.tourismagency.pdv.service;

import com.tourismagency.pdv.dto.CustomerDTO;
import com.tourismagency.pdv.entity.Customer;
import com.tourismagency.pdv.mapper.CustomerMapper;
import com.tourismagency.pdv.repository.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper customerMapper;
    private ModelMapper mapper = new ModelMapper();

    public List<CustomerDTO> findAll(){
        return customerRepository.findAll().stream().map(customer ->
                customerMapper.customerToDTO(customer)).collect(Collectors.toList());
    }

    public CustomerDTO save(CustomerDTO customer){
        Customer customerToSave = mapper.map(customer, Customer.class);
        customerRepository.save(customerToSave);
        return customerMapper.customerToDTO(customerToSave);
    }
}
