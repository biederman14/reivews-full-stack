package org.wecancodeit.reviewsfullstack.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.reviewsfullstack.repository.CategoryRepository;

@Controller
public class CategoryController {

	@Resource
	private CategoryRepository categoryRepo;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("categories")
	public String getCategories(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@GetMapping("/categories/{id}")
	public String getCategory(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(categoryRepo.findById(id));
		model.addAttribute("category", categoryRepo.findById(id).get());
		return "category";
	}

}