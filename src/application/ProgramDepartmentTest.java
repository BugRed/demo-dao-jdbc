package application;

import java.util.ArrayList;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartmentTest {

	public static void main(String[] args) {
		
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = new ArrayList<>();

		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 3: Department findAll ===");
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

	}

}
