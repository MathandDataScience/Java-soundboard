import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent event)
	{
		// DJ sound player
		if (event.getActionCommand().equals("1. Air Horn"))
		{
			SoundPlayer.playSound("sounds/DJ/Horn.wav");
		}
		else if (event.getActionCommand().equals("2. Goes like this"))
		{
			SoundPlayer.playSound("sounds/DJ/goes like this.wav");
		}
		else if (event.getActionCommand().equals("3. Bass"))
		{
			SoundPlayer.playSound("sounds/DJ/Bass.wav");
		}
		else if (event.getActionCommand().equals("4. Kick"))
		{
			SoundPlayer.playSound("sounds/DJ/kick.wav");
		}
		else if (event.getActionCommand().equals("5. Tom"))
		{
			SoundPlayer.playSound("sounds/DJ/tom.wav");
		}
		else if (event.getActionCommand().equals("6. Cymbal"))
		{
			SoundPlayer.playSound("sounds/DJ/cymbal.wav");
		}
		else if (event.getActionCommand().equals("7. Snare"))
		{
			SoundPlayer.playSound("sounds/DJ/snare.wav");
		}
		else if (event.getActionCommand().equals("8. Clap"))
		{
			SoundPlayer.playSound("sounds/DJ/clap.wav");
		}
		else if (event.getActionCommand().equals("9. Bass Drop"))
		{
			SoundPlayer.playSound("sounds/DJ/bass drop.wav");
		}
		
		//animals sound players
		else if (event.getActionCommand().equals("Chickens"))
		{
			SoundPlayer.playSound("sounds/animals/chickens.wav");
		}
		
		else if (event.getActionCommand().equals("Chicks"))
		{
			SoundPlayer.playSound("sounds/animals/chicks.wav");
		}
		
		else if (event.getActionCommand().equals("Rooster"))
		{
			SoundPlayer.playSound("sounds/animals/rooster.wav");
		}
		
		else if (event.getActionCommand().equals("Cow 1"))
		{
			SoundPlayer.playSound("sounds/animals/cowLongMoo.wav");
		}
		
		else if (event.getActionCommand().equals("Cow 2"))
		{
			SoundPlayer.playSound("sounds/animals/cowMoo.WAV");
		}
		
		else if (event.getActionCommand().equals("Cow 3"))
		{
			SoundPlayer.playSound("sounds/animals/cowMoo2.wav");
		}
		
		else if (event.getActionCommand().equals("Neigh"))
		{
			SoundPlayer.playSound("sounds/animals/horseNeigh.wav");
		}
		
		else if (event.getActionCommand().equals("Sputter"))
		{
			SoundPlayer.playSound("sounds/animals/horseSputter.wav");
		}
		
		else if (event.getActionCommand().equals("Angry"))
		{
			SoundPlayer.playSound("sounds/animals/horseAngry.wav");
		}
		
		else if (event.getActionCommand().equals("Zebra 1"))
		{
			SoundPlayer.playSound("sounds/animals/zebra4.wav");
		}
		
		else if (event.getActionCommand().equals("Zebra 2"))
		{
			SoundPlayer.playSound("sounds/animals/zebra2.wav");
		}
		
		else if (event.getActionCommand().equals("Zebra 3"))
		{
			SoundPlayer.playSound("sounds/animals/zebra3.wav");
		}
		
		else if (event.getActionCommand().equals("Rhino 1"))
		{
			SoundPlayer.playSound("sounds/animals/rhinos1.wav");
		}
		
		else if (event.getActionCommand().equals("Rhino 2"))
		{
			SoundPlayer.playSound("sounds/animals/rhinos2.wav");
		}
		
		else if (event.getActionCommand().equals("Rhino 3"))
		{
			SoundPlayer.playSound("sounds/animals/rhinos3.wav");
		}
		
		else if (event.getActionCommand().equals("Elephant 1"))
		{
			SoundPlayer.playSound("sounds/animals/elephant1.wav");
		}
		
		else if (event.getActionCommand().equals("Elephant 2"))
		{
			SoundPlayer.playSound("sounds/animals/elephant2.wav");
		}
		
		else if (event.getActionCommand().equals("Elephant 3"))
		{
			SoundPlayer.playSound("sounds/animals/elephant3.wav");
		}
		
		// voice sound player
		else if (event.getActionCommand().equals("Hello"))
		{
			SoundPlayer.playSound("sounds/voice/greeting/hello.wav");
		}
		else if (event.getActionCommand().equals("Yo"))
		{
			SoundPlayer.playSound("sounds/voice/greeting/yo.wav");
		}
		else if (event.getActionCommand().equals("What's up doc"))
		{
			SoundPlayer.playSound("sounds/voice/greeting/what's up doc.wav");
		}
		else if (event.getActionCommand().equals("Goodbye"))
		{
			SoundPlayer.playSound("sounds/voice/greeting/goodbye.wav");
		}
		
		else if (event.getActionCommand().equals("Is Mayo?"))
		{
			SoundPlayer.playSound("sounds/voice/question_mis/mayo.wav");
		}
		else if (event.getActionCommand().equals("Patrick Star 2"))
		{
			SoundPlayer.playSound("sounds/voice/question_mis/patrick star 2.wav");
		}
		else if (event.getActionCommand().equals("Patrick Star 1"))
		{
			SoundPlayer.playSound("sounds/voice/question_mis/patrick star.wav");
		}
		else if (event.getActionCommand().equals("What are you doing?"))
		{
			SoundPlayer.playSound("sounds/voice/question_mis/what you doing.wav");
		}
		
		else if (event.getActionCommand().equals("I fart in your direction"))
		{
			SoundPlayer.playSound("sounds/voice/insults/I fart in your general direction.wav");
		}
		else if (event.getActionCommand().equals("Idiot"))
		{
			SoundPlayer.playSound("sounds/voice/insults/idiot.wav");
		}
		else if (event.getActionCommand().equals("Mr.french"))
		{
			SoundPlayer.playSound("sounds/voice/insults/Mr.french.wav");
		}
		else if (event.getActionCommand().equals("You \"insults\""))
		{
			SoundPlayer.playSound("sounds/voice/insults/you insults.wav");
		}
	}

}