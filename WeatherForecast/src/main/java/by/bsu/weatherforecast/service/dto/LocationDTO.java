package by.bsu.weatherforecast.service.dto;

public class LocationDTO {
    private int id;
    private String location;
    private int model;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationDTO{");
        sb.append("id=").append(id);
        sb.append(", location='").append(location).append('\'');
        sb.append(", model=").append(model);
        sb.append('}');
        return sb.toString();
    }
}
