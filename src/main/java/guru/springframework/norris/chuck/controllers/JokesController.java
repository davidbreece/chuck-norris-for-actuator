package guru.springframework.norris.chuck.controllers;

import guru.springframework.norris.chuck.services.ChuckNorrisJokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisJokeService jokeService;


    public JokesController(ChuckNorrisJokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        String joke = this.jokeService.getRandomJoke();
        model.addAttribute("joke", joke);
        return "jokes/index";
    }


}
