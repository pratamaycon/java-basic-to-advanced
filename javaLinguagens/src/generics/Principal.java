package generics;

public class Principal {
	
	// Métodos Generics
	public static <E> void exibirDados (E[] vetor) {
		for (E element: vetor) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {

		// Vetores
		String[] nomes = { "Alice", "Bryan", "Carla", "Dênis" };
		// String[] animais = { "Gato", "Cachorro", "Urso", "Leão", "Elefante" };
		// Integer[] numeros = { 5, 9, 7, 15, 36, 40, -5, -9, 10 };
		
		// Executar o método GENERICS
		exibirDados(nomes);
	}
}
