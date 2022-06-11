package by.bsu.weatherforecast.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name="locations")
public class Location {
    @Column(name="id", nullable=false, unique=true)
    private @Id int id;
    @Column(name="location", nullable=false)
    private String location;
    @Column(name="model", nullable=false, unique=false)
    private int model;

    @OneToMany(mappedBy = "id")
    private Set<Multimodel> multimodels;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location1 = (Location) o;
        return model == location1.model && Objects.equals(id, location1.id) && Objects.equals(location, location1.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location, model);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Location{");
        sb.append("id=").append(id);
        sb.append(", location='").append(location).append('\'');
        sb.append(", model=").append(model);
        sb.append('}');
        return sb.toString();
    }
}
