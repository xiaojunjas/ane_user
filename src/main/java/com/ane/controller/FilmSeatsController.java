package com.ane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ane.dao.FilmSeatsDao;
import com.ane.domain.FilmSeats;


@RestController
@RequestMapping("/v1")
public class FilmSeatsController {

	@Autowired
	private FilmSeatsDao filmSeatsDao;
	
	@RequestMapping(value="/filmseats/filmId", method=RequestMethod.POST)
	public Integer createFilmSeats(@RequestBody List<FilmSeats> filmSeats){
		return filmSeatsDao.createFilmSeats(filmSeats);
	}
	
	@RequestMapping(value="/filmseats/filmId/userId", method=RequestMethod.GET)
	public List<FilmSeats> listFilmSeatsByfilmId(Long filmId,Long userId){
		return filmSeatsDao.listFilmSeatsByfilmId(filmId, userId);
	}
	
}
