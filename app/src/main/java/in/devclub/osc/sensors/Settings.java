package in.devclub.osc.sensors;

import android.content.SharedPreferences;

/**
 * Created by thomas on 05.11.14.
 */
public class Settings extends in.devclub.common.sensors.Settings {

	private final String host;
	private final int port;

	public Settings(SharedPreferences preferences) {
		super(preferences);
		this.host = this.setHost(preferences);
		this.port = this.setPort(preferences);
	}

	public int getPort() {
		return port;
	}

	private int setPort(SharedPreferences preferences) {
		return Integer.valueOf(preferences.getString("pref_comm_port", "6969"));
	}

	public String getHost() {
		return host;
	}

	private String setHost(SharedPreferences preferences) {
		return preferences.getString("pref_comm_host", "");
	}
}
