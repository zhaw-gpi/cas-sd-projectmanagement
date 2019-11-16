package ch.zhaw.iwi.sd.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import ch.zhaw.iwi.sd.rest.entities.Projekt;

/**
 * ProjektRepository
 */
@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "projekt", path = "projekte")
public interface ProjektRepository extends JpaRepository<Projekt, Integer> {

    
}