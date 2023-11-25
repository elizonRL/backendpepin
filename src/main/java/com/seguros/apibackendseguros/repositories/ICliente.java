package com.seguros.apibackendseguros.repositories;


import com.seguros.apibackendseguros.models.ClienteModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ICliente extends JpaRepository<ClienteModels, Long> {

}
