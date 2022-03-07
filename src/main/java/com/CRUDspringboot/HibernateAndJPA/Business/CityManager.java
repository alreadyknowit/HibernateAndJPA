package com.CRUDspringboot.HibernateAndJPA.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.CRUDspringboot.HibernateAndJPA.DataAccess.ICityDal;
import com.CRUDspringboot.HibernateAndJPA.Entities.City;

@Service
public class CityManager implements ICityService{

	ICityDal cityDal;
	
	@Autowired
	public CityManager(ICityDal cityDal) {
		this.cityDal=cityDal;
	}
	
	@Override
	@Transactional
	public List<City> getAll() {
		return this.cityDal.getAll();
	}

	@Override
	public void add(City city) {
		cityDal.add(city);
		
	}

	@Override
	public void update(City city) {
		cityDal.update(city);
		
	}

	@Override
	public void delete(City city) {
		cityDal.delete(city);
		
	}

	@Override
	public City getById(int id) {
		
		return cityDal.getById(id);
	}


	
	

}
