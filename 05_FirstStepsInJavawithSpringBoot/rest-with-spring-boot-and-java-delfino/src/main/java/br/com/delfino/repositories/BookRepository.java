package br.com.delfino.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.delfino.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
