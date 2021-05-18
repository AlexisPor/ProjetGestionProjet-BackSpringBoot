package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dao.ModulesRepository;
import fr.formation.entities.AfpaModules;

@Transactional
@Service
public class ModulesServiceImpl implements ModulesService{

	@Autowired
	private ModulesRepository modRep;
	
	@Override
	public void add(AfpaModules afpaModule) {
		// TODO Auto-generated method stub
		modRep.save(afpaModule);
	}

	@Override
	public void delete(AfpaModules afpaModules) {
		// TODO Auto-generated method stub
		modRep.delete(afpaModules);
	}

	@Override
	public void update(AfpaModules afpaModules) {
		// TODO Auto-generated method stub
		modRep.save(afpaModules);
	}

	@Override
	public List<AfpaModules> findAll() {
		// TODO Auto-generated method stub
		return modRep.findAll();
	}

	@Override
	public AfpaModules findById(BigDecimal idModules) {
		// TODO Auto-generated method stub
		return modRep.findById(idModules).get();
	}

}
