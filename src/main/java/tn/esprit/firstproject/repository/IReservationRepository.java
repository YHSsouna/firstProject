package tn.esprit.firstproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.firstproject.entities.Reservation;

@Repository
public interface IReservationRepository extends CrudRepository<Reservation,String> {
}
