package ua.lviv.lgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.entity.University;
import ua.lviv.lgs.hw17.service.UniversityService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		UniversityService service = ctx.getBean(UniversityService.class);

		University university = new University("UNIVERSITY", "I STAGE", 5, 1000, "UA, LVIV");
		System.out.println(service.readById(service.create(university).getId()));

		university.setAcreditation("II STAGE");
		System.out.println(service.readById(service.update(university).getId()));

		University university2 = new University("UNIVERSITY2", "III STAGE", 10, 10000, "USA, NEW-YORK");
		System.out.println(service.readById(service.create(university2).getId()));

		System.out.println(service.findAll());

		service.deleteById(university.getId());

		System.out.println(service.findAll());

		service.deleteById(university2.getId());

		System.out.println(service.findAll());
	}

}
