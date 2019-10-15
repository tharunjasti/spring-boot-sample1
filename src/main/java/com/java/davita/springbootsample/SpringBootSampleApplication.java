package com.java.davita.springbootsample;

import com.java.davita.springbootsample.model.Employee;
import com.java.davita.springbootsample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootSampleApplication {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}



	@Bean
	public ApplicationRunner applicationRunner(){
		return args -> {
			List<Employee> employeeList=new ArrayList<>();
			employeeList.add(new Employee(1,"Tharun","Java", "Davita","Nashville","9322"));
			employeeList.add(new Employee(2,"Raj","Java", "Davita","Phoenix","9322"));
			employeeList.add(new Employee(3,"Vamsi","Java", "Automobile","Hyderabad","9322"));
			employeeList.add(new Employee(4,"Vivek","Analysitics", "Walmart","Bangalore","9322"));
			employeeList.add(new Employee(5,"Imram","Angular", "Cyber Stlyus","Vizag","9322"));
			employeeList.add(new Employee(6,"Kavya","Data Scienec", "Pet Smart","Los Aangles","9322"));
			employeeList.add(new Employee(7,"Kranthi","Pega", "Bank","St Louis","9322"));
			employeeList.add(new Employee(8,"Buble","SQL", "IBM","Dallas","9322"));
			employeeList.add(new Employee(9,"Anusha",".net", "Devops","Warshaw","9322"));
			employeeList.add(new Employee(10,"Rakesh","Testing", "Mind tree","PortLand","9322"));
			employeeList.add(new Employee(11,"Gopal","Business", "San","San Antonio","9322"));

			employeeRepository.saveAll(employeeList);
			System.out.println(employeeRepository.findAll().size());
			System.out.println("All records are inseted");
		};
	}
}
