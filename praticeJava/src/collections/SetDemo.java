package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> st = new HashSet<Integer>();
		st.addAll(Arrays.asList(new Integer[] {3,4,8,9,5}));
		System.out.println(st);
		System.out.println("=========================================");
		
		Set<Integer> st2 = new HashSet<Integer>();
		st2.addAll(Arrays.asList(new Integer[] {1,5,3,4,8}));
		System.out.println(st2);
		System.out.println("=======================================");
		
		Set<Integer> intersection = new HashSet<Integer>(st);
		intersection.retainAll(st2);
		System.out.println(intersection);
		
		
	}

}
