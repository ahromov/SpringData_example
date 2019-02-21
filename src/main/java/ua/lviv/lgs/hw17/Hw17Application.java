package ua.lviv.lgs.hw17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.hw17.entity.University;
import ua.lviv.lgs.hw17.service.UniversityService;

@SpringBootApplication
public class Hw17Application {

    public static void main(String[] args) {
	ConfigurableApplicationContext ctx = SpringApplication.run(Hw17Application.class, args);
	UniversityService service = ctx.getBean(UniversityService.class);

	University university = new University();
	university.setName("UNIVERSITY");
	university.setAcreditation("I STAGE");
	university.setInstCount(5);
	university.setStudentsCount(1000);
	university.setAddress("UA, LVIV");

	service.create(university);

	System.out.println(service.readById(university.getId()));

	university.setAcreditation("II STAGE");
	
	service.update(university);
	System.out.println(service.readById(university.getId()));

	University university2 = new University();
	university2.setName("UNIVERSITY2");
	university2.setAcreditation("III STAGE");
	university2.setInstCount(10);
	university2.setStudentsCount(10000);
	university2.setAddress("USA, NEW-YORK");

	service.create(university2);	
	System.out.println(service.readById(university2.getId()));
	
	System.out.println(service.findAll());
	
	service.deleteById(university.getId());
	System.out.println(service.findAll());	
    }

}
