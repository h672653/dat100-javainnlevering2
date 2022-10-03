package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;


public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i : tabell) {
			System.out.print(i+" "); }
	}
	// b)
	public static String tilStreng(int[] tabell) {
String Txt = "[";
for(int i = 0; i<tabell.length; i++) {
	Txt = Txt + tabell[i];
	if(i<tabell.length-1) {
		Txt = Txt + ",";
	}
}
	Txt = Txt + "]";
	return Txt;
	}

	// c)
	public static int summer(int[] tabell) {
int sum = 0;
for (int verdi : tabell) {
	sum +=verdi;
}
		return sum;
	}
	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int pos = 0;
		
		while (!funnet && pos <tabell.length) {
			if(tabell[pos]==tall) {
				funnet=true;
			}
			pos++;
		}
		System.out.println(funnet);
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		 int[] numbers = {1, 4, 6, 7 }; 
	        int element = 2;
	        int index = -1;
	         
	        int i = 0;
	        while(i < numbers.length) {
	            if(numbers[i] == element) {
	                index = i;
	                break;
	            }
	            i++;
	        }
	        return index;
	    }
	    
	// f)
	public static int[] reverser(int[] tabell) {
Arrays.sort(tabell);
int[] sortedarray = new int[tabell.length];

int indexSortedArray = 0;
for(int i=tabell.length-1; i>=0; i--) {
	sortedarray[indexSortedArray ++] = tabell [i];
}
return sortedarray;
	}
	

	// g)
	public static boolean erSortert(int[] tabell) {
int a = 0;
boolean sortert = true;
while(sortert && a <tabell.length-1) {
	if(tabell [a] >tabell[a+1]) {
		sortert = false;
	}
	a++;
}
return sortert;
	}
	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		  int[] c = new int[tabell1.length + tabell2.length];
		  int i = 0;
		  for (int x : tabell1) { c[i] = x; i ++; }
		  for (int x : tabell2) { c[i] = x; i ++; }
		  return c;
	}}

