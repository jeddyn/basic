package metody;

public class Main {
    //psvm
    public static void main(String[] args) {

//        suma(3,5);
//        int wynik = suma2(6,122);
//        System.out.println(wynik);
        //oblicz pochodna

        // etap suma
        // etap mnozenie
        // etap podstawienie pod wzor


//        String[] faktury = new String[50000];
//        for (int j = 0; j < faktury.length; j++) {
//            faktury[j] = "a";
//        }
//        String szukanaFaktura = "ABC123";
//        faktury[0] = "ABC123";
//
//        for (int i = 0; i < faktury.length; i++) {
//            if(faktury[i].equals(szukanaFaktura)){
//                System.out.println("Znalazła się! w iteracji numer: " + i);
//                break;
//            }
//        }

        String[] faktury = new String[50000];
        for (int j = 0; j < faktury.length; j++) {
            faktury[j] = "a";
        }
        String szukanaFaktura = "ABC123";
        faktury[0] = "ABC123";

        for (int i = 0; i < faktury.length; i++) {
            if (!faktury[i].startsWith("ABC")) {
                continue;
            }
            if (faktury[i].length() == 6) {
                System.out.println("Udało się!");
                break;
            }
        }


    }

    //  zrobić odejmowanie, dzielenie, mnozenie + testy w main
    public static void suma(int a, int b) {
        System.out.println(a + b);
    }

    public static int suma2(int a, int b) {
        return a + b;
    }
}
