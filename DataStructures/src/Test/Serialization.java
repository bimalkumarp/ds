package Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private transient String name;
	private String id;
	private String address;
	
	
	
	public Employee(String name, String id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
	
}

public class Serialization {

	public static void main(String[] args) throws Exception { 
		
		Employee emp=new Employee("Bimal","123","Panathur");
		
		
		FileOutputStream fo=new FileOutputStream("D:/emp.txt");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(emp);
		
		/*FileInputStream fi=new FileInputStream("D:/emp.ser");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Employee emp1=(Employee) oi.readObject();
		System.out.println(emp1);*/
	}

}
