package com.alonsopedro.projectcartolabasquete.controller;


import com.alonsopedro.projectcartolabasquete.controller.dtos.jogadorrq;
import com.alonsopedro.projectcartolabasquete.controller.dtos.jogadorrs;
import com.alonsopedro.projectcartolabasquete.models.Integrante;
import com.alonsopedro.projectcartolabasquete.repositories.IntegranteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/integrante")
public class IntegranteController {

    private final IntegranteRepository integranteRepository;

    public IntegranteController(IntegranteRepository integranteRepository){
        this.integranteRepository = integranteRepository;
    }



    @GetMapping("/")
    public List<Integrante> findAll(){
        var integrante = integranteRepository.findAll();
        return integrante
                .stream()
                .map(jogadorrs::converter)
                .collect(Collectors.toList());
    }
    @GetMapping("/{id}")
    public Integrante findById(@PathVariable("id") Long id){
        var integrante = integranteRepository.getOne(id);
        return jogadorrs.converter(integrante);
    }
    @PostMapping("/")
    public void saveintegrante( jogadorrq integrante){
        var p = new Integrante();
        p.setNome(integrante.getNome());
        p.setFuncao(integrante.getFuncao());
        p.setFranquia(integrante.getFranquia());
        integranteRepository.save(p);


    }

}