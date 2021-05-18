package fr.formation.services;

import java.math.BigDecimal;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.dao.TachesRepository;
import fr.formation.entities.AfpaTaches;

@Service
@Transactional
public class TachesServiceImpl implements TachesService{

	@Autowired
	private TachesRepository tachRep;
	
	@Override
	public void add(AfpaTaches afpaTaches) {
		// TODO Auto-generated method stub
		tachRep.save(afpaTaches);
	}

	@Override
	public void delete(AfpaTaches afpaTaches) {
		// TODO Auto-generated method stub
		tachRep.delete(afpaTaches);
	}

	@Override
	public void update(AfpaTaches afpaTaches) {
		// TODO Auto-generated method stub
		tachRep.save(afpaTaches);
	}

	@Override
	public List<AfpaTaches> findAll() {
		// TODO Auto-generated method stub
		return tachRep.findAll();
	}

	@Override
	public AfpaTaches findById(BigDecimal idTaches) {
		// TODO Auto-generated method stub
		return tachRep.findById(idTaches).get();
	}

}
