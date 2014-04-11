package com.ams.rental.core.resource;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "", description = "Tenant operations")
@RequestMapping("/tenants")
@RestController
public class TenantResource {

    @Autowired
    private Mapper mapper;

    @RequestMapping(method = GET)
    @ApiOperation("Get an ok!")
    public ResponseEntity<String> get() {
        return new ResponseEntity<>("Ok!", OK);
    }

}
