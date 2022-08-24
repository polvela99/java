
public class ej16 {

	public static void main(String[] args) {
		int numAleatorio = (int) (Math.random()*2);
		if (numAleatorio == 1) {
			System.out.println("Rojo");
		}else {
			System.out.println("Verde");
		}
		System.out.println(numAleatorio == 1?"Rojo":"Verde");
	int tempAleatoria = (int) (Math.random()*31+1);
		if (tempAleatoria <= 10) {
			System.out.println("Clima frio");
		}else if (tempAleatoria > 10 && tempAleatoria <= 20) {
			System.out.println("Clima Templado");
		}else {
			System.out.println("Clima tropical");
		}
	
	}
	
}
