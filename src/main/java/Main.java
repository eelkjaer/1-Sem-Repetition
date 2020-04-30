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

public class Main {

    public static void main(String[] args) throws Exception {
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
        //kv.tegnKvadrat(6, "#");

        //Menuvalg
        //TODO: JUnit test
        Menu menu = new Menu();
        //menu.vaelgMenu();

        //Proper case
        //TODO: JUnit test
        ProperCase prc = new ProperCase();
        //System.out.println(prc.ensureCasing("HEJ med DiG SMuKKE fiskemand"));

        //Regning
        //TODO: JUnit test
        Regning regning = new Regning();
        //regning.udregnResultat(40,30);
        //regning.udregnResultat(1,50);

        //Sortering
        //TODO: JUnit test
        Sortering sort = new Sortering();
        //sort.sorterInput();

        //Stort bogstav
        //TODO: JUnit test
        StortBogstav stb = new StortBogstav();
        //stb.inputWords();

        //Strenge
        //TODO: JUnit test
        Strenge str = new Strenge();
        //System.out.println(str.nyStreng("hej","med",'m','n'));

        //Søgning
        //TODO: JUnit test
        Sogning sog = new Sogning();
        String[] array = new String[]{"hej","abe","mand"};
        //System.out.println("Index: " + sog.findStrengIArray(array,"abe"));

    }


}