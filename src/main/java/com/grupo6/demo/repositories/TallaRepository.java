package com.grupo6.demo.repositories;

import com.grupo6.demo.entities.TallaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TallaRepository extends JpaRepository<TallaEntity, Long> {
}
