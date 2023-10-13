package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Chambre;

@Repository
public interface IChambreRepository extends CrudRepository<Chambre,Long> {
}
