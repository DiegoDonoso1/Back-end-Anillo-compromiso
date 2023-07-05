package com.grupo6.demo.repositories;

import com.grupo6.demo.entities.AnillosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnillosRepository extends JpaRepository<AnillosEntity, Long> {

}
