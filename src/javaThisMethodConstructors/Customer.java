package javaThisMethodConstructors;

public class Customer {
	
	private int cid;
	private String cname;
	
	public Customer() {
		// default constructor
		//this(new Customer(101, "Ganesh"));
	}
	
	public Customer(Customer customer) {
		// parameterized constructor 
	}

	public Customer(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}
	
	public Customer geCustomer()
	{
		return this;
	}

	public void geCustomerData()
	{
		System.out.println(cid);
		System.out.println(cname);
	}
	
}
