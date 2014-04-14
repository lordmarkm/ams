package com.ams.http.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ams.security.services.RegistrationService;
import com.baldy.commons.web.controller.GenericController;
import com.baldy.commons.web.forms.AccountForm;

/**
 * @author mbmartinez
 */
@Controller
@RequestMapping("/auth")
public class AuthenticationResource extends GenericController {

    private static Logger log = LoggerFactory.getLogger(AuthenticationResource.class);

    @Autowired
    private RegistrationService registrationService;

    @Autowired
    private MessageSource messages;

    @RequestMapping("/login")
    public ModelAndView login(@RequestParam(required = false) String message, 
            @RequestParam(required = false) String error) {
        return mav("login")
                .addObject("message", null != message ? messages.getMessage(message, null, null) : null)
                .addObject("error", null != error ? messages.getMessage(error, null, null) : null);
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView register() {
        return mav("register");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(AccountForm form) {
        log.debug("Received registration request. form={}", form);

        registrationService.register(form.getUsername(), form.getPassword());

        return "redirect:/auth/login?message=login.reg.success";
    }

}
