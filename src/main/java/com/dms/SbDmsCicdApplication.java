package com.dms;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dms.evaluation.controller.DMSController;
import com.dms.evaluation.model.Doctor;
import com.dms.evaluation.repository.DMSRepository;

@SpringBootApplication
public class SbDmsCicdApplication {

	 static DMSRepository dao=new DMSRepository();
		public  Doctor details()
		{
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1.Appointment number"
					+ "2.Doctor Name" 
					+ "3.Department"
					+ "4.Appointment Date"
					+ "5.Appointment Time"
					+ "6.Patient Name ");
			
			return new Doctor(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next());
		}

	public static void main(String[] args) {
		SpringApplication.run(SbDmsCicdApplication.class, args);
		
		SbDmsCicdApplication obj=new SbDmsCicdApplication();
		Doctor bean=obj.details();
		DMSController controller=new DMSController();
		controller.performInsert(bean);
		
	}

}
