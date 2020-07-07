package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.Convention;
@Repository
public interface ConventionRepository extends JpaRepository<Convention, Long> {

	public List<Convention> findByobjet(String objet);

	public List<Convention> findBytype(String type);

}
