/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.familytree;

import java.time.LocalDate;

/**
 *
 * @author Peter
 */
public class Marriage {
    private Long id;
    private LocalDate from;
    private LocalDate to;
    private Person spouse1;
    private Person spouse2;

    public Marriage() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public Person getSpouse1() {
        return spouse1;
    }

    public void setSpouse1(Person spouse1) {
        this.spouse1 = spouse1;
    }

    public Person getSpouse2() {
        return spouse2;
    }

    public void setSpouse2(Person spouse2) {
        this.spouse2 = spouse2;
    }
    
    
}
