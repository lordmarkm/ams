package com.ams.rental.core.repo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ams.commons.data.config.PersistenceConfig;
import com.ams.rental.core.config.RentalCoreConfig;
import com.ams.rental.core.models.Tenant;

/**
 * @author mbmartinez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {PersistenceConfig.class, RentalCoreConfig.class})
public class TenantRepoTest {

    @Autowired
    private TenantRepo tenants;

    @Test
    public void testSave() {
        Tenant tenant = new Tenant();
        tenant.setContactNo("09155411987");
        tenant.setName("Mark Martinez");
        tenant.setEmail("lordmarkm@gmail.com");
        Tenant saved = tenants.save(tenant);

        assertEquals(1, tenants.count());
        assertEquals("Mark Martinez", tenants.findOne(saved.getId()).getName());
    }

}
