package org.sdia.immatriculation.Repository;

import org.sdia.immatriculation.Entities.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
public interface VehiculeRepository extends JpaRepository<Vehicule,Long> {
    Optional<Vehicule> findByMat(String mat);
}
