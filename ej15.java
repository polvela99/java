package ej15;

public class ej15 {

	public static void main(String[] args) {
		int num = 3;
		System.out.println(num %2 == 0?"ES PAR":"ES IMPAR");
		int numAleatorio = (int) (Math.random()*50+1);
		System.out.println(numAleatorio<25?"Bueno":"Malo");
	}

}
