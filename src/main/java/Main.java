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
        StringToArrayList sta = new StringToArrayList();
        //sta.runArrayList();

        //Bog opgaven
        BogController bog = new BogController();
        //bog.addSampleBooks();

        //Hvor tit skal græsset slås
        TidTilKlipning ttk = new TidTilKlipning();
        //ttk.beregnMaksDage();

        //Kvadrat
        Kvadrat kv = new Kvadrat();
        //kv.tegnKvadrat(6, "#");

        //Menuvalg
        Menu menu = new Menu();
        //menu.vaelgMenu();

        //Proper case
        ProperCase prc = new ProperCase();
        //System.out.println(prc.ensureCasing("HEJ med DiG SMuKKE fiskemand"));

        //Regning
        Regning regning = new Regning();
        //regning.udregnResultat(40,30);
        //regning.udregnResultat(1,50);

        //Sortering
        Sortering sort = new Sortering();
        //sort.sorterInput();

        //Stort bogstav
        StortBogstav stb = new StortBogstav();
        //stb.inputWords();

        //Strenge
        Strenge str = new Strenge();
        //System.out.println(str.nyStreng("hej","med",'m','n'));

        //Søgning
        Sogning sog = new Sogning();
        String[] array = new String[]{"hej","abe","mand"};
        //System.out.println("Index: " + sog.findStrengIArray(array,"abe"));

    }


}