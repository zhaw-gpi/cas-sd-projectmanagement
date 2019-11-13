package ch.zhaw.iwi.sd.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ch.zhaw.iwi.sd.rest.entities.Mitarbeiter;

/**
 * MitarbeiterRepository
 */
public interface MitarbeiterRepository extends JpaRepository<Mitarbeiter, Integer> {

    
}