package application;

import java.time.LocalDate;
import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Robert", "bob@gmail.com", LocalDate.now(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
