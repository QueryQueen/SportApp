// Hierin beschrijf je de methodes die je gebruikt om dingen uit je database te halen
// Je kun hierin dus gebruik maken van de methods uit je repository interface en de crudrepository
// die je implementeert
// CRUD = create, retrieve, update, delete
// standaard funtionaliteiten die je met een database wilt gebruiken
// een soort service desk

package nl.programit.service;
import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.programit.domain.Sport;
import nl.programit.repository.SportRepository;

@Service
public class SportService {
	
	@Autowired
	SportRepository sportRepository; 
	
	public Sport findSport(int id){
		return sportRepository.findOne(id);
	}
	
	public Sport saveSport(Sport sport){
		return sportRepository.save(sport);
	}
	
	public Sport FindLand(String string){
		return sportRepository.findByLandIgnoreCaseContaining(string);
	}
	
	public Collection<Sport> findAllSports(){
		return (Collection<Sport>)sportRepository.findAll();
	}

}
