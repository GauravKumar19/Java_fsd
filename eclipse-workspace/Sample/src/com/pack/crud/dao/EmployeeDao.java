package com.pack.crud.dao;


import java.sql.SQLException;
import com.pack.crud.model.Employee;
import java.util.List;

public interface EmployeeDao {
	// Having 
	public Employee createtable() throws SQLException;
	public int add(Employee emp) throws SQLException;
	    public void delete(int id) throws SQLException;
	    public Employee getEmployee(int id)  throws SQLException;
	    public List<Employee> getEmployees() throws SQLException;
	    public void update(Employee emp) throws SQLException;

}