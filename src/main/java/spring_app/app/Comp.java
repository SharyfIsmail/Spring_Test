package spring_app.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Comp 
{
	@Autowired
	 MusicPlayer musicPlayer;
}
