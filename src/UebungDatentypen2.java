public class UebungDatentypen2 {
    public static void main(String[] args){

    int var1 = 4;
    int var2 = 5;
    int var3 = 101;
    boolean result;

    result = var1 < var2;
        System.out.println(result);

    result = var1 > var2;
        System.out.println(result);

     result = var1 == var2;
        System.out.println(result);

        int ergebnis1 = add(var1, var2);
        System.out.println(ergebnis1);

        ausgabe(ergebnis1);

        boolean ergebnis3 = test(var3);
        System.out.println(ergebnis3);


    }

    public static int add(int parameter1, int parameter2){
        int summe = parameter1 + parameter2;
        return summe;
    }

    public static void ausgabe(int parameter){
        System.out.println("Summe : " + parameter);

    }

    public static boolean test(int testat){
        int festeGröße = 100;
        boolean prüfung = testat > festeGröße;
        return prüfung;
    }
}
