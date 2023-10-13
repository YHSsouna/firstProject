package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Etudiant;

@Repository
public interface IEtudiantRepository extends CrudRepository<Etudiant,Long> {
}
