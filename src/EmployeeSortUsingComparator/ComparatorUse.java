package EmployeeSortUsingComparator;

import java.util.*;

/**
 * Write a program to sort EmployeeSortUsingComparator.ComparatorUse.EmployeeSortUsingComparator.Employee objects based on highest salary using Comparator. EmployeeSortUsingComparator.ComparatorUse.EmployeeSortUsingComparator.Employee class{ Double Age; Double Salary; String Name
 * Created by miral on 6/22/2017.
 */
public class ComparatorUse {
    public static void main(String args[]) {

        ArrayList<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("miral", 23d, 45000d));
        employeeList.add(new Employee("kunal", 29d, 35000d));
        employeeList.add(new Employee("pawan", 28d, 25000d));
        employeeList.add(new Employee("somya", 23d, 55000d));


        System.out.println("sorting by salary :");

        Collections.sort(employeeList, new salaryComparator());
        Iterator itr2 = employeeList.iterator();
        while (itr2.hasNext()) {
            Employee emp = (Employee) itr2.next();
            System.out.println(emp.name + " " + emp.age + " " + emp.salary);
        }

    }
}


     class Employee {
        String name;
        Double age;
        Double salary;

        public Employee(String name, Double age, Double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }




    }


    class salaryComparator implements Comparator {
        public int compare(Object o1,Object o2){
            Employee e1=(Employee)o1;
            Employee e2=(Employee)o2;

            if(e1.salary==e2.salary)
                return 0;
            else if(e2.salary>e1.salary)
                return 1;
            else
                return -1;
        }

    }

