package com.lookify.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lookify.models.Songs;
import com.lookify.repositories.SongsRepo;

@Service
public class SongsService {
	@Autowired
	private SongsRepo SongsRepo;
	
	public List<Songs> findAll() {
		return SongsRepo.findAll();
	}
	public Songs addOrUpdate(Songs Songs) {
		return SongsRepo.save(Songs);
	}
	public void deleteSongs(Long id) {
		SongsRepo.deleteById(id);
	}
	public Songs findOne(Long id) {
		return SongsRepo.findById(id).orElse(null);
	}
	public List<Songs> findByArtist(String artist) {
		return SongsRepo.findByArtistContaining(artist);
	}
	
//	public List<Songs> newFindTopTen(){
//		return SongsRepo.findTop10ByOrderByRatingDesc();
//	}
}
