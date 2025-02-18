package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<Laptop>();
		
		laps.add(new Laptop("dell",50000,8));
		laps.add(new Laptop("hp",80000,16));
		laps.add(new Laptop("msi",20000,6));
		
		Collections.sort(laps);
		for(Laptop l:laps) {
		System.out.println(l);
	}

}
}
