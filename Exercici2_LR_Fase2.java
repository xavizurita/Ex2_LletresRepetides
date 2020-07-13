
import java.util.*;
public class Exercici2_LR_Fase2 {
	public static void main(String[] args) {

		char[] nom= {'X', 'a', 'v', 'i', ' ', 'Z','u', 'r', 'i','t', 'a', ' ','R', 'o', 'c'};
		ArrayList nomDos = new ArrayList();
		char vocal;	
		for (int hh=0; hh<=14; hh++) {
			vocal=nom[hh];
			if(nom[hh]=='a' ||nom[hh]=='e' ||nom[hh]=='i' ||nom[hh]=='o' ||nom[hh]=='u') {
				
				nomDos.add(nom[hh]);
				System.out.print(nom[hh]);
				System.out.println(" vocal ");
			} else if (nom[hh]=='0' ||nom[hh]=='1' ||nom[hh]=='2' ||nom[hh]=='3' ||nom[hh]=='4' ||nom[hh]=='5' ||nom[hh]=='6' ||nom[hh]=='7' ||nom[hh]=='8'  ||nom[hh]=='9') {
				
				System.out.print(nom[hh]);
				System.out.println(" El nom no pot tenir números");
			} else {
					
				nomDos.add(nom[hh]);
				System.out.print(nom[hh]);
				System.out.println(" consonante ");
			}
		}
	}
}
