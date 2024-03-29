//package in.devclub.osc.fragments;
//
//import android.hardware.Sensor;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.CompoundButton;
//import android.widget.TextView;
//
//import in.devclub.R;
//import in.devclub.osc.dispatch.Bundling;
//import in.devclub.osc.dispatch.SensorConfiguration;
//import in.devclub.osc.sensors.Parameters;
//
///**
// * Created by thomas on 09.11.14.
// */
//public class SensorFragment extends Fragment {
//
//	private final SensorConfiguration sensorConfiguration;
//	private CompoundButton activeButton;
//
//	public SensorFragment() {
//		super();
//		this.sensorConfiguration = new SensorConfiguration();
//	}
//
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//		Bundle args = this.getArguments();
//		this.sensorConfiguration.setSensorType(args.getInt(Bundling.SENSOR_TYPE));
//		this.sensorConfiguration.setOscParam(args.getString(Bundling.OSC_PREFIX));
//		String name = args.getString(Bundling.NAME);
//
//		View v = inflater.inflate(R.layout.sensor, null);
//		TextView groupName = (TextView) v.findViewById(R.id.group_name);
//		groupName.setText(name);
//		((TextView) v.findViewById(R.id.osc_prefix)).setText("/" + args.getString(Bundling.OSC_PREFIX));
//
//		this.activeButton = (CompoundButton) v.findViewById(R.id.active);
//		if(sensorConfiguration.getSensorType() == Sensor.TYPE_LINEAR_ACCELERATION || sensorConfiguration.getSensorType()== Parameters.FAKE_ORIENTATION)
//		{
//			this.activeButton.setChecked(true);
//			sensorConfiguration.setSend(true);
//		}
//		this.activeButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//			@Override
//			public void onCheckedChanged(CompoundButton compoundButton, boolean checked) {
//				sensorConfiguration.setSend(checked);
//			}
//		});
//		return v;
//	}
//
//	@Override
//	public void onSaveInstanceState(Bundle outState) {
//		super.onSaveInstanceState(outState);
//
//	}
//
//	public SensorConfiguration getSensorConfiguration() {
//		return sensorConfiguration;
//	}
//}
