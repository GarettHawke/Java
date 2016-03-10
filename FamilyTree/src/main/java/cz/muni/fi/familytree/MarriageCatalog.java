/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.muni.fi.familytree;

import java.util.List;

/**
 *
 * @author Peter
 */
public interface MarriageCatalog {
    public void createMarriage(Marriage marriage, Person spouse1, Person spouse2);
    public void updateMarriage(Marriage marriage);
    public void deleteMarriage(Marriage marriage);
    public Marriage findMarriageById(Long id);
    public Marriage findCurrentMarriageOfPerson(Person p);
    public List<Marriage> findMarriagesOfPerson(Person p);
    public List<Marriage> findAllMarriage();
}
