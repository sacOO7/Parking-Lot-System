import java.util.Date;

/**
 * Created by sachin on 12/9/16.
 */
public class Employee extends Person {

    int vehicle_type;
    Date joining_date;

    public Date getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(Date joining_date) {
        this.joining_date = joining_date;
    }

    public int getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(int vehicle_type) {
        this.vehicle_type = vehicle_type;
    }
}
