package ua.pride.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.pride.models.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {
}
