import java.io.FileInputStream;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class SoundPlayer
{
	public static void playSound(String fileName)
	{

		try
		{
			InputStream in = new FileInputStream(fileName);
			AudioStream as = new AudioStream(in);
			AudioPlayer.player.start(as);
		} catch (Exception e)
		{
			e.printStackTrace();
			return;
		}
	}
}
