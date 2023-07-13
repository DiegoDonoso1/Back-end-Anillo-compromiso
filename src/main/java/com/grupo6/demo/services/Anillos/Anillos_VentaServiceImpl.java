package com.grupo6.demo.services.Anillos;

import com.grupo6.demo.repositories.AnillosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Anillos_VentaServiceImpl implements Anillos_VentaService{

    @Autowired
    AnillosRepository anillosRepository;


}
