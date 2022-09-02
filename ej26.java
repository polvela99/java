package ej26;

public class ej26 {

	public static void main(String[] args) {
		Long largo = 121298L;
		byte pequeñito = 12;
		short pequeño = 200;
		Integer integro = 100;
		System.out.println(integro.getClass().getName());
		System.out.println(((Object)pequeño).getClass().getName());
		System.out.println(((Object)pequeñito).getClass().getName());
		System.out.println(largo.getClass().getName());
		queEs();
	}public static void queEs() {
		var chick = 5;
		System.out.println(((Object)chick).getClass().getName());
		}
	}
	


