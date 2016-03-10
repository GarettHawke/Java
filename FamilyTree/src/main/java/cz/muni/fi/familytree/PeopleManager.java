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
public interface PeopleManager {
    public void createPerson(Person p);
    public void updatePerson(Person p);
    public void deletePerson(Person p);
    public Person findPersonById(Long id);
    public List<Person> findAllPeople();
}
