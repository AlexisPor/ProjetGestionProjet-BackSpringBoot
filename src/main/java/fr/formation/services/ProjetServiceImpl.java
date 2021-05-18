package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dao.ProjetRepository;
import fr.formation.entities.AfpaProjet;

@Service
@Transactional
public class ProjetServiceImpl implements ProjetService{

	@Autowired
	private ProjetRepository proRep;
	
	@Override
	public void add(AfpaProjet afpaProjet) {
		// TODO Auto-generated method stub
		proRep.save(afpaProjet);
	}

	@Override
	public void delete(AfpaProjet afpaProjet) {
		// TODO Auto-generated method stub
		proRep.delete(afpaProjet);
	}

	@Override
	public void update(AfpaProjet afpaProjet) {
		// TODO Auto-generated method stub
		proRep.save(afpaProjet);
	}

	@Override
	public List<AfpaProjet> findAll() {
		// TODO Auto-generated method stub
		return proRep.findAll();
	}

	@Override
	public AfpaProjet findById(BigDecimal idProjet) {
		// TODO Auto-generated method stub
		return proRep.findById(idProjet).get();
	}

}
