import java.util.*;
public class Exercici2_LR_Fase4 {

	public static void main(String[] args) {
		ArrayList<String> nom = new ArrayList<String>();
		ArrayList<String> cognom = new ArrayList<String>();
		ArrayList<String> FullName = new ArrayList<String>();
		
		nom.add("x");
		nom.add("a");
		nom.add("v");
		nom.add("i");
		
		cognom.add("z");
		cognom.add("u");
		cognom.add("r");
		cognom.add("i");
		cognom.add("t");
		cognom.add("a");
		
		FullName.addAll(nom);
		FullName.add(" ");
		FullName.addAll(cognom);
		
		System.out.println(FullName);
	}
}
