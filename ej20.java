package ej20;

public class ej20 {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++) {
			if (i==4) {
				break;
			}
		System.out.println("Instruccion "+i);
		}
		System.out.println("\n");
		int i=1;
		while (i<4) {
			System.out.println("Instruccion "+i);
			i++;
		}
		System.out.println("\n");
		for (int k=0;k<10;k++) {
			if (k==5 || k==8) {
				continue;
			}
			System.out.println("ITERACION "+k);
		}
	
	}

}
