package br.com.delfino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.delfino.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
