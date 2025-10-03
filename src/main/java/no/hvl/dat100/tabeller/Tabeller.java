package no.hvl.dat100.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {

        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + ", ");
        }
    }


	// b)
  public static String tilStreng(int[] tabell) {

        String resultat = "[";

        for (int i = 0; i < tabell.length; i++) {
            resultat = resultat + tabell[i];
            if (i < tabell.length - 1) {
                resultat = resultat + ",";
            }
        }
        resultat = resultat + "]";
        return resultat;
    }

    // c)
    public static int summer(int[] tabell) {
        int total = 0;
        for (int i = 0; i < tabell.length; i++) {
            total = total + tabell[i];
        }
        System.out.print(total);
        return total;

    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        boolean finnes = false;

        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                finnes = true;
            }
        }
        return finnes;
    }

  // e)
  public static int posisjonTall(int[] tabell, int tall) {
      for (int i = 0; i < tabell.length; i++ ) {
          if (tabell[i] == tall) {
              return i;
          }
      }
      return -1;
  }
    
  // f)
  public static int[] reverser(int[] tabell) {
        int[] newTable = new int[tabell.length];
        int plassering = 0;

        for (int i = tabell.length-1; i > -1; i--) {
            newTable[plassering] = tabell[i];
            plassering++;
        }
        return newTable;
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
