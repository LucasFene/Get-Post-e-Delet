package com.lucasfer.lucasfer.ClienteRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasfer.lucasfer.model.Cliente;

public interface ClienteInterface extends JpaRepository<Cliente ,Long >{

}
