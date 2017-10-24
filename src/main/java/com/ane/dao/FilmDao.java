package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.Film;

@Mapper
public interface FilmDao {
	 
	public List<Film> listFilm(@Param("start")Integer start,@Param("limit")Integer limit,@Param("query")String query);
	
	public Integer countFilm(@Param("query")String query);
	
	public Film getFilmById(@Param("filmId")Long filmId);
	
	public Integer createFilm(Film film);
	
	public Integer delFilmByFilmId(@Param("filmId")Long filmId);
	
	public Integer editFilmByFilmId(Film film);
	
} 
 