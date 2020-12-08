package com.YenyContreras.SpringDataJpaServer1.DAO;

import org.springframework.data.repository.CrudRepository;

import com.YenyContreras.SpringDataJpaServer1.Entidades.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}
