package net.infoowl.caner.service;

import net.infoowl.caner.domain.Movie;
import net.infoowl.caner.repository.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by caneraydin on 24.03.2016.
 */

@Service
@Transactional
public class MovieService {

    private MovieRepository repository;

    @Inject
    public void setRepository(MovieRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Movie> findAll() {
        return repository.findAll();
    }

    public Movie add(Movie movie) {
        return repository.save(movie);
    }
}
