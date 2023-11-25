package com.seguros.apibackendseguros.repositories;


import com.seguros.apibackendseguros.models.PolizaModels;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IPoliza extends JpaRepository<PolizaModels, Long> {


    @Query(value = "{call obtener_poliza_por_numero(?)}", nativeQuery = true)
    public List<PolizaModels> getPoliza(String num_poliza);
}


