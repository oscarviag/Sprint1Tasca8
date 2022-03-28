package n1fase3;

public class Execucio {

	public static void main(String[] args) {
		
		InterficieFuncional envia = (cadena) -> { 
			String cadena_girada="";
	        char caracter;
	        for (int i=0; i<cadena.length(); i++) {
	        	caracter= cadena.charAt(i);
	        	cadena_girada= caracter+cadena_girada;
	        }
			return cadena_girada; 			
		};
		
		System.out.println(envia.reverse("Hola"));
	}

}
