package casestudy3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Product {
	private int pid;
	private String pname;
	private  int pamount;
	private  int pcode;
	private String paddrs;
	private int prpncode;
	
	 
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPamount() {
		return pamount;
	}
	public void setPamount(int pamount) {
		this.pamount = pamount;
	}
	public int getPcode() {
		return pcode;
	}
	public void setPcode(int pcode) {
		this.pcode = pcode;
	}
	public String getPaddrs() {
		return paddrs;
	}
	public void setPaddrs(String paddrs) {
		this.paddrs = paddrs;
	}
	public int getPrpncode() {
		return prpncode;
	}
	public void setPrpncode(int prpncode) {
		this.prpncode = prpncode;
	}
	
}
	public class Customer extends Product{
		public void addProduct() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Id of the Product is : ");
			int x = sc.nextInt();
			sc.nextLine();
			setPid(x);
			System.out.println("Name of Product is :");
			String name = sc.nextLine();
			setPname(name);
			System.out.println("Amount of the Product is : ");
			int amount = sc.nextInt();
			setPamount(amount);
			
			System.out.println("Code of the Product is :");
			int code = sc.nextInt();
			sc.nextLine();
			setPcode(code);
			
			System.out.println("Address of Product :");
			String address = sc.next();
			setPaddrs(address);
			System.out.println("Pincode of the product is :");
			int pincode = sc.nextInt();
			setPrpncode(pincode);
			
		}
		public void UpdateProduct(Customer l)
		{
			l.addProduct();
		}
		@Override
		public String toString() {
			return "Customer [getPid()=" + getPid() + ", getPname()=" + getPname() + ", getPamount()=" + getPamount()
					+ ", getPcode()=" + getPcode() + ", getPaddrs()=" + getPaddrs() + ", getPrpncode()=" + getPrpncode()
					+ "]";
		}
		public static void main(String[] args) {
			HashMap<Integer, Customer> Detail = new HashMap<Integer, Customer>();
			int value =0;
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.println("\n======Enter Your Choice=======\n");
				System.out.println("1. Add a Product \n 2. Update a Product\n 3. Delete a Product\n 4. Get a Product\n 5. Get all Products\n 6. Exit");
				value = sc.nextInt();
				if(value==6)
				{
					break;
				}
				switch(value) {
				case 1:
				{
					Customer p = new Customer();
					p.addProduct();
					Detail.put(p.getPid(), p);
					System.out.println("Product Added Successfully :");
					
					break;
					
					
				}
				case 2:{
					
					System.out.println("Enter Product id");
					int n = sc.nextInt();
					Detail.get(n).addProduct();
					System.out.println("Product Updated Successfully \n");
					break;
				}
				case 3:{
					
					System.out.println("Enter a Product id");
					int n = sc.nextInt();
					Detail.remove(n);
					System.out.println("Product Deleted \n");
					break;
				}
				case 4:{
					System.out.println("Enter a Product id");
					int n = sc.nextInt();
					System.out.println(Detail.get(n));
					break;
				}
				case 5:{
					Set<Integer> s = Detail.keySet();
					Iterator<Integer> it = s.iterator();
					while(it.hasNext())
					{
						System.out.println(it.next());
					}
					break;
				}
		
		
				}
			}
		}
	}


