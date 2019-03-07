package diana.springframework.recipes.repositories;

import org.springframework.data.repository.CrudRepository;

import diana.springframework.recipes.model.UnitOfMeasure;

public interface UnitOfMeasureRepository
		extends
			CrudRepository<UnitOfMeasure, Long> {

}
