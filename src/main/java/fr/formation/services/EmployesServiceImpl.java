package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.formation.dao.EmployesRepository;
import fr.formation.entities.AfpaEmployes;

@Service
@Transactional
public class EmployesServiceImpl implements EmployesService {
	
	@Autowired
	private EmployesRepository empRepo;

	@Override
	public void add(AfpaEmployes AfpaEmployes) {
		// TODO Auto-generated method stub
		empRepo.save(AfpaEmployes);
	}

	@Override
	public void delete(AfpaEmployes AfpaEmployes) {
		// TODO Auto-generated method stub
		empRepo.delete(AfpaEmployes);
	}

	@Override
	public void update(AfpaEmployes AfpaEmployes) {
		// TODO Auto-generated method stub
		empRepo.save(AfpaEmployes);
	}

	@Override
	public List<AfpaEmployes> findAll() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	@Override
	public AfpaEmployes findById(BigDecimal idemployes) {
		// TODO Auto-generated method stub
		return empRepo.findById(idemployes).get();
	}

	@Override
	public List<AfpaEmployes> findByNomContains(String nom) {
		// TODO Auto-generated method stub
		return empRepo.findByNomContains(nom);
	}

}
