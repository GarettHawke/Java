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
public interface RelationCatalog {
    public List<Person> findParents(Person p);
    public List<Person> findChildren(Person p);
    public void makeRelation(Person parent, Person child);
    public void deleteRelation(Person parent, Person child);
}
