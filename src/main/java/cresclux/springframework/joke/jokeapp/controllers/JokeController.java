package cresclux.springframework.joke.jokeapp.controllers;

import cresclux.springframework.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by laksheenmendis on 5/24/20 at 1:43 PM
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    // but this annotation is not mandatory to have when DI using constructor
    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model)
    {
        model.addAttribute("joke", jokeService.getJoke());

        // this tells the thymeleaf template engine to show the view "chucknorris"
        return "chucknorris";
    }
}
