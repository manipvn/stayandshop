package com.stayandshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stayandshop.entity.Movie;

/**
 * 
 * @author pkalluru
 *
 */
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
