import java.util.Date;

/**
 * Created by sachin on 12/9/16.
 */
public class Guest extends Person {
    int vehicle_type;
    Date in_time;

    public int getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(int vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public Date getIn_time() {
        return in_time;
    }

    public void setIn_time(Date in_time) {
        this.in_time = in_time;
    }
}
