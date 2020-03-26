
package observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData wd = new WeatherData();
		
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd);
		StatisticsDisplay sd = new StatisticsDisplay(wd);
		
		wd.setMeasurements(80, 65, 30.4f);
		wd.setMeasurements(82, 70, 29.2f);
		wd.setMeasurements(78, 90, 29.2f);
	}
}
