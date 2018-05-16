package com.lab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lab.model.User;
import com.lab.service.UserRepository;

/**
 * author: elumalair
 * date: 05/16/2018
 *
 * if use @RestController, it will not return HTTP page, it serves JSON data instead
 */
@Controller
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/")
    public String index() {
        return "greeting";
    }

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public String getUserInfo(@PathVariable(value = "id") Long id, ModelMap modelMap) {
        User user = userRepository.findByUserId(id);
        if(user == null) return "error";
        modelMap.addAttribute("username", user.getName());
        return "user";
    }
}
