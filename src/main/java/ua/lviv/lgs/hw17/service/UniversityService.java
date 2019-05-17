package ua.lviv.lgs.hw17.service;

import java.util.List;

import ua.lviv.lgs.entity.University;

public interface UniversityService {

	University create(University u);

	University readById(Long id);

	University update(University u);

	void deleteById(Long id);

	List<University> findAll();

}
