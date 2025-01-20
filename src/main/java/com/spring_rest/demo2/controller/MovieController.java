package com.spring_rest.demo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.spring_rest.demo2.pojo.MoviePojo;
import com.spring_rest.demo2.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
	@GetMapping("/movies")
	List<MoviePojo> getAllMovies()
	{
		return movieService.getAllMovies();
		
	}
	@GetMapping("/movie/id/{movieId}")
	MoviePojo getAMovie(@PathVariable int movieId)
	{
		return movieService.getAMovie(movieId);
		
	}
	@GetMapping("/movies/genre/{movieGenre}")
	List<MoviePojo> getMoviesByGenre(@PathVariable String movieGenre)
	{
		return movieService.getMoviesByGenre(movieGenre);
	}
	
	@GetMapping("/movies/year/{year}")
	List<MoviePojo> getMoviesByReleaseYear(@PathVariable int year)
	{
		return movieService.getMoviesByReleaseYear(year);
	}
	@PutMapping("/movies")
	MoviePojo updateMovie(@RequestBody MoviePojo editMovie)
	{
		return movieService.updateMovie(editMovie);
	}
	@DeleteMapping("/movies/{movieId}")
	void deleteMovie(@PathVariable int movieId)
	{
		movieService.deleteMovie(movieId);
		
		
	}
	


}
