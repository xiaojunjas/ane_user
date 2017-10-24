package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.FilmDao;
import com.ane.domain.Film;


@RestController
@RequestMapping("/v1")
public class FilmController {

	@Autowired
	private FilmDao filmDao;
	
	@RequestMapping(value="/film/filmId", method=RequestMethod.GET)
	public Film getFilmById(Long filmId){
		return filmDao.getFilmById(filmId);
	}
	
	@RequestMapping(value="/film", method=RequestMethod.GET)
	public List<Film> listFilm(Integer start ,Integer limit,String query){
		return filmDao.listFilm(start, limit, query);
	}
	
	@RequestMapping(value="/film/count", method=RequestMethod.GET)
	public Integer countFilm(String query){
		return filmDao.countFilm(query);
	}
	
	@RequestMapping(value="/film", method=RequestMethod.POST)
	public Integer createFilm(@RequestBody Film filmId){
		return filmDao.createFilm(filmId);
	}
	
	@RequestMapping(value="/film", method=RequestMethod.PUT)
	public Integer editFilmByFilmId(@RequestBody Film film){
		return filmDao.editFilmByFilmId(film);
	}
	
	@RequestMapping(value="/film/id", method=RequestMethod.DELETE)
	public Integer delFilmByFilmId(Long filmId){
		return filmDao.delFilmByFilmId(filmId);
	}

}
