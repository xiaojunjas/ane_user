package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.MoviesAddressDao;
import com.ane.domain.MoviesAddress;
import com.ane.domain.MoviesFilm;


@RestController
@RequestMapping("/v1")
public class MoviesAddressController {

	@Autowired
	private MoviesAddressDao moviesAddressDao;
	
	@RequestMapping(value="/movies/moviesId", method=RequestMethod.GET)
	public MoviesAddress getMoviesAddressById(Long  moviesId){
		return moviesAddressDao.getMoviesAddressById(moviesId);
	}
	
	@RequestMapping(value="/movies", method=RequestMethod.GET)
	public List<MoviesAddress> listMoviesAddress(Integer start ,Integer limit,String query){
		return moviesAddressDao.listMoviesAddress(start, limit, query);
	}
	
	@RequestMapping(value="/movies/count", method=RequestMethod.GET)
	public Integer countMoviesAddress(String query){
		return moviesAddressDao.countMoviesAddress(query);
	}
	
	@RequestMapping(value="/movies", method=RequestMethod.POST)
	public Integer createMoviesAddress(@RequestBody MoviesAddress moviesAddress){
		return moviesAddressDao.createMoviesAddress(moviesAddress);
	}
	
	@RequestMapping(value="/movies", method=RequestMethod.PUT)
	public Integer editMoviesAddressByMoviesId(@RequestBody MoviesAddress moviesAddress){
		return moviesAddressDao.editMoviesAddressByMoviesId(moviesAddress);
	}
	
	@RequestMapping(value="/movies/id", method=RequestMethod.DELETE)
	public Integer delMoviesAddressByMoviesId(Long moviesId){
		return moviesAddressDao.delMoviesAddressByMoviesId(moviesId);
	}
	
	@RequestMapping(value="/movies/film/id", method=RequestMethod.GET)
	public List<MoviesFilm> findFilmMoviesByMoviesId(Long moviesId,Long filmId){
		return moviesAddressDao.findFilmMoviesByMoviesId(moviesId,filmId);
	}
	
	@RequestMapping(value="/movies/film/batch", method=RequestMethod.POST)
	public Integer saveFilmMovies(@RequestBody List<MoviesFilm> moviesFilm){
		return moviesAddressDao.saveFilmMovies(moviesFilm);
	}
	
	@RequestMapping(value="/movies/ids", method=RequestMethod.DELETE)
	public Integer findFilmMoviesByMoviesId(Long[] delteaIds){
		return moviesAddressDao.delFilmMoviesByMoviesId(delteaIds);
	}

}
