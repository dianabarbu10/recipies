package diana.springframework.recipes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import diana.springframework.recipes.service.RecipeService;

public class IndexController {

	@Autowired
	private RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping({"", "/", "/index"})
	public String getIndex(Model model) {
		System.out.println("I know i am here");
		model.addAttribute("recipes", recipeService.getRecipes());
		return "index";
	}
}
