package com.stayandshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stayandshop.data.MovieData;
import com.stayandshop.entity.Movie;
import com.stayandshop.service.interfaces.MultiPlexMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MultiPlexMovieService movieService;

	@GetMapping
	public List<Movie> getMovies() {
		return movieService.getMovies();
	}

	@PostMapping
	public void saveMovie(@RequestBody MovieData movieData) {
		movieService.add(movieData);
	}

	@GetMapping("/{id}")
	public Movie getById(@PathVariable(required = true) long id) {
		return movieService.getMovieById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteMovie(@PathVariable(required = true) long id) {
		movieService.delete(id);
	}

}
