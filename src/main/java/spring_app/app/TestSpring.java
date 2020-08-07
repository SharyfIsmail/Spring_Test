package spring_app.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	private static ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
	
	public static void main(String[] args)
	{
		MusicPlayer musicPlayer = applicationContext.getBean("musicPlayerBean", MusicPlayer.class);
		musicPlayer.playMusic();
		applicationContext.close();
	}
}
