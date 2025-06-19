package application;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
//		Seller seller = sellerDao.findById(3);
//		System.out.println(seller);
		
		Department dep = new Department(2, null);
//		List<Seller> list = sellerDao.findByDepartment(dep);
//		
//		for (Seller obj : list) {
//			System.out.println(obj);
//		}
		
//		List<Seller> list = sellerDao.findAll();
//		for(Seller obj : list) {
//			System.out.println(obj);
//		}
		
//		Seller seller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 4000.0, dep);
//		sellerDao.insert(seller);
//		System.out.println(seller.getId());
		
		Seller seller = sellerDao.findById(1);
		seller.setName("Martha Wayne");
		sellerDao.update(seller);
		System.out.println("Update executed");
	}

}
