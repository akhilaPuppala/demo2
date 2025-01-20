package com.demo.spring_rest.demo2.pojo;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class MoviePojo {
	
	int movieId;
	String movieName;
	String movieDescription;
	String movieGenre;
	LocalDate movieReleaseDate;
	String movieImageUrl;

}
