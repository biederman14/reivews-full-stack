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

		categoryCalifornia = categoryRepo.save(categoryCalifornia);
		categoryKentucky = categoryRepo.save(categoryKentucky);
		categoryWestVirginia = categoryRepo.save(categoryWestVirginia);

		Review reviewCAYosemite = new Review("Yosemite", "Yosemite National Park", 1807,
				"Where moderate climbers become experts, die, or leave climbing alltogether.", categoryCalifornia);
		Review reviewCAJoshuaTree = new Review("Joshua Tree", "Joshua Tree National Park", 5847,
				"A trad climber's paradise for beginners and moderate climbers. Very loose interpretation for 'tree'",
				categoryCalifornia);
		Review reviewKYRed = new Review("Red River Gorge", "Daniel Boone National Park", 1949,
				"Sandstone, sandstone! Juggy, juggy fun! Hueco, iron bars, copperhead - RUN!", categoryKentucky);
		Review reviewWVNew = new Review("New River Gorge", "Located between Fayetteville, WV and Summersville Lake, WV",
				1384, "Three valleys, Summersville - climb, fall, splash!", categoryWestVirginia);

		reviewRepo.save(reviewCAYosemite);
		reviewRepo.save(reviewCAJoshuaTree);
		reviewRepo.save(reviewKYRed);
		reviewRepo.save(reviewWVNew);

	}

}
