import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyAction implements KeyListener
{

	@Override
	public void keyTyped(KeyEvent e)
	{
		if(e.getKeyChar() == '1')
		{
			SoundPlayer.playSound("sounds/DJ/Horn.wav");
		}
		else if (e.getKeyChar() == '2')
		{
			SoundPlayer.playSound("sounds/DJ/goes like this.wav");
		}
		else if (e.getKeyChar() == '3')
		{
			SoundPlayer.playSound("sounds/DJ/Bass.wav");
		}
		else if (e.getKeyChar() == '4')
		{
			SoundPlayer.playSound("sounds/DJ/kick.wav");
		}
		else if (e.getKeyChar() == '5')
		{
			SoundPlayer.playSound("sounds/DJ/tom.wav");
		}
		else if (e.getKeyChar() == '6')
		{
			SoundPlayer.playSound("sounds/DJ/cymbal.wav");
		}
		else if (e.getKeyChar() == '7')
		{
			SoundPlayer.playSound("sounds/DJ/snare.wav");
		}
		else if (e.getKeyChar() == '8')
		{
			SoundPlayer.playSound("sounds/DJ/clap.wav");
		}
		else if (e.getKeyChar() == '9')
		{
			SoundPlayer.playSound("sounds/DJ/bass drop.wav");
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e)
	{
		
		
	}

	@Override
	public void keyReleased(KeyEvent e)
	{
		
		
	}

}
