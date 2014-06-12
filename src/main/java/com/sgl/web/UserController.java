package com.sgl.web;

import com.sgl.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.sgl.repository.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "") String keyword,
                        @RequestParam(required = false, defaultValue = "0") int page,
                        @RequestParam(required = false, defaultValue = "10") int size, Model modelMap) {
        Page<User> pageData = userRepository.findByLoginnoContainingOrNameContainingOrTelephoneContainingOrEmailContaining(keyword, keyword, keyword, keyword, new PageRequest(page, size));
        modelMap.addAttribute("pageData", pageData);
        modelMap.addAttribute("keyword", keyword);
        return "users/index";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable String id, Model modelMap) {
        modelMap.addAttribute("model", userRepository.findOne(id));
        return "users/form";
    }

    @RequestMapping("/form")
    public String form(User model, BindingResult result, Model modelMap) {
        return "users/form";
    }

    @RequestMapping("/create")
    public String create(User model, Model modelMap) {
        model = userRepository.save(model);
        modelMap.addAttribute("model", model);
        return "users/form";
    }


}
