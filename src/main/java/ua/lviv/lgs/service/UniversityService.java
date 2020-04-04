package ua.lviv.lgs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.model.University;
import ua.lviv.lgs.repository.UniversityRepository;

@Service
public class UniversityService {

	@Autowired
	UniversityRepository universityRepository;

	public University create(University u) {
		return universityRepository.saveAndFlush(u);
	}

	public University readById(Long id) {
		return universityRepository.getOne(id);
	}

	public University update(University u) {
		return universityRepository.save(u);
	}

	public void deleteById(Long id) {
		universityRepository.deleteById(id);
	}

	public List<University> findAll() {
		return universityRepository.findAll();
	}

}
