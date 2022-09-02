package ej27;

public class ej27 {

	public static void main(String[] args) {
		long largo = Long.MAX_VALUE;
		System.out.println(largo);
		int numInt = (int) largo;
		System.out.println(numInt);
		short numShort = (short) largo;
		System.out.println(numShort);
		byte numByte = (byte) largo;
		System.out.println(numByte);
		System.out.println("------------------------");
		byte nume = 3;
		short shorty = nume;
		int inte = shorty;
		long longa = inte;
		float flota = longa;
		double doble = flota;
		System.out.println(nume);
		System.out.println(shorty);
		System.out.println(inte);
		System.out.println(longa);
		System.out.println(flota);
		System.out.println(doble);
		System.out.println("---------------------------");
		String fuera = "200";
		int alto = Integer.parseInt(fuera);
		System.out.println(alto);
	}

}
