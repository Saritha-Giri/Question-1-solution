package com.test.concept;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;


public class EmployeeService implements EmployeeDao
{

	@Override
	public ArrayList<Employee> displayEmployee()
	{
	ArrayList<Employee>arrayList=new ArrayList<Employee>();
		 try
	        {
	            Connection con = ConnectionFactory .getConnection();
	            Statement statement = con.createStatement();
	            ResultSet rs = statement.executeQuery("select * from   employee.emp");
	            while(rs.next())
	            {
	            	
	                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
	            }
	        }
	        catch (Exception e) {
	            System.out.println(e);
	        }
		 return arrayList;
}
	
	@Override
	public void addEmployee(Employee emp) 
	{
		 
		try
        {
            
            Connection con = ConnectionFactory .getConnection();
            Statement statement=con.createStatement();
            String query="Insert into `employee`.`emp`(`id`,`name`,`password`,`address`)values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getPassword()+"','"+emp.getAddress()+"')";
            statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);



        }}
	


	@Override
	public void updatePassword(Employee emp)
	{
		try
		{
			Connection con = ConnectionFactory .getConnection();
			   Statement stmt= con.createStatement();  
			  String sql="update   employee.emp set  password='"+ emp.getPassword()+"' where id='"+emp.getId()+"' ";
			  int i=stmt.executeUpdate(sql);
			  
			  if(i>0)
			  {
				  System.out.println("data updated");
				  
			  }
			  else
			  {
				  System.out.println("no record found");
			  }       
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	@Override
	public void deleteEmployee(Employee emp) 
	{
	try 
	{
	   Connection con = ConnectionFactory .getConnection();
	   Statement stmt= con.createStatement();  
	   String query="delete from   employee.emp where name='"+emp.getName()+"'";
	    stmt.executeUpdate(query);
	 }
			catch (Exception e) {
	            System.out.println(e);

	        }
		}

	public void updateName(Employee employee) {
		try
		{
			Connection con = ConnectionFactory .getConnection();
			   Statement stmt= con.createStatement();
			   
			  String sql="update   employee.emp  name='"+ employee.getName()+"' where id='"+employee.getId()+"' ";
			  int i=stmt.executeUpdate(sql);
			  
			  if(i>0)
			  {
				  System.out.println("data updated");
				  
			  }
			  else
			  {
				  System.out.println("no record found");
			  }       
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
	}

	@Override
	public void updateAdress(Employee emp)
	{
		try
		{
			Connection con =ConnectionFactory .getConnection();
			   Statement stmt= con.createStatement();
			  String sql="update   employee.emp set address='"+emp.getAddress()+"' where id='"+emp.getId()+"' ";
			  int i=stmt.executeUpdate(sql);
			  if(i>0)
			  {
				  System.out.println("data updated"); 
			  }
			  else
			  {
				  System.out.println("no record found");
			  }       
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}	
	}
