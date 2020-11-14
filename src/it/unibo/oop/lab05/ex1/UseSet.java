package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	private static final int ELEMS = 20;

	private UseSet() {
	}

	/**
	 * @param args ignored
	 */
	public static void main(final String[] args) {

		// Considering the content of "UseCollection, write a program which, in
		// order:

		// 1) Builds a TreeSet containing Strings
		final TreeSet<String> ts = new TreeSet<>();

		// 2) Populates such Collection with all the Strings ranging from "1" to
		// "20"
		for (int i = 1; i <= ELEMS; i++) {
			ts.add(Integer.toString(i));
		}
		// 3) Prints its content
		System.out.println("The first set is: " + ts);
		// 4) Removes all those strings whose represented number is divisible by
		// three

		final var iterator = ts.iterator();
		while (iterator.hasNext()) {
			final String i = iterator.next();
			if (Integer.parseInt(i) % 3 == 0) {
				iterator.remove();
			}
		}

		// 5) Prints the content of the Set using a for-each costruct
		System.out.print("The first set modified is: [");
		for (String s : ts) {
			System.out.print("  " + s);
		}
		System.out.print(" ]\n");

		// 6) Verifies if all the numbers left in the set are even
		final TreeSet<String> ts2 = new TreeSet<>();
		for (int i = 2; i <= 20; i = i + 2) {
			ts2.add(Integer.toString(i));
		}
		System.out.println("The second set is: " + ts2);
		System.out.println(ts2.containsAll(ts));
	}
}
