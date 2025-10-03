package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

        for (int rad = 0; rad < matrise.length; rad++) {
            for (int kolonne = 0; kolonne< matrise[rad].length; kolonne++) {

                System.out.println("matrise["+rad+"]["+kolonne+"] = " + matrise[rad][kolonne]);
            }
        }

	}

	// b)
	public static String tilStreng(int[][] matrise) {

        String resultat = "";

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                resultat = resultat + matrise[i][j] + " ";
            }
            resultat = resultat + "\n";
        }

        return resultat;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nymatrise = new int[matrise.length][matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[0].length; j++) {

                nymatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nymatrise;
    }


	// d)
	public static boolean erLik(int[][] a, int[][] b) {

        if (a == null && b == null) return true;
        if (a == null || b == null) return false;

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i].length != b[1].length) return false;
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) return false;
            }
        }
        return true;
    }
}

