package collections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	Stack<Integer> stck = new Stack<Integer>();
	stck.add(5);
	stck.add(8);
	stck.add(12);
	stck.add(15);
	
	System.out.println(stck);
	
	Iterator itr= stck.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}

