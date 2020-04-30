/*
@author Emil Elkjær Nielsen (cph-en93@cphbusiness.dk)
 */
package Kvadrat;

public class Kvadrat {
    public Kvadrat(){
        System.out.println("\n### Kvadrat ###");
    }

    /**
     * @param size Højde/Bredde på kvadraten
     * @param sign Hvilken char skal kvadraten laves af?
     * @throws Exception Såfremt størrelsen er nul eller over 50
     */
    public void tegnKvadrat(int size, String sign) throws Exception{
        if(size < 0){
            throw new Exception("Negative tal er ikke tilladt!");
        } else if (size > 50){
            throw  new Exception("Tallet er for stort!");
        } else {
            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    System.out.print(sign);
                }
                System.out.print("\n");
            }
        }
    }
}
