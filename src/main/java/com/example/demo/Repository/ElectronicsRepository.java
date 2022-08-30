package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Electronics;
@Repository
public interface ElectronicsRepository extends JpaRepository<Electronics,Integer> {
	Electronics findByName(String name);

}
