package com.technicjelle.bluemapofflineplayermarkers;

import java.net.MalformedURLException;
import java.net.URL;

public class Config {
	public final String markerSetId = "offplrs";
	public String markerSetName;
	public boolean useBlueMapSource;
	public String skinURL;
	public boolean verboseErrors;

	public Config() {
		loadConfig();
	}

	private void loadConfig() {
		markerSetName = "Offline Players"; //TODO: https://github.com/TechnicJelle/BlueMapOfflinePlayerMarkers/issues/10
		useBlueMapSource = true;

		skinURL = "https://crafatar.com/avatars/{UUID}.png?size=8&overlay=true"; //TODO: https://github.com/TechnicJelle/BlueMapOfflinePlayerMarkers/issues/8
		try {
			//Check if the skinURL is a valid URL
			new URL(skinURL);
		} catch (MalformedURLException e) {
			Main.logger.warning("Invalid skin URL: " + skinURL);
			e.printStackTrace();
		}

		verboseErrors = true; //TODO: https://github.com/TechnicJelle/BlueMapOfflinePlayerMarkers/issues/13
	}
}
