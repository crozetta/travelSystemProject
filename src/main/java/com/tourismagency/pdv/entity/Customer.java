package com.tourismagency.pdv.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 100, nullable = false)
    @NotBlank(message = "O campo nome é obrigatório")
    private String name;

    @Column(name = "birthdate")
    private LocalDate birtDate;

    @NotBlank(message = "O campo tipo de inscrição é obrigatório")
    @Column(name = "enrollment_type")
    private long idEnrollment;

    @NotBlank(message = "O campo inscrição é obrigatório")
    @Column(name = "registration_number")
    private Long EnrollmentNumber;

    @Column(name = "rg_number")
    private Long rgNumber;

    @OneToOne(mappedBy = "customer_profile")
    @Column(name = "id_profile")
    private Long profile;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @NotBlank(message = "O campo número do celular é obrigatório")
    @Column(name = "cell_number")
    private Long cellNumber;

    @Column(length = 100, name = "email")
    private String email;

    @Column(length = 150, name = "address")
    private String address;

    @Column(name = "address_number")
    private Integer addressNumber;

    @Column(length = 70, name = "neighborhood")
    private String neighborhood;

    @Column(length = 10, name = "zip_code")
    private String zipCode;

    @Column(name = "id_city" )
    private Integer city;

    @Column(name = "id_state" )
    private Integer state;

    @Column(name = "id_country" )
    private Integer country;

    @Column(length = 70, name = "profession")
    private String profession;

    @Column(name = "sex")
    private Character sex;

    @Column(length = 8, name = "passport_number")
    private String passport;

    @Column(name = "passport_validity")
    private Date passportValidity;

    @Column(length = 300, name = "observation")
    private String observation;
}
