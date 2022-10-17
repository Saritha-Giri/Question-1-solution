package com.test.concept;
import java.util.Scanner;
public class Controller
{
	static Scanner sc = new Scanner(System.in);
	public static  void choice()
	{
        System.out.println("Enter \n1.Dispaly\n2.Add\n3.Update\n4.Delete");
        int n = sc.nextInt();
        if(n==1)
        {
        Controller.displayData();
        }
        else if(n==2)
        {
        	Controller.addData();;
        }
        else if(n==3)
        {
            Controller.updateAdress();
        }
        else if(n==4)
        {
             Controller.deleteData();
            
        }
        else
        {
            System.out.println("Invalid selection\nSelect again");
            choice();
        }
	}
	 public static void repeat()
	 {
		 System.out.println(" press 1 if you want to continue press any key if you want to exit");
		 //System.out.println("press\n1.continue\n2.exit");
		 int ch=sc.nextInt();
		 if(ch==1)
		 {
			choice();
			 
		 }
		 else
		 {
			 System.out.println("invalid selection");
			 
		 }
	 }
    
    public static void addData()
    {
        Employee employee = new Employee();
        System.out.println("Enter user id:");
        employee.setId(sc.nextInt());
        System.out.println("Enter user name:");
        employee.setName(sc.next());
        System.out.println("Enter  user Adress:");
        employee.setAddress(sc.next());
        System.out.println("Enter user password:");
        employee.setPassword(sc.nextInt());
        EmployeeService sr = new EmployeeService();
        System.out.println("data added successfully ");
        sr.addEmployee(employee);
        repeat();
      
    }
    public static void displayData()
    {
        EmployeeService es = new EmployeeService();
        System.out.println("data displayed successfully");
        es.displayEmployee();
        repeat();
        
    }
    public static void updateData()
    {
    	Employee employee = new Employee();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your id");
    	employee.setId(sc.nextInt());
    	System.out.println("enter your name");
    	 employee.setName(sc.next());
    	EmployeeService es = new EmployeeService();
        es.updateName(employee);
        repeat(); 
    }
    public static void updatePassword()
    {
    	Employee employee = new Employee();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your id");
    	employee.setId(sc.nextInt());
    	 System.out.println("enter your password");
    	 employee.setPassword(sc.nextInt());
    	EmployeeService es = new EmployeeService();
   es.updatePassword(employee);
   repeat();
    }
    public static void updateAdress()
    {
    	Employee employee = new Employee();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter your id");
    	employee.setId(sc.nextInt());
    	 System.out.println("enter your Adress");
    	 employee.setAddress(sc.next());
    	EmployeeService es = new EmployeeService();
        es.updateAdress(employee);
        repeat();
    }
    public static void deleteData()
    {
        Employee employee = new Employee();
        System.out.println("Enter user name:");
        employee.setName(sc.next());
        EmployeeService service = new EmployeeService();
        System.out.println("Data deleted successfully");
        service.deleteEmployee(employee);
        repeat();
    }
    public static void main(String[] args)
    {
    	Controller.choice();
    }
} 