package com.ams.rental.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.rental.core.models.RentalRoom;

/**
 * @author mbmartinez
 */
public interface RentalRoomRepo extends JpaRepository<RentalRoom, Long> {

}
