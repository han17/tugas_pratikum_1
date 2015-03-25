public class bebas12{
	public static void main(String[] args) {
		int a;
		int b;
		int c=7;
		for (a=1; a<=c; a++) {
			if (a%2==0) {
				System.out.print(" ");
			}
			for (b=1; b<=c; b++) {
				System.out.print("#");
			}
			System.out.print("\n");
		}
	}
}