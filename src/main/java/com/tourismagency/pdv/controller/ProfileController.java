package com.tourismagency.pdv.controller;

import com.tourismagency.pdv.dto.ResponseDTO;
import com.tourismagency.pdv.entity.CustomerProfile;
import com.tourismagency.pdv.repository.ProfileRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customerprofile")
public class ProfileController {

    private ProfileRepository profileRepository;

    public ProfileController(@Autowired ProfileRepository profileRepository){
        this.profileRepository = profileRepository;
    }

    @GetMapping()
    public ResponseEntity getAll(){
        return new ResponseEntity<>(profileRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity post(@Valid @RequestBody CustomerProfile customerProfile){
        try{
            return new ResponseEntity<>(profileRepository.save(customerProfile), HttpStatus.CREATED);
        }catch(Exception error){
            return new ResponseEntity<>(new ResponseDTO(error.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping
    public ResponseEntity put(@Valid @RequestBody CustomerProfile customerProfile){
        try{
            return new ResponseEntity<>(profileRepository.save(customerProfile), HttpStatus.OK);
        }catch(Exception error){
            return new ResponseEntity<>(new ResponseDTO(error.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable long id){
        try{
            profileRepository.deleteById(id);
            return new ResponseEntity<>(new ResponseDTO("Perfil de Cliente excluído com sucesso!"), HttpStatus.OK);
        }catch(Exception error){
            return new ResponseEntity<>(new ResponseDTO(error.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

