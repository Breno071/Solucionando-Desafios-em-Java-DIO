import java.util.Scanner;

public class Media {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, media, emexame, emexamefinal;

		n1 = sc.nextFloat() * 2;
		n2 = sc.nextFloat() * 3;
		n3 = sc.nextFloat() * 4;
		n4 = sc.nextFloat() * 1;

		media = (n1 + n2 + n3 + n4) / 10;

		System.out.printf("Media: %.1f\n", media);

		// continue a solucao de acordo com o enunciado

		if (media >= 7) {

			System.out.println("Aluno aprovado.");
		}

		else if (media < 5) {

			System.out.println("Aluno reprovado.");
		}

		else if (media >= 5 && media <= 6.9) {

			System.out.println("Aluno em exame.");

			emexame = sc.nextFloat();

			emexamefinal = (emexame + media) / 2.0;

			System.out.printf("Nota do exame: %.1f\n", emexame);

			if (emexamefinal >= 5) {

				System.out.println("Aluno aprovado.\n");

				System.out.printf("Media final: %.1f\n", emexamefinal);
			}

			else if (emexamefinal <= 4.9) {

				System.out.println("Aluno reprovado");

				System.out.format("Media final: %.1f\n", emexamefinal);
			}
		}

		sc.close();

	}
}