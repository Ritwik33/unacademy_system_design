package lld.designCaseStudies.movieBookingApplication.service;

import lld.designCaseStudies.movieBookingApplication.entities.Movie;
import lld.designCaseStudies.movieBookingApplication.entities.User;

public interface MovieService {

    /**
     * allow user to search the movie
     */

    public Movie findMovieByName(String name);
    public Movie findMovieById(String id);

    /**
     * create a movie -> only admin should be allowed
     */

    public Movie createMovie(User user);
    public Movie updateMovie(User user);
}
