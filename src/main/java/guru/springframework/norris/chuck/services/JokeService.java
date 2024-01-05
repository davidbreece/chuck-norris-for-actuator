package guru.springframework.norris.chuck.services;

import org.springframework.stereotype.Service;

@Service
public interface JokeService {
    String getRandomJoke();

}
