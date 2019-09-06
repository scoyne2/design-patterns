public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<Observer>;

    }

    public void registerObserver(Observer o){
        observer.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for (Observer observer : observers){
            observer.update(temperature, humidity, pressure)
        }
    }

    public void measurmentChanged() {
        notifyObservers();
    }

    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pre;
        measurmentChanged();
    }
}