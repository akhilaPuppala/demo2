package com.spring_rest.demo2.service;

import java.time.LocalDate;
import java.util.List;

import com.demo.spring_rest.demo2.pojo.MoviePojo;

public interface MovieService {
	List<MoviePojo> getAllMovies();
	MoviePojo getAMovie(int movieId);
	List<MoviePojo> getMoviesByGenre(String movieGenre);
	MoviePojo updateMovie(MoviePojo editMovie);
	void deleteMovie(int movieId);
	List<MoviePojo> getMoviesByReleaseYear(int year);

}
