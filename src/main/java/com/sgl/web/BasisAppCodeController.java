package com.sgl.web;

import com.sgl.model.BasisAppCode;
import com.sgl.repository.BasisAppCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/basis-app")
public class BasisAppCodeController {

    @Autowired
    BasisAppCodeRepository repository;

    @RequestMapping("/")
    public String index(@RequestParam(required = false, defaultValue = "") String keyword,
                        @RequestParam(required = false, defaultValue = "0") int page,
                        @RequestParam(required = false, defaultValue = "10") int size, Model modelMap) {
        Page<BasisAppCode> pageData = repository.findAll(new PageRequest(page, size));
        modelMap.addAttribute("pageData", pageData);
        modelMap.addAttribute("keyword", keyword);
        return "basis-app/index";
    }

    @RequestMapping("/{id}")
    public String view(@PathVariable String id, Model modelMap) {
        modelMap.addAttribute("model", repository.findOne(id));
        return "basis-app/form";
    }

    @RequestMapping("/form")
    public String form(BasisAppCode model, BindingResult result, Model modelMap) {
        return "basis-app/form";
    }

    @RequestMapping("/create")
    public String create(BasisAppCode model, Model modelMap) {
        model = repository.save(model);
        modelMap.addAttribute("model", model);
        return "basis-app/form";
    }


}
