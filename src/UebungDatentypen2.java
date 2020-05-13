public class UebungDatentypen2 {
    public static void main(String[] args){

    String word = "fancyfurniture";

    boolean var1 = isFancy(word);
        System.out.println(var1);

    boolean var2 = longerThen20(word);
        System.out.println(var2);

    }
    // Methode 1 "add" gibt Summe von zwei Summanden aus

    public static int add(int parameter1, int parameter2){
        int summe = parameter1 + parameter2;
        return summe;
    }
    // Methode 2 "ausgabe" einfache Ausgabe_Methde

    public static void ausgabe(int parameter){
        System.out.println("Summe : " + parameter);

    }
    // Methode 3 test auf Wert > 100

    public static boolean test(int testat){
        int festeGröße = 100;
        boolean prüfung = testat > festeGröße;
        return prüfung;
    }

    public static boolean isFancy(String checkFancy){
        boolean result = checkFancy.contains("fancy");
        return result;
    }

    public static boolean longerThen20(String charCount){
        boolean longer;
        int chars = charCount.length();
        longer = chars > 20;
        return longer;

    }

}
