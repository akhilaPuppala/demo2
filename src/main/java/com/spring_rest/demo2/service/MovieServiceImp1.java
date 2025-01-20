package com.spring_rest.demo2.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.spring_rest.demo2.pojo.MoviePojo;
import com.spring_rest.demo2.dao.MovieDao;

@Service
public class MovieServiceImp1 implements MovieService{
	
	@Autowired
	MovieDao movieDao;
	

	@Override
	public List<MoviePojo> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDao.getAllMovies();
	}

	@Override
	public MoviePojo getAMovie(int movieId) {
		// TODO Auto-generated method stub
		return movieDao.getAMovie(movieId);
	}

	@Override
	public List<MoviePojo> getMoviesByGenre(String movieGenre) {
		// TODO Auto-generated method stub
		return movieDao.getMoviesByGenre(movieGenre);
	}

	@Override
	public List<MoviePojo> getMoviesByReleaseYear(int year) {
		// TODO Auto-generated method stub
		return movieDao.getMoviesByReleaseYear(year);
	}

	@Override
	public MoviePojo updateMovie(MoviePojo editMovie) {
		// TODO Auto-generated method stub
		return movieDao.updateMovie(editMovie);
	}

	@Override
	public void deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		movieDao.deleteMovie(movieId);
		
	}

}
