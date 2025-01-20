package com.spring_rest.demo2.dao;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.demo.spring_rest.demo2.pojo.MoviePojo;
@Repository

public class MovieDaoImp1 implements MovieDao{
	
	List<MoviePojo> movieDataStore=null;
	public MovieDaoImp1()
	{
		movieDataStore=new ArrayList<MoviePojo>();
		movieDataStore.add(new MoviePojo(101,"Kalki","Future prediction","VFX",LocalDate.of(2024, 04, 30),""));
		movieDataStore.add(new MoviePojo(101,"Salar","Fightning","Action",LocalDate.of(2023, 12, 31),""));
		movieDataStore.add(new MoviePojo(101,"Radhe shyam,","Based on Ramayana","God",LocalDate.of(2025, 12, 31),""));
	}

	@Override
	public List<MoviePojo> getAllMovies() {
		// TODO Auto-generated method stub
		return movieDataStore;
	}

	@Override
	public MoviePojo getAMovie(int movieId) {
		
		// TODO Auto-generated method stub
		for(int i=0;i<movieDataStore.size();i++)
		{
			if(movieDataStore.get(i).getMovieId()==movieId)
			{
				return movieDataStore.get(i);
			}
		}
		return null;
	}

	@Override
	public List<MoviePojo> getMoviesByGenre(String movieGenre) {
		// TODO Auto-generated method stub
		
		/*List<MoviePojo> movieByGenre=new ArrayList<>();
		
		for(int i=0;i<movieDataStore.size();i++)
		{
			if(movieDataStore.get(i).getMovieGenre()==movieGenre)
			{
				movieByGenre.add(movieDataStore.get(i));
			}
		}
		
		return movieByGenre;*/
		return movieDataStore.
				stream().
				filter((eachMovie)->eachMovie.getMovieGenre().equalsIgnoreCase(movieGenre)) //understand why you used != bcoz condition matched one will delete automatically
				.collect(Collectors.toList());
		
	}
	
	@Override
	public MoviePojo updateMovie(MoviePojo editMovie) {
		// TODO Auto-generated method stub
		for(int i=0;i<movieDataStore.size();i++)
		{
			if(movieDataStore.get(i).getMovieId()==editMovie.getMovieId())
			{
				movieDataStore.set(i, editMovie);
			}
		}
		return editMovie;
	}

	@Override
	public void deleteMovie(int movieId) {
		// TODO Auto-generated method stub
		
		movieDataStore = movieDataStore.
				stream().
				filter((eachMovie)->eachMovie.getMovieId()!=movieId) //understand why you used != bcoz condition matched one will delete automatically
				.collect(Collectors.toList());
		
	}

	public List<MoviePojo> getMoviesByReleaseYear(int year) {
		// TODO Auto-generated method stub
		List<MoviePojo> movieByYear=new ArrayList<>();
		for(int i=0;i<movieDataStore.size();i++)
		{
			if(movieDataStore.get(i).getMovieReleaseDate().getYear()==year)
			{
				movieByYear.add(movieDataStore.get(i));
			}
		}
		return movieByYear;
		
	}

}
