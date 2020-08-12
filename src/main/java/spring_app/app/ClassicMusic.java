package spring_app.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class ClassicMusic implements IMusic
{
	@PostConstruct
	public void doMyInit()
	{
		System.out.println("Init");
	}
	@PreDestroy
	public void doMyDestroy()
	{
		System.out.println("destroy");
	}
	public String getSong()
	{
		return "FOUR SEASONS";
	}
}
