package org.wecancodeit.reviewsfullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import org.wecancodeit.reviewsfullstack.model.Category;
import org.wecancodeit.reviewsfullstack.model.Review;
import org.wecancodeit.reviewsfullstack.repository.CategoryRepository;
import org.wecancodeit.reviewsfullstack.repository.ReviewRepository;

@Service
public class CategoryPopulator implements CommandLineRunner {

	@Resource
	CategoryRepository categoryRepo;

	@Resource
	ReviewRepository reviewRepo;

	@Override
	public void run(String... args) throws Exception {
		Category categoryCalifornia = new Category("California");
		Category categoryKentucky = new Category("Kentucky");
		Category categoryWestVirginia = new Category("West Virginia");
		Category categoryOhio = new Category("Ohio");

		categoryCalifornia = categoryRepo.save(categoryCalifornia);
		categoryKentucky = categoryRepo.save(categoryKentucky);
		categoryWestVirginia = categoryRepo.save(categoryWestVirginia);
		categoryOhio = categoryRepo.save(categoryOhio);

		Review reviewCAYosemite = new Review("Yosemite", "Yosemite National Park", 1807,
				"Where moderate climbers become experts, die, or leave climbing alltogether.", categoryCalifornia);
		Review reviewCAJoshuaTree = new Review("Joshua Tree", "Joshua Tree National Park", 5847,
				"A trad climber's paradise for beginners and moderate climbers. Very loose interpretation for 'tree'",
				categoryCalifornia);
		Review reviewKYRed = new Review("Red River Gorge", "Daniel Boone National Park", 1949,
				"Sandstone, sandstone! Juggy, juggy fun! Hueco, iron bars, copperhead - RUN!", categoryKentucky);
		Review reviewWVNew = new Review("New River Gorge", "Located between Fayetteville, WV and Summersville Lake, WV",
				1384,
				"Summersville, Deep Water - climb, fall, splash! Lake's down? Climb on ground: three valley bash.",
				categoryWestVirginia);
		Review reviewWVSeneca = new Review("Seneca Rocks", "Monongahela National Forest", 290,
				"Trad it out? Try it out! Decent for beginners. Mulit-pitch is the dish, top out on quartzite pinnacle.",
				categoryWestVirginia);
		Review reviewOHMadRiver = new Review("Mad River Gorge", "Springfield, Ohio", 144,
				"Undercut, bourlder starts. Easy once you're up. Short climbs, weird time. Constantly soggy.",
				categoryOhio);
		Review reviewOHWhipps = new Review("Whipps Ledges", "Hinckley Reservation", 107,
				"Sandston, gritty, gross. Toprope and boulder. School kids everywhere stairing over shoulder.",
				categoryOhio);
		Review reviewOHHocking = new Review("Hocking Hills", "Athens, Ohio", 48,
				"Boulder, boulder on the ground. Grab a crashpad, feel around. Mossy, sloppy, slopey starts. Add finger pockets - off the charts! ",
				categoryOhio);

		reviewRepo.save(reviewCAYosemite);
		reviewRepo.save(reviewCAJoshuaTree);
		reviewRepo.save(reviewKYRed);
		reviewRepo.save(reviewWVNew);
		reviewRepo.save(reviewWVSeneca);
		reviewRepo.save(reviewOHMadRiver);
		reviewRepo.save(reviewOHWhipps);
		reviewRepo.save(reviewOHHocking);

	}

}