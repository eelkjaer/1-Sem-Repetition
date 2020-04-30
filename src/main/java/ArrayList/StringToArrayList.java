/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringToArrayList {

    public StringToArrayList(){
        System.out.println("\n### ArrayList opgave ###");
    }

    /**
     * Tilføjer pre-defineret strenge til arraylisten
     **/
    public void runArrayList(){
        ArrayList<String> arrayList = new ArrayList();
        System.out.println(addToArrayList(arrayList,"abc"));
        System.out.println(addToArrayList(arrayList,"abcd"));
        System.out.println(addToArrayList(arrayList,"abc"));
        System.out.println(addToArrayList(arrayList,null));
    }

    /**
     @param arraylist En tom eller fyldt ArrayList som String objekterne skal fyldes i.
     @param str En streng som skal fyldes i listen.
     @return Hvis tilføjet til listen = true. Ellers false.
     **/
    public boolean addToArrayList(ArrayList<String> arraylist, String str){
        if(arraylist.contains(str) || str == null){ //Fejl hvis ordet allerede findes eller strengen er tom
            return false;
        } else {
            arraylist.add(str); //Tilføj til listen
            Collections.sort(arraylist); //Sorter listen alfabetisk
            return true;
        }
    }


}
