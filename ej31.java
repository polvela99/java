package ej31;

public class ej31 {
	int num = 0;
	String[] tecnologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
	String[] tecnologiesDos = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
	public static void main(String[] args) {
		ej31 funcionUno = new ej31();
		funcionUno.recorrerArray();
		System.out.println("-----------------------------------");
		ej31 funcionDos = new ej31();
		funcionDos.recorrerArrayDos();
		System.out.println("-----------------------------------");
		invertirCadena(0);
	}
	public void recorrerArray() {
		System.out.println(tecnologies[num]);
		num++;
		if (num!=7) {
			recorrerArray();
		}	
	}
	public void recorrerArrayDos() {
		System.out.println(tecnologiesDos[num]);
		num++;
		if (num<3) {
			recorrerArrayDos();
		}	
	}
	public static void invertirCadena(int a) {
		char[]palabra= "supercalifragilisticoespialidoso".toCharArray();
		System.out.print(palabra[palabra.length-1-a]);
		if(a!=31) {
			invertirCadena(a+1);
		}
		}
		
	}
