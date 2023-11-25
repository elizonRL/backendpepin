package com.seguros.apibackendseguros.models;

import com.seguros.apibackendseguros.Controller.poliza;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "vehiculo")
public class VehiculoModels
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String marca;
    private String modelo;
    private String placa;

    @ManyToMany
    private Set<PolizaModels> polizas;

    public Set<PolizaModels> getPoliza() {
        return polizas;
    }

    public void setPoliza(Set<PolizaModels> polizas) {
        this.polizas = polizas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


}
