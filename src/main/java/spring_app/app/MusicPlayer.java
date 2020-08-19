package spring_app.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

public class MusicPlayer
{
	private String name;
	private int volume;
	
	@Autowired
	//@Qualifier("setMuiscList")
	private List<IMusic> musicList;

	
	public MusicPlayer()
	{
		
	}

	public void playMusic()
	{
		for(IMusic iMusic : musicList)
		{
			System.out.println(iMusic.getSong());
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public void setMusic(List<IMusic> list)
	{
		this.musicList = list;
	}
}
