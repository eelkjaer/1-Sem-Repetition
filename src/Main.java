/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
import ArrayList.StringToArrayList;
import Bog.BogController;
import Grass.TidTilKlipning;

public class Main {

    public static void main(String[] args){
        //ArrayListe opgaven
        StringToArrayList sta = new StringToArrayList();
        sta.runArrayList();
        //TODO: JUnit test

        //Bog opgaven
        BogController bog = new BogController();
        bog.addSampleBooks();
        //TODO: JUnit test

        //Hvor tit skal græsset slås
        TidTilKlipning ttk = new TidTilKlipning();
        ttk.beregnMaksDage();
        //TODO: JUnit test
    }


}