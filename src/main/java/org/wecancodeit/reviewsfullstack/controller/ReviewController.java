package org.wecancodeit.reviewsfullstack.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviewsfullstack.repository.ReviewRepository;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;

	@RequestMapping("")
	public String listReviews(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";
	}

	@RequestMapping("/{id}")
	public String listReview(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findById(id).get());
		return "review";
	}

}