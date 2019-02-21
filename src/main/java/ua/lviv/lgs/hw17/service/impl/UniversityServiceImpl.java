package ua.lviv.lgs.hw17.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.lgs.hw17.entity.University;
import ua.lviv.lgs.hw17.repository.UniversityRepository;
import ua.lviv.lgs.hw17.service.UniversityService;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    UniversityRepository universityRepository;

    @Override
    public University create(University u) {
	return universityRepository.saveAndFlush(u);
    }

    @Override
    public University readById(Long id) {
	return universityRepository.getOne(id);
    }

    @Override
    public University update(University u) {	
	return universityRepository.save(u);
    }

    @Override
    public void deleteById(Long id) {
	universityRepository.deleteById(id);
    }

    @Override
    public List<University> findAll() {
	return universityRepository.findAll();
    }

}
