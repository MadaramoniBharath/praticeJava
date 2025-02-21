package streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortAge {

	public static void main(String[] args) {
		List<EmployeeDetails> epl = new  ArrayList<EmployeeDetails>();
		epl.add(new EmployeeDetails(7401,"chey",22));
		epl.add(new EmployeeDetails(7402,"sai",24));
		epl.add(new EmployeeDetails(7403,"laxman",23));
		epl.add(new EmployeeDetails(7404,"bharath",25));
		epl.add(new EmployeeDetails(7404,"bharat",25));
		epl.add(new EmployeeDetails(7404,"bhamu",25));
		epl.add(new EmployeeDetails(7404,"bunty",25));
		
		epl.add(new EmployeeDetails(7405,"tiger",21));
		epl.add(new EmployeeDetails(7406,"yash",23));
		epl.add(new EmployeeDetails(7407,"mani",22));
		epl.add(new EmployeeDetails(7408,"prashanth",24));
		epl.add(new EmployeeDetails(7409,"cherry",21));
		epl.add(new EmployeeDetails(7410,"chintu",22));
		
		
		List<Integer> ag = epl.stream().filter(a->a.age>24).map(a->a.age).collect(Collectors.toList());	
		System.out.println(ag);

		
		List<String> as = epl.stream().filter(n->n.name.startsWith("c")).sorted(Comparator.comparing(n->n.name)).map(n->n.name).collect(Collectors.toList());
		System.out.println(as);
		
		List<String> as1 = epl.stream().filter(nn->nn.name.startsWith("b")).sorted(Comparator.comparing(nn->nn.name)).map(nn->nn.name).collect(Collectors.toList());
		System.out.println(as1);
	}
}


