package spring_app.app;

public class MusicPlayer
{
	private String name;
	private int volume;
	private IMusic music;
	
	public MusicPlayer(IMusic music)
	{
		this.music = music;
	}
	public MusicPlayer()
	{
		
	}
	public void playMusic()
	{
		System.out.println(music.getSong());
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
	public IMusic getMusic() {
		return music;
	}
	public void setMusic(IMusic music) {
		this.music = music;
	}
	
}
