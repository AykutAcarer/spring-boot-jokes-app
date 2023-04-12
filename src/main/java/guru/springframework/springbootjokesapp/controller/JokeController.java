package guru.springframework.springbootjokesapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.springbootjokesapp.services.JokeService;

/**
 *@author Aykut Acarer
 *created on 12.04.2023
**/

@Controller
public class JokeController {

	private final JokeService jokeService;

	public JokeController(JokeService jokeService) {
		
		this.jokeService = jokeService;
	}

	@RequestMapping({"/", ""})
	public String showJoke(Model model) {
		
		model.addAttribute("joke", jokeService.getJoke());
		return "index";
	}
}
