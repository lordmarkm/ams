package com.ams.rental.core.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.rental.core.models.Tenant;

/**
 * @author mbmartinez
 */
public interface TenantRepo extends JpaRepository<Tenant, Long> {

}
