package ej25;

public class ej25 {

	public static void main(String[] args) {
		System.out.println("\n");
		System.out.println("Rango byte desde:\t"+Byte.MIN_VALUE+"\tHASTA:\t"+Byte.MAX_VALUE);
		bucleBarra();
		System.out.println("Rango byte desde:\t"+Short.MIN_VALUE+"\tHASTA:\t"+Short.MAX_VALUE);
		bucleBarra();
		System.out.println("Rango byte desde:\t"+Integer.MIN_VALUE+"\tHASTA:\t"+Integer.MAX_VALUE);
		bucleBarra();
		System.out.println("Rango byte desde:\t"+Long.MIN_VALUE+"\tHASTA:\t"+Long.MAX_VALUE);
		bucleBarra();
		System.out.println("Rango byte desde:\t"+Double.MIN_VALUE+"\tHASTA:\t"+Double.MAX_VALUE);
		bucleBarra();
	}
		static void bucleBarra () {
		for (int i=0;i<100;i++) {
		System.out.print("-");
		}System.out.println("");
	}	
}
