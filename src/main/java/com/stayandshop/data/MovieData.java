package com.stayandshop.data;

import java.util.Date;

import com.stayandshop.entity.Movie;

public class MovieData {
	private String movieName;
	private Date movieStartDate;
	private Date movieEndDate;
	
	public MovieData(String movieName, Date movieStartDate, Date movieEndDate) {
		// TODO Auto-generated constructor stub
		this.movieName = movieName;
		this.movieEndDate = movieEndDate;
		this.movieStartDate = movieStartDate;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Date getMovieStartDate() {
		return movieStartDate;
	}
	public void setMovieStartDate(Date movieStartDate) {
		this.movieStartDate = movieStartDate;
	}
	public Date getMovieEndDate() {
		return movieEndDate;
	}
	public void setMovieEndDate(Date movieEndDate) {
		this.movieEndDate = movieEndDate;
	}
	
	public Movie getEntity() {
		Movie movie = new Movie();
		movie.setMovieStartDate(movieStartDate);
		movie.setMovieEndDate(movieEndDate);
		movie.setMovieTitle(movieName);
		return movie;
	}
	
}
