package collections;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("eleven");
		al.add("mike");
		al.add("luke");
		al.add("nancy");
		
		Iterator itr= al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
