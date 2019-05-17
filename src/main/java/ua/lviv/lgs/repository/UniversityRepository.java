package ua.lviv.lgs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.entity.University;

@Repository
public interface UniversityRepository extends JpaRepository<University, Long> {

}
