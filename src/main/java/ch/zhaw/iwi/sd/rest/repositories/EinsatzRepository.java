package ch.zhaw.iwi.sd.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ch.zhaw.iwi.sd.rest.entities.Einsatz;

/**
 * EinsatzRepository
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "einsatz", path = "einsaetze")
public interface EinsatzRepository extends JpaRepository<Einsatz, Integer> {

    
}