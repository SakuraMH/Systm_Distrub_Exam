package org.sdia.immatriculation.Repository;
import org.sdia.immatriculation.Entities.Proprietaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public
interface ProprietaireRepository extends JpaRepository<Proprietaire,Long> {}