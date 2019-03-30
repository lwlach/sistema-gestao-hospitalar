package br.com.codenation.hospital.controller;

import br.com.codenation.hospital.entity.Hospital;
import br.com.codenation.hospital.repository.HospitalRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HospitalController {

    private HospitalRepository repository;

    @GetMapping("/hospital")
    public List<Hospital> all(){
        return repository.findAll();
    }
}
