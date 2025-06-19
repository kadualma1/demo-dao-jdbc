package application;

import java.time.LocalDate;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		/* START: TESTS WITH SELLER DAO
		System.out.println("--- FIND BY ID ---");
		System.out.println();
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		System.out.println();

		System.out.println("--- FIND BY DEPARTMENT ---");
		System.out.println();
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		
		for (Seller obj : list) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("--- FIND ALL ---");
		System.out.println();
		List<Seller> newList = sellerDao.findAll();
		for(Seller obj : newList) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("--- INSERT ---");
		System.out.println();
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println(newSeller.getId());
		System.out.println();

		System.out.println("--- UPDATE ---");
		System.out.println();
		seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update executed.");
		System.out.println();

		System.out.println("--- DELETE ---");
		System.out.println();
		int id = 11; // Deleting Greg from the INSERT
		sellerDao.deleteById(id);
		System.out.println("Delete executed.");
		System.out.println();
		
		END: TESTS WITH SELLER DAO
		*/
		
		System.out.println("--- FIND BY ID ---");
		System.out.println();
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(3);
		System.out.println(department);
		System.out.println();

		System.out.println("--- FIND ALL ---");
		System.out.println();
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		System.out.println();

		System.out.println("--- INSERT ---");
		System.out.println();
		Department newDepartment = new Department (null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment.getId());
		System.out.println();

		System.out.println("--- UPDATE ---");
		System.out.println();
		department = departmentDao.findById(1);
		department.setName("Cellphones");
		departmentDao.update(department);
		System.out.println("Update executed.");
		System.out.println();

		System.out.println("--- DELETE ---");
		System.out.println();
		int id = 5; // Deleting FOOD from the INSERT
		departmentDao.deleteById(id);
		System.out.println("Delete executed.");
		System.out.println();
	}

}
