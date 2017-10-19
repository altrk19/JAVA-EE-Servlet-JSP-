package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDAO {

	public void insertEmployee(String name,String surname,int salary);
	public void removeEmployee(int id);
	public List<Employee> getEmployees();
	 
}
