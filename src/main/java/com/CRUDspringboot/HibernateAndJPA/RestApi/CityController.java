package com.CRUDspringboot.HibernateAndJPA.RestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUDspringboot.HibernateAndJPA.Business.ICityService;
import com.CRUDspringboot.HibernateAndJPA.Entities.City;

@RestController
@RequestMapping("/api")
public class CityController {

	private ICityService cityService;

	
	public CityController(ICityService cityService) {
		this.cityService = cityService;
	}
	
	@GetMapping("/cities")
	public List<City> get(){
		return cityService.getAll();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody City city) {
		cityService.add(city);
	}
	
	@PostMapping("/update")
	public void update(@RequestBody City city) {
		cityService.update(city);
	}
	
	@PostMapping("/delete")
	public void delete(City city) {
		cityService.delete(city); 
	}
	
	@GetMapping("/cities/{id}")
	public City getById(@PathVariable int id) {
		return cityService.getById(id);
	}
	

}
