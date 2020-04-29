/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Grass;

import java.util.Scanner;

public class TidTilKlipning {
    public TidTilKlipning(){
        System.out.println("\n### Hvor tit skal græsset slås? ###");
    }
    Scanner input = new Scanner(System.in);
    private final double prDag = 0.8;

    public void beregnMaksDage(){
        System.out.print("\nHvor langt er dit græs nu? (cm): ");
        double nu = Double.parseDouble(input.nextLine());
        System.out.print("\nHvor langt må dit græs maks blive? (cm): ");
        double max = Double.parseDouble(input.nextLine());

        double antalDage = dageTilSlaaning(nu,max);

        if (antalDage == 0.0){
            System.out.println("Dit græs skal slåes nu!");
        } else if(antalDage<=1.0){
            System.out.printf("Du skal senest slå dit græs om %.2f dag!", antalDage);
        } else if (antalDage < 0.0){
            System.out.printf("Dit græs skulle have været slået for %.2f dage siden!", antalDage);
        } else {
            System.out.printf("Du skal senest slå dit græs om %.2f dage!", antalDage);
        }
    }

    private double dageTilSlaaning(double nu, double max){
        return (max-nu)*prDag;
    }

}
