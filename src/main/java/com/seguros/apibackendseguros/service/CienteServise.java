package com.seguros.apibackendseguros.service;

import com.seguros.apibackendseguros.models.ClienteModels;
import com.seguros.apibackendseguros.repositories.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CienteServise {
    @Autowired
    ICliente iCliente;
    public ArrayList<ClienteModels> obtenerClientes(){
        return (ArrayList<ClienteModels>) iCliente.findAll();
    }
}
