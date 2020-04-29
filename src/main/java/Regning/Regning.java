package Regning;

public class Regning {
    public Regning(){
            System.out.println("\n### Regning ###");
    }

    public void udregnResultat(int first, int second){
        if(first < 1 || first > 50 &&
                second < 1 || second > 50){
            throw new IllegalArgumentException("Det indtastede tal skal være mellem 1 og 50!");
        }
        int addition = first + second;
        int subtraktion = first - second;
        int division = first / second;
        int multiplikation = first * second;

        System.out.println(first + " + " + second + " = " + addition);
        System.out.println(first + " - " + second + " = " + subtraktion);
        System.out.println(first + " / " + second + " = " + division);
        System.out.println(first + " x " + second + " = " + multiplikation);
    }
}
