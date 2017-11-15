package com.ane.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ane.domain.FilmSeats;

@Mapper
public interface FilmSeatsDao {
	 
	public  Integer createFilmSeats(@Param("filmSeatss")List<FilmSeats> filmSeats);
	
	public List<FilmSeats> listFilmSeatsByfilmId(@Param("filmId")Long filmId,@Param("userId")Long userId);
	
} 
 