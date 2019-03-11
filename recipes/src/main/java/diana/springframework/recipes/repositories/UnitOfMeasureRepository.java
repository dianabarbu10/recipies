package diana.springframework.recipes.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.recipes.model.UnitOfMeasure;

public interface UnitOfMeasureRepository
		extends
			CrudRepository<UnitOfMeasure, Long> {

	Optional<UnitOfMeasure> findByDescription(String description);
}
