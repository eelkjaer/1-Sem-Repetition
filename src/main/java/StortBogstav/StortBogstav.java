/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package StortBogstav;

import java.util.ArrayList;
import java.util.Scanner;

public class StortBogstav {
    Scanner input = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    public StortBogstav(){
        System.out.println("\n### Stort bogstav ###");
    }

    public void inputWords(){
        while(true){
            System.out.print("Indtast ord: ");
            String str = input.nextLine();
            if(str.isEmpty()){ //Hvis der trykkes retur unden nogle værdi i strengen.
                break;
            }
            list.add(str);
        }
        System.out.println(countUppercase() + " tekststrenge begyndte med stort forbogstav");
    }

    private int countUppercase(){
        int num = 0;
        for(String s: list){
            if(Character.isUpperCase(s.charAt(0))){
                num++;
            }
        }
        return num;
    }


}
