import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
			boolean entradaValida = false;

			while (!entradaValida) {
				try {
					System.out.println("Digite o primeiro número:");
					int parametroUm = terminal.nextInt();

					System.out.println("Digite o segundo número:");
					int parametroDois = terminal.nextInt();

					contar(parametroUm, parametroDois);
					entradaValida = true; 

				} catch (ParametrosInvalidosException e) {
					System.out.println(e.getMessage());
					System.out.println("Tente novamente!\n");
				}
			}
		}
	}
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro número");
			
		}
		int contagem = parametroDois - parametroUm;
		
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}		
}
