package diana.springframework.recipes.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.recipes.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {

	Optional<Category> findByDescription(String description);
}
