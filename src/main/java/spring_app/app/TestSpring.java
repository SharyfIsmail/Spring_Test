package spring_app.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	private static ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
	
	public static void main(String[] args)
	{
		MusicPlayer musicPlayer = applicationContext.getBean("musicPlayerBean", MusicPlayer.class);
		musicPlayer.playMusic();
		System.out.println(musicPlayer.getName() + " " + musicPlayer.getVolume());
		musicPlayer.setName("fdfdf");
		MusicPlayer musicPlaye1r = applicationContext.getBean("musicPlayerBean", MusicPlayer.class);
		System.out.println(musicPlaye1r.getName() + " " + musicPlaye1r.getVolume());

		applicationContext.close();
	}
}
