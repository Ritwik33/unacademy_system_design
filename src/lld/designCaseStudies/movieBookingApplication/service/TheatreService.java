package lld.designCaseStudies.movieBookingApplication.service;

import lld.designCaseStudies.movieBookingApplication.entities.Movie;
import lld.designCaseStudies.movieBookingApplication.entities.Theatre;
import lld.designCaseStudies.movieBookingApplication.entities.User;

import java.util.List;

public interface TheatreService {

    public List<Theatre> findTheatreByZipcode(int zipCode);
    public Theatre findTheatreByName(String name);
    public List<Movie> findMoviesInATheatre(String theatreName);
    public void addMoviesInATheatre(String theatreName, long movieId, User user);
    public void removeMoviesInATheatre(String theatreName, long movieId, User user);

}
