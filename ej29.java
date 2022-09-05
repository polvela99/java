package ej29;
import java.util.ArrayList;
public class ej29 {

	public static void main(String[] args) {
		ArrayList<Niño> niñosList = new ArrayList<Niño>();
		// Añadiendo peliculas al arrayList
		niñosList.add(new Niño("Pol", "Vela", "2022","1999"));
		niñosList.add(new Niño("Killian", "Perez", "2022","2000"));
		niñosList.add(new Niño("Jose", "Lopez", "2022","1998"));

		System.out.printf("%20s%20s%20s%20s%n", "Nombre ", "Apellido", "Curso","Año");
		System.out.println("\t-----------------------------------------------------------------------------------");
		for (Niño niño : niñosList) {
			System.out.printf("%20s%20s%20s%20s%n", niño.nombre, niño.apellido, niño.curso, niño.año);
		}

		System.out.printf("%-20s%-20s%-20s%n", "Nombre ", "Director", "Año");
		System.out.println("-------------------------------------------------------------------------------------");
		for (Niño niño : niñosList) {
			System.out.printf("%-20s%-20s%-20s%-20s%n", niño.nombre, niño.apellido, niño.curso, niño.año);
		}
	}

	public static class Niño {
		String nombre = "";
		String apellido = "";
		String curso = "";
		String año = "";

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
		public String getAño() {
			return año;
		}

		public void setAño(String año) {
			this.año = año;
		}

		public Niño(String nombre, String apellido, String curso, String año) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.curso = curso;
			this.año = año;
		}
	}
}