/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Strenge;

public class Strenge {
    public Strenge(){
        System.out.println("\n### Strenge ###");
    }

    public String nyStreng(String firstString, String secondString,
                           char firstChar, char secondChar){

        String str = firstString + secondString;

        if(firstString == null || firstString.isEmpty() ||
                secondString == null || secondString.isEmpty()){
            throw new IllegalArgumentException("Strengen må ikke være tom!");
        }

        str = str.replace(firstChar,secondChar);
        return str;
    }
}
