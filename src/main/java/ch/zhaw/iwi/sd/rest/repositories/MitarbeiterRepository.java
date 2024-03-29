package ch.zhaw.iwi.sd.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ch.zhaw.iwi.sd.rest.entities.Mitarbeiter;

/**
 * MitarbeiterRepository
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "mitarbeiter", path = "mitarbeiter")
public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Integer> {

    
}