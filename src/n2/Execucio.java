package n2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Execucio {

	public static void main(String[] args) {
		
		
		String[] llistat = {"Hola!", "345675644", "Cadena moooolt llarga", "3" , "Escombra", "Garrafa" , "exemple" , "empenta"};
		
		List<String> llista = Arrays.asList(llistat);
		
		System.out.println("Llista original");
		llista.forEach(System.out::println);
				
		System.out.println("\nOrdenat per longitud ( de més curta a més llarga)");
		llista.sort((String o1, String o2)->o1.length()-o2.length());
		llista.forEach(System.out::println);
		
		System.out.println("\nOrdenat longitud inversa (de  més llarga a  més curta)");
		Collections.reverse(llista);
		llista.forEach(System.out::println);
		
		System.out.println("\nOrdenat alfabèticament pel primer caràcter");
		//llista.sort((String o1, String o2)->o1.compareTo(o2));
		llista.sort(Comparator.comparing(p -> p));
		llista.forEach(System.out::println);
		
		System.out.println("\nOrdenat Les cadenes que contenen “e” primer, tota la resta en segon lloc");
		
		llista.sort(Comparator.comparing(p -> p));
		
		
		
		
		List<String> llistaE = llista
			    .stream()
			    .filter(n -> n.startsWith("e"))
			    .collect(Collectors.toList());
		
		List<String> llistaR = llista
			    .stream()
			    .filter(n -> !n.startsWith("e"))
			    .collect(Collectors.toList());
		
		llista = llistaE;
		llista.addAll(llistaR);

		llista.forEach(System.out::println);

				
		System.out.println("\nModifica tots els elements de la  matriu per canviar els caracters  “a” a “4”");	
		llista.replaceAll(n  -> n.replace('a', '4'));
		llista.forEach(nom -> System.out.println(nom));
		
		
		System.out.println("\nMostra només els elements que siguin 100% numerics");		
		llista = llista
			    .stream()
			    .filter(n -> n.chars().allMatch(Character::isDigit))
			    .collect(Collectors.toList());
				
		llista.forEach(System.out::println);
		
		
		System.out.println("\nInterficie Funcional operació");
		
		InterficieFuncional operacioEnviada = (nom, valor1, valor2) -> { 
			float resultat = 0;
			switch(nom) {
			 	case "suma":  {resultat = valor1 + valor2;
			 				break;			
			 	}
			 	case "resta": {resultat = valor1 - valor2;
			 				break;
			 	}
			 	case "multiplicacio": {resultat = valor1 * valor2;
			 				break;
			 	}
			 	case "divisio": {resultat = valor1 / valor2;
			 				break;
			 	}
			 	default: System.out.print("Nom de la operació no correcte: ");
			}
			return resultat; 			
		};
		
		System.out.println(operacioEnviada.operacio("suma", 1, 2));
		System.out.println(operacioEnviada.operacio("resta", 1, 2));
		System.out.println(operacioEnviada.operacio("multiplicacio", 1, 2));
		System.out.println(operacioEnviada.operacio("divisio", 1, 2));
		
	}

}
