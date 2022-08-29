
public class ej19punto2 {

	public static void main(String[] args) {
		int j=1;
		int num3 = 3;
		int[] intArray = new int[]{1,2,3,4,5,6,7,8,9};
		for (int i = 0; i<=intArray.length;i++) {
			if (i%num3 == 0) {
				System.out.println(i);
			}
		}
	}
}