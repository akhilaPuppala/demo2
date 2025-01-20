package com.spring_rest.demo2.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring_rest.demo2.pojo.MoviePojo;


public interface MovieDao {
	
	List<MoviePojo> getAllMovies();
	MoviePojo getAMovie(int movieId);
	List<MoviePojo> getMoviesByGenre(String movieGenre);
	List<MoviePojo> getMoviesByReleaseYear(int year);
	MoviePojo updateMovie(MoviePojo editMovie);
	void deleteMovie(int movieId);

}
