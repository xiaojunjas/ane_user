package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.MoviesAddress;
import com.ane.domain.MoviesFilm;

@Mapper
public interface MoviesAddressDao {
	 
	public List<MoviesAddress> listMoviesAddress(@Param("start")Integer start,@Param("limit")Integer limit,@Param("query")String query);
	
	public Integer countMoviesAddress(@Param("query")String query);
	
	public MoviesAddress getMoviesAddressById(@Param("moviesId")Long moviesId);
	
	public Integer createMoviesAddress(MoviesAddress moviesAddress);
	
	public Integer delMoviesAddressByMoviesId(@Param("moviesId")Long moviesId);
	
	public Integer editMoviesAddressByMoviesId(MoviesAddress moviesAddress);
	
	public List<MoviesFilm> findFilmMoviesByMoviesId(@Param("moviesId")Long moviesId,@Param("filmId")Long filmId);
	
	public Integer delFilmMoviesByMoviesId(@Param("delteaIds")Long[] delteaIds);
	
	public Integer saveFilmMovies(@Param("filmMovies") List<MoviesFilm> moviesFilm);
	
} 
 