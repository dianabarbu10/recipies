package diana.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.recipes.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

}
