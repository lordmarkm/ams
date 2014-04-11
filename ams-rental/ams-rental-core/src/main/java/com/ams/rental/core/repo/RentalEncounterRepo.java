package com.ams.rental.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.rental.core.models.RentalEncounter;

/**
 * @author mbmartinez
 */
public interface RentalEncounterRepo extends JpaRepository<RentalEncounter, Long> {

}
