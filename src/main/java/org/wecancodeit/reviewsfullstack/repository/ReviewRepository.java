package org.wecancodeit.reviewsfullstack.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviewsfullstack.model.Review;

public interface ReviewRepository extends CrudRepository<Review, Long> {

}
