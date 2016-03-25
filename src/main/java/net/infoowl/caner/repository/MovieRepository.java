package net.infoowl.caner.repository;

import net.infoowl.caner.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by caneraydin on 24.03.2016.
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
