/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Bog.Model;

import java.util.ArrayList;

public class Bibliotek {
    private final ArrayList<Bog> boeger = new ArrayList();

    public Bibliotek(){
    }

    public boolean addBog(Bog bog) {
        if(!boeger.contains(bog)){ //Hvis bogens ISBN ikke findes, tilføjes den.
            boeger.add(bog);
            return true;
        } else {
            System.out.println(bog.getTitel() + " findes allerede.");
            return false;
        }
    }

    public boolean findBook(Bog bog){
        for(Bog b:boeger){
            if(b.getIsbn() == bog.getIsbn()){
                return true;
            }
        }
        return false;
    }

    public int countBooks(){
        return boeger.size();
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "boeger=" + boeger +
                '}';
    }
}
