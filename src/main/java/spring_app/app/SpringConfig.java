package spring_app.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("spring_app.app")
@PropertySource("classpath:player.properties")
public class SpringConfig 
{
	@Value("${musicPlayer.name}")
	private String name;
	@Value("${musicVolume.volume}")
	private int volume;
	
	@Bean
	public RapMusic rapMusic()
	{
		return new RapMusic();
	}
	@Bean
	public ClassicMusic classicMusic()
	{
		return new ClassicMusic();
	}
	@Bean
	public RockMusic rockMusic()
	{
		return new RockMusic();
	}
	@Bean
	public List <IMusic> setMuiscList()
	{
		List <IMusic> list = new ArrayList<IMusic>();
		list.add(rapMusic());
		list.add(rapMusic());
		list.add(rapMusic());

		return list;
	}
	
	@Bean
	public MusicPlayer musicPlayer()
	{
		
		MusicPlayer musicPlayer = new MusicPlayer();
		musicPlayer.setMusic(setMuiscList());
		return musicPlayer;
	}
}
