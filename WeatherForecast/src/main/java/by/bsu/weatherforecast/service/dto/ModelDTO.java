package by.bsu.weatherforecast.service.dto;

import by.bsu.weatherforecast.entity.Multimodel;

public class ModelDTO {
    private Multimodel multimodel_id;
    private int model_id;
    private double temperature;
    private double winddirection;
    private double windspeed;
    private double pressure;
    private double humidity;
    private double uvindex;

    public Multimodel getMultimodel_id() {
        return multimodel_id;
    }

    public void setMultimodel_id(Multimodel multimodel_id) {
        this.multimodel_id = multimodel_id;
    }

    public int getModel_id() {
        return model_id;
    }

    public void setModel_id(int model_id) {
        this.model_id = model_id;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWinddirection() {
        return winddirection;
    }

    public void setWinddirection(double winddirection) {
        this.winddirection = winddirection;
    }

    public double getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(double windspeed) {
        this.windspeed = windspeed;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getUvindex() {
        return uvindex;
    }

    public void setUvindex(double uvindex) {
        this.uvindex = uvindex;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ModelDTO{");
        sb.append("multimodel_id=").append(multimodel_id);
        sb.append(", model_id=").append(model_id);
        sb.append(", temperature=").append(temperature);
        sb.append(", winddirection=").append(winddirection);
        sb.append(", windspeed=").append(windspeed);
        sb.append(", pressure=").append(pressure);
        sb.append(", humidity=").append(humidity);
        sb.append(", uvindex=").append(uvindex);
        sb.append('}');
        return sb.toString();
    }
}
