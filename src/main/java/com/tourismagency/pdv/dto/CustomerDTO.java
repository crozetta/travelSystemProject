package com.tourismagency.pdv.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private long id;
    private String name;
    private LocalDate birtDate;
    private long idEnrollment;
    private Long EnrollmentNumber;
    private Long rgNumber;
    private Long profile;
    private Long phoneNumber;
    private Long cellNumber;
    private String email;
    private String address;
    private Integer addressNumber;
    private String neighborhood;
    private String zipCode;
    private Integer city;
    private Integer state;
    private Integer country;
    private String profession;
    private Character sex;
    private String passport;
    private Date passportValidity;
    private String observation;
}
