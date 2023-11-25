package com.seguros.apibackendseguros.service;

import com.seguros.apibackendseguros.models.VehiculoModels;
import com.seguros.apibackendseguros.repositories.IVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VehiculoServise {
    @Autowired
    private IVehiculo iVehiculo;
    public ArrayList<VehiculoModels> obtenerVehiculos(){
        return (ArrayList<VehiculoModels>) iVehiculo.findAll();
    }
}
