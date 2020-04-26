import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = maior(a, b, c);
		System.out.print("O maior número digitado foi: " + maior);

		sc.close();
	}

	public static int maior(int a, int b, int c) {
		int aux;

		if(a > b && a > c)
		{
			aux = a;
		}
		else if(b > a && b > c)
		{
			aux = b;
		}
		else
		{
			aux = c;		
		}

		return aux;
	}

}