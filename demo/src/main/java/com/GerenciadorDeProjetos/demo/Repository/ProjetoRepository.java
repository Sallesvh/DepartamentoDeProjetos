package com.GerenciadorDeProjetos.demo.Repository;
//Comit Repository
import com.GerenciadorDeProjetos.demo.Model.ProjetoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository <ProjetoModel, Long> {
}