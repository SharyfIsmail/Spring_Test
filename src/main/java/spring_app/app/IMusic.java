package spring_app.app;

public interface IMusic
{
	default public String getSong()
	{
		return"Nothing is on";
	}
	
}
