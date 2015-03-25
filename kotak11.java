public class kotak11
	{public static void main(String[] args) {
		int p=5;
		for (int i=1; i<=p; i++) {
			if (i%2==0) {
				System.out.print(" ");	
			}
			for (int j=1; j<=p; j++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}