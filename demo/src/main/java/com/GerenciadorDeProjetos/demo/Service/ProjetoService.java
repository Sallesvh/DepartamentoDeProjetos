package com.GerenciadorDeProjetos.demo.Service;
//Comit Servicee
import com.GerenciadorDeProjetos.demo.Model.ProjetoModel;
import com.GerenciadorDeProjetos.demo.Repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjetoService {
    @Autowired
    private ProjetoRepository repository;

    public ProjetoModel Criar(ProjetoModel projetomodel ){
        return repository.save(projetomodel);
    }

    public List<ProjetoModel> Listar(){
        return repository.findAll();
    }
    public Optional <ProjetoModel> BuscarId(Long id){
        return repository.findById(id);
    }
    public void deletar(Long id){
        repository.deleteById(id);
    }
}