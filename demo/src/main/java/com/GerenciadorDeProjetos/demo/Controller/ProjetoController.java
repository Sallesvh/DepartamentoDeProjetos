package com.GerenciadorDeProjetos.demo.Controller;


import com.GerenciadorDeProjetos.demo.Model.ProjetoModel;
import com.GerenciadorDeProjetos.demo.Service.ProjetoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
//Comit Controller
@RestController
@RequestMapping(path = "/Projeto")
public class ProjetoController {
    @Autowired
    private ProjetoService service;


    @PostMapping
    public ProjetoModel Criar (@RequestBody ProjetoModel projetoModel){
        return service.Criar(projetoModel);

    }
    @GetMapping
    public List<ProjetoModel>Listar(){
        return service.Listar();
    }

    @GetMapping("/{id}")
    public Optional <ProjetoModel> BuscarId(@PathVariable Long id){
        return service.BuscarId(id);
    }
    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id){
        service.deletar(id);
    }






}