package diana.springframework.recipes.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexController {

	@RequestMapping({"", "/", "/index"})
	public String getIndex() {
		return "index";
	}
}
