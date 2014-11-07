package de.swagner.paxbritannica.help;

import java.io.IOException;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;

public class ScreenshotSaver {

	public static void saveScreenshot(String baseName) throws IOException {
		if(Gdx.app.getType()==ApplicationType.Android){
			return;
		}
	}
}