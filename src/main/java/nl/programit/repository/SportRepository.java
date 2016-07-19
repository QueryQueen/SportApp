// het doel van dit bestand is dat je de crudrepository kunt gebruiken
// hierdoor kun je hun querytaal gebruiken en vertalen naar verschillende databases
// en jouw code dus ook gebruiken als het geen mysql database is
// je schrijft hier de methods met daarin de query 
// en de methods kun je dan weer aanroepen in je Service bestand

package nl.programit.repository;

import org.springframework.data.repository.CrudRepository;
import nl.programit.domain.Sport;

public interface SportRepository extends CrudRepository<Sport, Integer> {

	//hier kun je spring query taal gebruiken en hij vertaalt het naar MySQL
	//dat heb je ingesteld in application.properties
	//crud repository queries
	
	// een voorbeeld van een abstracte method die je kunt definieren hier
	// op basis van die jpa query methods. Voornamelijk als je je eigen veldnamen wilt gebruiken
	// http://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	Sport findByLandIgnoreCaseContaining(String string);
}
