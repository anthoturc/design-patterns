
package observer;

import java.util.ArrayList;

public class StatisticsDisplay implements Observer, DisplayElement{
	private ArrayList temperatures;
	private ArrayList humidities;
	private ArrayList pressures;
	private Subject weatherData;
	
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		temperatures = new ArrayList();
		humidities = new ArrayList();
		pressures = new ArrayList();
		
		this.weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		float avgTmp = getAvg(temperatures);
		float avgHumidity = getAvg(humidities);
		float avgPressure = getAvg(pressures);
		
		System.out.println("Average Temp: " + avgTmp);
		System.out.println("Average Humidities: " + avgHumidity);
		System.out.println("Average Pressures: " + avgPressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		temperatures.add(temp);
		humidities.add(humidity);
		pressures.add(pressure);
		display();
	}
	
	private float getAvg(ArrayList arr) {
		float avg = 0.f;
		int n = arr.size();
		if (n == 0) return avg;
		for (int i = 0; i < n; ++i) {
			avg += (float)arr.get(i);
		}
	
		return avg/n;
	}
}
