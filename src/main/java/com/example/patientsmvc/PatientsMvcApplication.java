package com.example.patientsmvc;

import com.example.patientsmvc.entities.Patient;
import com.example.patientsmvc.repositories.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class PatientsMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsMvcApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PatientRepository patientRepository){
		return args -> {
			System.out.println( " .d8888b.           888     888\nd88    88b          888     888      2023\n888    888          888     888\n888    888 888  888 888     888 88888b.  .d88888\n888    888  88..88  888     888 888 \"88b 880\n888    888   X88X   888     888 888  888 '88888b.\nY88    88P  d8''8b  '88.   .88' 888  888      888\n 'Y8888P'  888  888   '88888'   888  888  88888P\n");

			patientRepository.save(new Patient(null, "Abdelaziz", new Date(), false, 54));
			patientRepository.save(new Patient(null, "Adil", new Date(), true, 21));
			patientRepository.save(new Patient(null, "Hind", new Date(), false, 84));
			patientRepository.save(new Patient(null, "Jamila", new Date(), false, 93));
			patientRepository.save(new Patient(null, "Khalid", new Date(), false, 64));
			patientRepository.save(new Patient(null, "Larbi", new Date(), true, 51));
			patientRepository.save(new Patient(null, "Latifa", new Date(), false, 84));
			patientRepository.save(new Patient(null, "Majida", new Date(), false, 63));
			patientRepository.save(new Patient(null, "Mobarek", new Date(), false, 98));
			patientRepository.save(new Patient(null, "Naima", new Date(), false, 49));
			patientRepository.save(new Patient(null, "Naoufal", new Date(), true, 24));
			patientRepository.save(new Patient(null, "Noura", new Date(), true, 7));
			patientRepository.save(new Patient(null, "Ouissal", new Date(), false, 74));
			patientRepository.save(new Patient(null, "Othmane", new Date(), true, 8));
			patientRepository.save(new Patient(null, "Rabia", new Date(), false, 69));
			patientRepository.save(new Patient(null, "Rachid", new Date(), false, 95));
			patientRepository.save(new Patient(null, "Reda", new Date(), false, 46));
			patientRepository.save(new Patient(null, "Redouane", new Date(), false, 96));
			patientRepository.save(new Patient(null, "Rim", new Date(), true, 36));
			patientRepository.save(new Patient(null, "Samir", new Date(), false, 54));
			patientRepository.save(new Patient(null, "Siham", new Date(), true, 17));
			patientRepository.save(new Patient(null, "Thami", new Date(), false, 83));
			patientRepository.save(new Patient(null, "Yassine", new Date(), false, 73));
			patientRepository.save(new Patient(null, "Yassir", new Date(), true, 48));
			patientRepository.save(new Patient(null, "Yasamine", new Date(), false, 67));
			patientRepository.save(new Patient(null, "Yazid", new Date(), false, 53));

			for(int i=0; i<20; i++)
				patientRepository.save(new Patient(null, "user_"+i, new Date(), false, (int) (Math.random()*100)));

//			patientRepository.findAll().forEach(patient -> {
//				System.out.println(patient.getNom() + " : " + patient.getScore());
//			});
		};
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
