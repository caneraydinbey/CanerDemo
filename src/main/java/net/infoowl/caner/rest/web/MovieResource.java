package net.infoowl.caner.rest.web;

import net.infoowl.caner.domain.Movie;
import net.infoowl.caner.service.MovieService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by caneraydin on 24.03.2016.
 */

@RestController
@RequestMapping(value = "/movies")
public class MovieResource {

    private MovieService service;

    @Inject
    public void setService(MovieService service) {
        this.service = service;
    }

    @RequestMapping
    ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE
    )
    ResponseEntity<Movie> add(@RequestBody Movie movie){
       return ResponseEntity.ok(service.add(movie));
    }

}
