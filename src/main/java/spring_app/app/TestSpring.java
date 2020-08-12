package spring_app.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

	private static ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConfig.xml");
	
	public static void main(String[] args)
	{
//		MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();

		Comp comp =  applicationContext.getBean("comp", Comp.class);

comp.musicPlayer.playMusic();

		applicationContext.close();
	}
}
