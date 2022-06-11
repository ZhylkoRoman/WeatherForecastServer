package by.bsu.weatherforecast.service.dto;

import by.bsu.weatherforecast.entity.Location;

import java.sql.Time;
import java.sql.Timestamp;

public class MultimodelDTO {
    private int id;
    private Location location_id;
    private Timestamp date;
    private Timestamp forecast_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Location location_id) {
        this.location_id = location_id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Timestamp getForecast_date() {
        return forecast_date;
    }

    public void setForecast_date(Timestamp forecast_date) {
        this.forecast_date = forecast_date;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MultimodelDTO{");
        sb.append("id=").append(id);
        sb.append(", location_id=").append(location_id);
        sb.append(", date=").append(date);
        sb.append(", forecast_date=").append(forecast_date);
        sb.append('}');
        return sb.toString();
    }
}