package com.spring.learndto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.learndto.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
