package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class ProgramDepartmentTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		List<Department> list = new ArrayList<>();

		System.out.println("=== TEST 1: Department findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n=== TEST 2: Department findAll ===");
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Department insert ===");
		Department newDepartment = new Department(null, "Codex");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id= " + newDepartment.getId());
		
		
		System.out.println("\n=== TEST 4: Department update ===");
		department = departmentDao.findById(1);
		department.setName("Integração");
		departmentDao.update(department);
		System.out.println("Update Completed!");
		
		System.out.println("\n=== TEST 5: Department delete ===");
		System.out.println("Enter id for delete test: ");
		Integer id = sc.nextInt();
		departmentDao.deleById(id);
		System.out.println("Delete completed!");
		sc.close();

	}

}
