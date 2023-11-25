package com.seguros.apibackendseguros.service;

import com.seguros.apibackendseguros.models.PolizaModels;
import com.seguros.apibackendseguros.repositories.IPoliza;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.datatransfer.DataFlavor;
import java.util.ArrayList;

@Service
public class PolizaServise {

    @Autowired
    private IPoliza poliza;
    @PersistenceContext
    private EntityManager em ;

    public ArrayList<PolizaModels> getPolizas(String num_poliza){

        EntityManager entityManager;
        Query query = em.createNativeQuery("{call obtener_poliza_por_numero(?)}", PolizaModels.class);
        query.setParameter(1, num_poliza);
        return (ArrayList<PolizaModels>) query.getResultList();
    }
}
