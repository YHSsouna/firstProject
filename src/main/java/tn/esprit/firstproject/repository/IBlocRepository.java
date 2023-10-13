package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Bloc;

@Repository
public interface IBlocRepository extends CrudRepository<Bloc,Long> {
}
