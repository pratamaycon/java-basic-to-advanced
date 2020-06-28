package hashset;

import java.util.HashSet;
import java.util.Set;

public class exemplo {

	public static void main(String[] args) {
		
		// Hashset
		Set<String> cursos = new HashSet<>();
		
		// Cadastrar os cursos
		cursos.add("Java");
		cursos.add("C#");
		cursos.add("PHP");
		cursos.add("Java");
		cursos.add("Nodejs");
		
		System.out.println(cursos);
		
		
	}
}
