package com.seguros.apibackendseguros.models;

import jakarta.persistence.*;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "poliza")
public class PolizaModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String fecha_inicio;
    private String fecha_fin;
    private String prima;
    private String num_poliza;
    private String tipo_poliza;

    public String getTipo_poliza() {
        return tipo_poliza;
    }

    public void setTipo_poliza(String tipo_poliza) {
        this.tipo_poliza = tipo_poliza;
    }

    public String getNum_poliza() {
        return num_poliza;
    }

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private ClienteModels cliente;

    @ManyToMany
    @JoinTable(name = "poliza_Vehiculo",
            joinColumns = @JoinColumn(name = "poliza_id"),
            inverseJoinColumns = @JoinColumn(name = "vehiculo_id"))
    private Set<VehiculoModels> vehiculos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getPrima() {
        return prima;
    }

    public void setPrima(String prima) {
        this.prima = prima;
    }

    public ClienteModels getCliente() {
        return cliente;
    }

    public void setCliente(ClienteModels cliente) {
        this.cliente = cliente;
    }



    public Set<VehiculoModels> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Set<VehiculoModels> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
