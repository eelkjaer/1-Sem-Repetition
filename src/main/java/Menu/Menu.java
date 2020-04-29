/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Menu;

import java.util.Scanner;

public class Menu {
    private final Scanner input = new Scanner(System.in);
    private int menuvalg;

    public Menu(){
        System.out.println("\n### Menuvalg ###");
    }

    public void vaelgMenu(){
        printMenu();
        menuvalg = brugerInput();
        switch (menuvalg){
            case 1:
                System.out.println("Beregn valgt");
                break;
            case 2:
                System.out.println("Udskriv valgt");
                break;
            case 3:
                System.out.println("Hjælp valgt");
                break;
            default:
                System.out.println("Forkert menupunkt valgt!");
                vaelgMenu();
        }
    }

    private void printMenu(){
        System.out.println("1.\tBeregn");
        System.out.println("2.\tUdskriv");
        System.out.println("3.\tHjælp");
    }

    private int brugerInput(){
        System.out.print("Indtast valg: ");
        return Integer.parseInt(input.nextLine());
    }
}
