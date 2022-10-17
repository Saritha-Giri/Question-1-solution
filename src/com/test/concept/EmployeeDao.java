package com.test.concept;

import java.util.ArrayList;

public interface EmployeeDao 
{
	public ArrayList<Employee> displayEmployee();
	public void addEmployee(Employee emp);
	public void updateName(Employee employee);
	public void updatePassword(Employee emp);
	public void updateAdress(Employee emp);
	public void deleteEmployee(Employee emp);
	

}
