package com.tourismagency.pdv.controller;

import com.tourismagency.pdv.dto.CustomerDTO;
import com.tourismagency.pdv.dto.ResponseDTO;
import com.tourismagency.pdv.entity.Customer;
import com.tourismagency.pdv.repository.CustomerRepository;
import com.tourismagency.pdv.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(@Autowired CustomerService customerService){
        this.customerService = customerService;
    }

    @GetMapping()
    public ResponseEntity getall() {

        return new ResponseEntity<>(customerService.findAll(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity post(@Valid @RequestBody CustomerDTO customer){
        try{
            return new ResponseEntity<>(customerService.save(customer), HttpStatus.CREATED);
        }catch (Exception error){
            return new ResponseEntity<>(new ResponseDTO(error.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
