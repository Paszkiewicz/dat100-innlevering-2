package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden skrivUt ikke implementert");

    }

    // b)
    public static String tilStreng(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden tilStreng ikke implementert");
    }

    // c)
    public static int summer(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden summer ikke implementert");
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {

        // TODO
        throw new UnsupportedOperationException("Metoden finnesTall ikke implementert");

    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {

        // TODO
        throw new UnsupportedOperationException("Metoden posisjonTall ikke implementert");
    }

    // f)
    public static int[] reverser(int[] tabell) {

        // TODO
        throw new UnsupportedOperationException("Metoden reverser ikke implementert");
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] < tabell[i - 1]) {
                return false;
            }
        }
        return true;
    }


    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] tabell3 = new int[tabell1.length + tabell2.length];

        for (int i = 0; i < tabell1.length; i++) {
            tabell3[i] = tabell1[i];
        }

        for (int i = 0; i < tabell2.length; i++) {
            tabell3[tabell1.length + i] = tabell2[i];
        }
        return tabell3;

    }
}
