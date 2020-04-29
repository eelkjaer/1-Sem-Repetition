/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
import ArrayList.*;
import Bog.*;
import Grass.*;
import Kvadrat.*;
import Menu.*;

public class Main {

    public static void main(String[] args){
        //ArrayListe opgaven
        //TODO: JUnit test
        StringToArrayList sta = new StringToArrayList();
        //sta.runArrayList();

        //Bog opgaven
        //TODO: JUnit test
        BogController bog = new BogController();
        //bog.addSampleBooks();

        //Hvor tit skal græsset slås
        //TODO: JUnit test
        TidTilKlipning ttk = new TidTilKlipning();
        //ttk.beregnMaksDage();

        //Kvadrat
        //TODO: JUnit test
        Kvadrat kv = new Kvadrat();
        try {
            //kv.tegnKvadrat(6, "#");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Menuvalg
        //TODO: JUnit test
        Menu menu = new Menu();
        //menu.vaelgMenu();

        //Proper case
        //TODO: JUnit test


    }


}