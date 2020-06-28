package application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Program6 {

	public static void main(String[] args) {

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
		// union
		Set<Integer> c = new TreeSet<>(a); //  fazendo uma copia a de para c
		c.addAll(b);
		System.out.println(c);
		
		// intersection
		Set<Integer> d = new TreeSet<>(a);  //  fazendo uma copia a de para c
		d.retainAll(b);
		System.out.println(d);
		
		// difference
		Set<Integer> e = new TreeSet<>(a);  //  fazendo uma copia a de para c
		e.removeAll(b);
		System.out.println(e);

	}

}
