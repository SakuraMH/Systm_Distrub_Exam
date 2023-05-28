package org.sdia.Radar.Repository;

import org.sdia.Radar.Entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface radarRepository extends JpaRepository<Radar,Long> {
}
