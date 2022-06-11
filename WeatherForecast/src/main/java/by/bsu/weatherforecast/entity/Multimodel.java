package by.bsu.weatherforecast.entity;


import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="fc_multimodel")
public class Multimodel {
    @Column(name="id", nullable=false, unique=true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Id int id;

    @ManyToOne
    @JoinColumn(name="location_id")
    private Location location;
    @Column(name="date", nullable=false)
    private Timestamp date;
    @Column(name="forecast_date", nullable=false)
    private Timestamp fc_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public Timestamp getFc_date() {
        return fc_date;
    }

    public void setFc_date(Timestamp fc_date) {
        this.fc_date = fc_date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimodel that = (Multimodel) o;
        return id == that.id && Objects.equals(location, that.location) && Objects.equals(date, that.date) && Objects.equals(fc_date, that.fc_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, location, date, fc_date);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Multimodel{");
        sb.append("id=").append(id);
        sb.append(", location=").append(location);
        sb.append(", date=").append(date);
        sb.append(", fc_date=").append(fc_date);
        sb.append('}');
        return sb.toString();
    }
}
