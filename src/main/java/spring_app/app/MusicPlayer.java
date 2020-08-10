package spring_app.app;

import java.util.ArrayList;

public class MusicPlayer
{
	private String name;
	private int volume;
	private ArrayList<IMusic> musicList;
	public MusicPlayer(ArrayList<IMusic> musicList)
	{
		this.musicList = musicList;
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
	public void setmusicList( ArrayList<IMusic> musicList)
	{
		this.musicList = musicList;
	}
	
}
