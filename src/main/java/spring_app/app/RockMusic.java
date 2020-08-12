package spring_app.app;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements IMusic
{
	public String getSong()
	{
		return "Bleeding out";
	}
}
