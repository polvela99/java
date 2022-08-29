
public class ej19punto4 {

	public static void main(String[] args) {
		char[] letras =
			{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
			int resta = 0;
			int suma = 25;
			for (int i = 0; i < letras.length; i++) {
			for (int k = 0; k < letras.length-resta; k++) {
			System.out.print(letras[k]);
			}
			System.out.println("");
			resta++;
			}
			for (int i = 0; i < letras.length; i++) {
			for (int k = 0; k < letras.length-suma; k++) {
			System.out.print(letras[k]);
			}
			System.out.println("");
			suma--;
		}
	}

}
