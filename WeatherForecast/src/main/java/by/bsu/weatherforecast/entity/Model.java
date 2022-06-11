package by.bsu.weatherforecast.entity;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="fc_model")
public class Model {

    @OneToOne
    @JoinColumn(name="multimodel_id")
    private Multimodel multimodelid;
    @Id
    @Column(name="model_id")
    private int modelid;
    @Column(name="temperature")
    private double temperature;
    @Column(name="winddirection")
    private double winddirection;
    @Column(name="windspeed")
    private double windspeed;
    @Column(name="pressure")
    private double pressure;
    @Column(name="humidity")
    private double humidity;
    @Column(name="uvindex")
    private double uvindex;

    public Multimodel getMultimodel() {
        return multimodelid;
    }

    public void setMultimodel(Multimodel multimodel) {
        this.multimodelid = multimodel;
    }

    public int getModelid() {
        return modelid;
    }

    public void setModelid(int modelid) {
        this.modelid = modelid;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Model model = (Model) o;
        return modelid == model.modelid && Double.compare(model.temperature, temperature) == 0 && Double.compare(model.winddirection, winddirection) == 0 && Double.compare(model.windspeed, windspeed) == 0 && Double.compare(model.pressure, pressure) == 0 && Double.compare(model.humidity, humidity) == 0 && Double.compare(model.uvindex, uvindex) == 0 && Objects.equals(multimodelid, model.multimodelid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multimodelid, modelid, temperature, winddirection, windspeed, pressure, humidity, uvindex);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Model{");
        sb.append("multimodel=").append(multimodelid);
        sb.append(", model_id=").append(modelid);
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
