package lista13_JAVA;

public class E05_ElementosPares {

	public static void main(String[] args) {
		int[] vetor = { 1, 2, 4, 7, 6, 8, 9, 10, 12, 14, 17, 16, 18, 20 };

		for (int contadora = 0; contadora < vetor.length; contadora++) {
			if (vetor[contadora] % 2 == 0) {
				System.out.println(vetor[contadora] + "");
			}

		}

	}
}