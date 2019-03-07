package diana.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.recipes.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
