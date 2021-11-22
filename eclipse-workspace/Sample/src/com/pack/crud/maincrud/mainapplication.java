package com.pack.crud.maincrud;
import java.util.List;
import com.pack.crud.dao.EmployeeDaoImplementation;
import com.pack.crud.model.Employee;
import java.sql.*;


 
public class mainapplication {
    public static void main(String[] args)throws SQLException
        {
      
            Employee emp1 = new Employee();
            emp1.setEmp_name("Vishakha");
            emp1.setEmp_address("Arpan flats");
            EmployeeDaoImplementation empDao= new EmployeeDaoImplementation();
            Employee emp2 = new Employee();
            emp2.setEmp_name("Sunil");
            emp2.setEmp_address("Desai Villa");

 

            // add
            empDao.add(emp1);
            empDao.add(emp2);

 

            // read
            Employee e = empDao.getEmployee(1);
            System.out.println(e.getEmp_id() + ","   + e.getEmp_name() + "," + e.getEmp_address());
      
            // read All
            List<Employee> ls = empDao.getEmployees();
            for (Employee allEmp : ls) {
                System.out.println(allEmp);
            }
      
            // update
            Employee tempEmployee = empDao.getEmployee(1);
            tempEmployee.setEmp_address("Nehru Nagar");
            empDao.update(tempEmployee);
      
            // delete
            empDao.delete(1);
            System.out.println("After deleting ");
            for (Employee allEmp : ls) {
                System.out.println(allEmp);
            }
            
        }
    }
