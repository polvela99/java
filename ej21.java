package ej21;

public class ej21 {

	public static void main(String[] args) {
		ej21 main=new ej21();
		System.out.println(main.javaOrNull("java"));
		
		System.out.println(main.login("root","1234"));
		
		System.out.println(main.numero(100));
	}
	public String javaOrNull(String nombre) {
		if (nombre == "java") {
			return "java";
		}else {
			return "null";
		}
	}
	public String login(String user,String password) {
		if (user=="root" && password=="1234") {
			return "Login true";
		}else {
			return "Login false";
		}
	}
	public String numero(Integer numerito) {
		if (numerito % 2 ==0) {
			return "Es par";
		}else {
			return "Es impar";
		}
	}
}
