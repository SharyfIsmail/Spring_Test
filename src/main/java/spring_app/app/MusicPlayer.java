package spring_app.app;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer
{
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicVolume.volume}")
	private int volume;
	
	@Autowired
	@Qualifier("classicMusic")
	private IMusic iMusic;
	public MusicPlayer()
	{
		
	}

	public void playMusic()
	{
		//for(IMusic iMusic : musicList)
		//{
			System.out.println(iMusic.getSong());
		//}
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


	
}
