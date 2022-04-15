package br.com.projetoAgenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoAgenda.model.Pessoa;

public interface AgendaRepository extends JpaRepository<Pessoa, Long >{

}
