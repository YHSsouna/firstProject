package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Universite;

@Repository
public interface IUniversiteRepository extends CrudRepository<Universite,Long> {
}
