package org.wecancodeit.reviewsfullstack.repository;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviewsfullstack.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
