/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
import ArrayList.*;
import Bog.*;
import Grass.*;
import Kvadrat.*;
import Menu.*;
import ProperCase.*;
import Regning.*;
import Sogning.*;
import Sortering.*;
import StortBogstav.*;
import Strenge.*;

import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
            try {
                menu();
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        public static void menu() throws Exception {
        printMenu();
            switch(Integer.parseInt(input.nextLine())) {
                case 1:
                    //ArrayListe opgaven
                    StringToArrayList sta = new StringToArrayList();
                    sta.runArrayList();
                    menu();
                case 2:
                    //Bog opgaven
                    BogController bog = new BogController();
                    bog.addSampleBooks();
                    menu();
                case 3:
                    //Hvor tit skal græsset slås
                    TidTilKlipning ttk = new TidTilKlipning();
                    ttk.beregnMaksDage();
                    menu();
                case 4:
                    //Kvadrat
                    Kvadrat kv = new Kvadrat();
                    kv.tegnKvadrat(6, "#");
                    menu();
                case 5:
                    //Menuvalg
                    Menu menu = new Menu();
                    //menu.vaelgMenu();
                    menu();
                case 6:
                    //Proper case
                    ProperCase prc = new ProperCase();
                    System.out.println(prc.ensureCasing("HEJ med DiG SMuKKE fiskemand"));
                    menu();
                case 7:
                    //Regning
                    Regning regning = new Regning();
                    regning.udregnResultat(40, 30);
                    regning.udregnResultat(1, 50);
                    menu();
                case 8:
                    //Sortering
                    Sortering sort = new Sortering();
                    sort.sorterInput();
                    menu();
                case 9:
                    //Stort bogstav
                    StortBogstav stb = new StortBogstav();
                    stb.inputWords();
                    menu();
                case 10:
                    //Strenge
                    Strenge str = new Strenge();
                    System.out.println(str.nyStreng("hej", "med", 'm', 'n'));
                    menu();
                case 11:
                    //Søgning
                    Sogning sog = new Sogning();
                    String[] array = new String[]{"hej", "abe", "mand"};
                    System.out.println("Index: " + sog.findStrengIArray(array, "abe"));
                    menu();
                case 12:
                    System.out.println("Farvel!");
                    System.exit(0);
                default:
                    menu();
            }
    }

    public static void printMenu(){
        System.out.println("\n## Vælg en af følgende repetitionsopgaver ##");
        System.out.println("1.\tArrayList");
        System.out.println("2.\tBog");
        System.out.println("3.\tHvor tit skal græsset slåes");
        System.out.println("4.\tKvadrat");
        System.out.println("5.\tMenuvalg");
        System.out.println("6.\tProper case");
        System.out.println("7.\tRegning");
        System.out.println("8.\tSortering");
        System.out.println("9.\tStort bogstav");
        System.out.println("10.\tStrenge");
        System.out.println("11.\tSøgning");
        System.out.println("######");
        System.out.println("12.\tAfslut program");
    }

}