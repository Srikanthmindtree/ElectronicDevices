package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Electronics;
import com.example.demo.Services.ElectronicsService;

@RestController
public class ElectronicsController {
@Autowired
private ElectronicsService service;
@PostMapping("/electronic")
public Electronics addElectronics(@RequestBody Electronics k) {
	return service.saveElectronics(k);
	}
@GetMapping("/allElectronics")
public List<Electronics> getAll(){
	return service.getAll();
}

@PostMapping("/electronics")
public List<Electronics> addElectronicss(@RequestBody List<Electronics> m){
	return service.saveElectronicss(m);
}
@GetMapping("/Electronics")
public Optional<Electronics> findAllElectronicss(){
	return service.getElectronics();
}
@GetMapping("/Electronics/{id}")
public Electronics findElectronicsById(@PathVariable Integer id) {
	return service.getElectronicsById(id);
}
@GetMapping("/Electronics/{name}")
public Electronics findElectronicsByName(@PathVariable String name) {
return service.getElectronicsByName(name);
}
@PostMapping("/update")
public Electronics updateElectronics(@RequestBody Electronics k) {
	return service.saveElectronics(k);
}
@DeleteMapping("/delete/{id}")
public String deleteElectronics(@PathVariable int id)
{
	return service.deleteElectronics(id);
}









}
