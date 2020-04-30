/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Sortering;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {
    Scanner input = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    public Sortering(){
        System.out.println("\n### Sortering ###");
    }

    public void sorterInput(){
        int i = 0;
        while(i<5){
            System.out.printf("Indtast ord nr.%d: ",i+1);
            String str = input.nextLine();
            if(str.isEmpty()){
                throw new IllegalArgumentException("Dit input må ikke være tomt!");
            }
            list.add(str);
            i++;
        }
        Collections.sort(list,Collections.reverseOrder());
        printList();
    }

    private void printList(){
        for(String s:list){
            System.out.println(s);
        }
    }
}
