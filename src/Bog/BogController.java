/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Bog;

import Bog.Model.*;

import java.util.Random;

public class BogController {
    Bibliotek bib = new Bibliotek();

    public BogController(){
        System.out.println("\n### Bog opgave ###");
    }

    public void addSampleBooks(){
        System.out.println("# Opret bøger #");
        Bog bog1 = new Bog(12121212,"Bog 1", 1994);
        System.out.println(bog1);
        Bog bog2 = new Bog(12121214,"Bog 2", 1940);
        System.out.println(bog2);
        Bog bog3 = new Bog(12121212,"Bog 3", 1993); //Fejler pga. ISBN nummer allerede findes
        System.out.println(bog3);
        Bog bog4 = new Bog(12121215,"Bog 4", 2006);
        System.out.println(bog4);
        Bog bog5 = new Bog(12121216,"Bog 5", 1964);
        System.out.println(bog5+"\n");


        System.out.println("# Tilføj bøger #");
        bib.addBog(bog1);
        bib.addBog(bog2);
        bib.addBog(bog3);
        bib.addBog(bog4);
        bib.addBog(bog5);
        System.out.println(bib.countBooks() + " bøger tilføjet.\n");

        System.out.println("# Find bøger #");
        if(bib.findBook(bog2)){
            System.out.println("Bog fundet");
            System.out.println(bog2);
        }
    }
}