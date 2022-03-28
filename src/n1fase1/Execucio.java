package n1fase1;

import java.util.ArrayList;


public class Execucio {

	static ArrayList<String> noms = new ArrayList<>();
	static ArrayList<Integer> llista = new ArrayList<>();
	static ArrayList<String> mesos = new ArrayList<>();
	
	public static void main(String[] args) {
		
		noms.add("Lluis");
		noms.add("Ana");
		noms.add("Ramón");
		noms.add("Romeu");
		noms.add("Eva");
		noms.add("Rosa");
		noms.add("Raimon");
		
		llista.add(8);
		llista.add(89);
		llista.add(43);
		llista.add(25);
		llista.add(18);
		llista.add(874);
		llista.add(3);
		
		
		mesos.add("Gener");
		mesos.add("Febrer");
		mesos.add("Març");
		mesos.add("Abril");
		mesos.add("Maig");
		mesos.add("Juny");
		mesos.add("Juliol");
		mesos.add("Agost");
		mesos.add("Setembre");
		mesos.add("Octubre");
		mesos.add("Novembre");
		mesos.add("Desembre");
		
		
		System.out.println(buscaA(noms));
		System.out.println(numerosLletres(llista));
		System.out.println(buscaO(noms));
		System.out.println(buscaOiCinc(noms));
		
		mesos.forEach(mes -> {
			System.out.println(mes);
		});
		
		System.out.println();		
		mesos.forEach(System.out::println);

	}
	
	public static ArrayList<String> buscaA(ArrayList<String> noms){
		
		ArrayList<String> condicions = new ArrayList<String>(noms);		
		condicions.removeIf(nom -> !((nom.length()==3) && (nom.charAt(0) == 'A')));
		return condicions;		

	}
	
	public static String numerosLletres(ArrayList<Integer> llistat) {
		
		String  resultat="";
			
		for (Integer numero:llistat)
			
			if (numero%2==0) { resultat = resultat + "e" + numero + "," ;
			}else {
			resultat = resultat + "o" + numero + ",";};
		
		return resultat.substring(0, resultat.length()-1);
	
	}

	public static ArrayList<String> buscaO(ArrayList<String> noms){
				
		ArrayList<String> condicions = new ArrayList<String>(noms);		
		condicions.removeIf(nom -> !((nom.contains("o"))));
		return condicions;
		
	}
	
	public static ArrayList<String> buscaOiCinc(ArrayList<String> noms){
		
		ArrayList<String> condicions = new ArrayList<String>(noms);		
		condicions.removeIf(nom -> (!(nom.contains("o") && (nom.length()>5))));
		return condicions;
		
	}
	

	
	
}
