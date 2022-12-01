package com.sonobom.websonobom.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sonobom.websonobom.entities.Box;
import com.sonobom.websonobom.entities.Filtro;

public interface FiltroRepository extends JpaRepository<Filtro , Long> {

}
