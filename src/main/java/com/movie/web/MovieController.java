package com.movie.web;

import org.springframework.web.bind.annotation.*;

import com.movie.business.Movie;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/movies")

public class MovieController {
	
	private List<Movie> movies = new ArrayList<>();
	
	@GetMapping("/")
	public List<Movie> getAll() {
		return movies;
	}
	
	@GetMapping("")
	public String add(@RequestParam String title, @RequestParam int year) {
		Movie movie = new Movie(title, year);
		movies.add(movie);
		return movie.getTitle() + " added!";
	}

}
