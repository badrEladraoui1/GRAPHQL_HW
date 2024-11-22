package com.eladr.data_rest;

import com.eladr.data_rest.entity.Centre;
import com.eladr.data_rest.entity.Student;
import com.eladr.data_rest.enums.Gender;
import com.eladr.data_rest.repository.CentreRepo;
import com.eladr.data_rest.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.graphql.data.method.annotation.Argument;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DataRestApplication implements CommandLineRunner {

	@Autowired
	StudentRepo studentRepo;
	@Autowired
	CentreRepo centreRepo;

	public static void main(String[] args) {
		SpringApplication.run(DataRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Centre centre1 = Centre.builder()
				.nomCentre("Maarif").address("Biranzarane").build();

		centreRepo.save(centre1);

		Centre centre2 = Centre.builder()
				.nomCentre("Oranges").address("Oulfa").build();

		centreRepo.save(centre2);

		Student et1 = Student.builder()
				.firstName("Adnani 1").lastName("Brahim 1").gender(Gender.MALE)
				.centre(centre1).build();

		studentRepo.save(et1);

		Student et2 = Student.builder()
				.firstName("Adnani 2").lastName("Fatima 1").gender(Gender.FEMALE)
				.centre(centre2).build();

		studentRepo.save(et2);

		Student et3 = Student.builder()
				.firstName("Adnani 3").lastName("Said 3").gender(Gender.MALE)
				.centre(centre1).build();

		studentRepo.save(et3);

		Student et4 = Student.builder()
				.firstName("Adnani 4").lastName("Khadija 4").gender(Gender.FEMALE)
				.centre(centre2).build();

		studentRepo.save(et4);

		Student et5 = Student.builder()
				.firstName("Adnani 5").lastName("Aziz 5").gender(Gender.MALE)
				.centre(centre1).build();

		studentRepo.save(et5);
	}

}
