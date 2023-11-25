package com.seguros.apibackendseguros.repositories;

import com.seguros.apibackendseguros.models.VehiculoModels;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehiculo extends JpaRepository<VehiculoModels, Long> {
}
