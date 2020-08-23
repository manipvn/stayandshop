package com.stayandshop.service.Impl;

import java.util.List;
import java.util.Optional;

import com.stayandshop.service.interfaces.MultiPlexMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stayandshop.data.MovieData;
import com.stayandshop.entity.Movie;
import com.stayandshop.repository.MovieRepository;

@Component
public class MultiPlexMovieServiceImpl implements MultiPlexMovieService {
	@Autowired
	MovieRepository movieRepo;
	
	@Override
	public void add(MovieData movieData) {
		movieRepo.save(movieData.getEntity());
	}
	
	@Override
	public void delete(long movieId) {
		movieRepo.deleteById(movieId);
	}
	
	@Override
	public List<Movie> getMovies(){
		return (List<Movie>) movieRepo.findAll();
	}
	
	@Override
	public Movie getMovieById(long movieId) {
		Optional<Movie> movie = movieRepo.findById(movieId);
		return movie.orElseThrow(() -> new NullPointerException("No Movie Found"));
	}
}