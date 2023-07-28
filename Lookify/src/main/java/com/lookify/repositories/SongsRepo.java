package com.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lookify.models.Songs;

@Repository
public interface SongsRepo extends CrudRepository<Songs,Long> {
	public List<Songs> findAll();
	
	public List<Songs> findByArtistContaining(String artist);
	
//	public List<Songs> findTop10ByOrderByRatingDesc();
}

