package com.ams.http.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.baldy.commons.web.controller.GenericController;
import com.baldy.commons.web.forms.AccountForm;

/**
 * @author mbmartinez
 */
@Controller
@RequestMapping("/auth")
public class AuthenticationResource extends GenericController {

    private static Logger log = LoggerFactory.getLogger(AuthenticationResource.class);

    @RequestMapping("/login")
    public ModelAndView login(String message, String error) {
        return mav("login");
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        return mav("register");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView register(@RequestBody AccountForm form) {
        log.debug("Received registration request. form={}", form);
        return mav("register");
    }

}
