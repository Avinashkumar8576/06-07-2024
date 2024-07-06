package javaConstructors;

public class TestStudentClass {

	public static void main(String[] args) 
	{

		Department d1 = new Department(101, "HR");
		d1.studentDeparmentDetails();
		System.out.println(d1.hashCode());

		System.out.println();

		Department d2 = new Department(103, "Development");
		d2.studentDeparmentDetails();
		System.out.println(d2.hashCode());
		
		System.out.println();
		
		Department d3 = new Department(188, "Architect");
		d3.studentDeparmentDetails();
		System.out.println(d3.hashCode());

		System.out.println("--------------------------------");

		Department d11 = new Department();
		d11.studentDeparmentDetails();
		System.out.println(d11.hashCode());

		System.out.println();

		Department d12 = new Department();
		d12.studentDeparmentDetails();
		System.out.println(d12.hashCode());

		System.out.println();

		Department d13 = new Department();
		d13.studentDeparmentDetails();
		System.out.println(d13.hashCode());

	}

}
