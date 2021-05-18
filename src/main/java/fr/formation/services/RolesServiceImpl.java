package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dao.RolesRepository;
import fr.formation.entities.AfpaRoles;

@Service
@Transactional
public class RolesServiceImpl implements RolesService{

	@Autowired
	private RolesRepository rolRep;
	
	@Override
	public void add(AfpaRoles afpaRoles) {
		// TODO Auto-generated method stub
		rolRep.save(afpaRoles);
	}

	@Override
	public void delete(AfpaRoles afpaRoles) {
		// TODO Auto-generated method stub
		rolRep.delete(afpaRoles);
	}

	@Override
	public void update(AfpaRoles afpaRoles) {
		// TODO Auto-generated method stub
		rolRep.save(afpaRoles);
	}

	@Override
	public List<AfpaRoles> findAll() {
		// TODO Auto-generated method stub
		return rolRep.findAll();
	}

	@Override
	public AfpaRoles findById(BigDecimal idRoles) {
		// TODO Auto-generated method stub
		return rolRep.findById(idRoles).get();
	}

}
