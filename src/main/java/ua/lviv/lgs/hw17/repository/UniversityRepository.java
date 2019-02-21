package ua.lviv.lgs.hw17.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.hw17.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {

}
