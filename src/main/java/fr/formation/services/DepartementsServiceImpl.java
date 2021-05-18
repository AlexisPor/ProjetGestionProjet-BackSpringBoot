package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dao.DepartementsRepository;
import fr.formation.entities.AfpaDepartements;

@Service
@Transactional
public class DepartementsServiceImpl implements DepartementsService {

	@Autowired
	private DepartementsRepository depRepo;
	
	@Override
	public void add(AfpaDepartements AfpaDepartements) {
		// TODO Auto-generated method stub
		depRepo.save(AfpaDepartements);
	}

	@Override
	public void delete(AfpaDepartements AfpaDepartements) {
		// TODO Auto-generated method stub
		depRepo.delete(AfpaDepartements);
	}

	@Override
	public void update(AfpaDepartements AfpaDepartements) {
		// TODO Auto-generated method stub
		depRepo.save(AfpaDepartements);
	}

	@Override
	public List<AfpaDepartements> findAll() {
		// TODO Auto-generated method stub
		return depRepo.findAll();
	}

	@Override
	public AfpaDepartements findById(BigDecimal idDepartements) {
		// TODO Auto-generated method stub
		return depRepo.findById(idDepartements).get();
	}

}
