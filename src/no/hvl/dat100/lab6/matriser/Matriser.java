package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i =0; i<matrise.length; i++) {
			System.out.println();
			for(int j = 0; j<matrise[i].length; j++) {
				System.out.println(matrise[i][j]);
			}
		}
		
	}

	// b)
	public static String tilStreng(int[][] matrise) {
String tekst = "";
for (int i=0; i <matrise.length; i++) {
	for(int j=0; j<matrise[i].length; j++) {
		tekst+=matrise[i][j]+" ";
	}
	tekst +="\n";
}
return tekst;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int a =tall;
		for(int i = 0; i<matrise.length; i++) {
			for(int j=0; j<matrise[i].length; j++) {
				int[] [] Matrise2 = new int [matrise.length] [matrise[i].length];
				Matrise2 [i] [j] = matrise [i] [j] *a;
				System.out.println(Matrise2[i] [j]);
			}
			}
		return matrise;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
boolean equal = false; 

for (int i = 0; i< a.length; i++) {
	
	for(int j=0; j<a[i].length; j++) {
		if (a[i] [j] != b[i] [j]) {
			break;
		}else if (a[i][j] ==b[i][j]) {
			equal = true;
		}
	}
}
return equal;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
