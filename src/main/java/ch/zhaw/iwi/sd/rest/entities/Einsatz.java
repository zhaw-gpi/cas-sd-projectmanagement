package ch.zhaw.iwi.sd.rest.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Einsatz
 */
@Entity
public class Einsatz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Mitarbeiter mitarbeiter;
    @ManyToOne
    private Projekt projekt;
    @Temporal(TemporalType.DATE)
    private Date einsatzStart;
    @Temporal(TemporalType.DATE)
    private Date einsatzEnde;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public void setMitarbeiter(Mitarbeiter mitarbeiter) {
        this.mitarbeiter = mitarbeiter;
    }

    public Projekt getProjekt() {
        return projekt;
    }

    public void setProjekt(Projekt projekt) {
        this.projekt = projekt;
    }

    public Date getEinsatzStart() {
        return einsatzStart;
    }

    public void setEinsatzStart(Date einsatzStart) {
        this.einsatzStart = einsatzStart;
    }

    public Date getEinsatzEnde() {
        return einsatzEnde;
    }

    public void setEinsatzEnde(Date einsatzEnde) {
        this.einsatzEnde = einsatzEnde;
    }
    
    
}