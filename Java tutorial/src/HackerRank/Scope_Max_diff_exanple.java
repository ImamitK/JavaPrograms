package HackerRank;

import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public void computeDifference() {
		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = 1; j < elements.length; j++) {
				//Math.abs will convert a number from negative to positive (-5 to 5)
				int temp = Math.abs(elements[i] - elements[j]);
				if (maximumDifference < temp) {
					maximumDifference = temp;
				}
			}
		}
	}
}

public class Scope_Max_diff_exanple {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}

}
