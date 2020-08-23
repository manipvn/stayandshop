package com.stayandshop.service.interfaces;

import java.util.List;

import com.stayandshop.data.MovieData;
import com.stayandshop.entity.Movie;

public interface MultiPlexMovieService {

	public void add(MovieData movieData);
	public void delete(long movieId);
	public List<Movie> getMovies();
	public Movie getMovieById(long movieId);
}
