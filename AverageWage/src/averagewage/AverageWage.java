/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagewage;

import java.io.InputStream;
import java.net.URL;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.TreeSet;

/**
 *
 * @author Peter
 */
public class AverageWage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet<Person> people = new TreeSet<>();
        
        long totalWage = 0;
        long totalPeople = 0;
        
        try (InputStream ins = new URL("http://acrab.ics.muni.cz/~makub/soubor.txt").openStream()) {
            try(BufferedReader in = new BufferedReader(new InputStreamReader(ins, "utf-8"))) {
                String line;
                while ((line = in.readLine()) != null) {
                    String[] tmp = line.split(";");
                    Person p = new Person();
                    p.setName(tmp[0]);
                    p.setAge(Integer.parseInt(tmp[1]));
                    String[] wageTmp = tmp[2].split(",");
                    int sumWage = 0;
                    for (String wage : wageTmp) {
                        sumWage += Integer.parseInt(wage);
                    }
                    p.setWage(sumWage);
                    
                    totalWage += sumWage;
                    totalPeople++;
                    
                    people.add(p);
                }
            } catch(Exception ex) {
                System.out.println("Error!");
            }
        } catch(Exception ex) {
            System.out.println("Error!");
        }
        
        double averageWage = (double) totalWage / totalPeople;
        
        for(Person p : people) {
            if(p.getWage() >= averageWage)
                System.out.println(p.getName() + " - " + p.getAge() + " - " + p.getWage());
            else
                break;
        }
    }
    
}
