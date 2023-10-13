package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Foyer;

@Repository
public interface IFoyerRepository extends CrudRepository<Foyer,Long> {
}
