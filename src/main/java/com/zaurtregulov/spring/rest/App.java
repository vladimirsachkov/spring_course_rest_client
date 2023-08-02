package com.zaurtregulov.spring.rest;

import com.zaurtregulov.spring.rest.configuration.MyConfig;
import com.zaurtregulov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication"
                , Communication.class);

//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee empByID = communication.getEmployee(3);
//        System.out.println(empByID);

//        Employee emp = new Employee("Sveta", "Sokolova"
//                , "HR", 900);
//        communication.saveEmployee(emp);

//        Employee emp = new Employee("Sveta", "Sokolova"
//                , "IT", 1200);
//        emp.setId(15);
//        communication.saveEmployee(emp);

            communication.deleteEmployee(15);
    }
}
