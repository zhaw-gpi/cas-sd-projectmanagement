package ch.zhaw.iwi.sd.rest.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.iwi.sd.rest.entities.Mitarbeiter;
import ch.zhaw.iwi.sd.rest.repositories.MitarbeiterRepository;

/**
 * MitarbeiterRestController
 */
@RestController
@CrossOrigin
public class MitarbeiterRestController {

    @Autowired
    private MitarbeiterRepository mitarbeiterRepository;

    @GetMapping(value = "/pmapi/v1/mitarbeiter")
    public ResponseEntity<List<Mitarbeiter>> getMitarbeiterListe() {
        Sort sort = Sort.by("name");

        List<Mitarbeiter> mitarbeiter = mitarbeiterRepository.findAll(sort);
        ResponseEntity<List<Mitarbeiter>> response = new ResponseEntity<>(mitarbeiter, HttpStatus.OK);
        return response;
    }
}