package spring_app.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

private static AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

	public static void main(String[] args)
	{
//		MusicPlayer musicPlayer = applicationContext.getBean("musicPlayer", MusicPlayer.class);
//		musicPlayer.playMusic();

		Comp comp =  annotationConfigApplicationContext.getBean("comp", Comp.class);

comp.musicPlayer.playMusic();

annotationConfigApplicationContext.close();
	}
}
