import java.util.List;

/**
 * Created by sachin on 12/9/16.
 */

public class Parking {
    String location;
    int capacity;
    String name;

    List <Four_wheeler> employee_class1;
    List <Two_wheeler> employee_class2;
    List <Four_wheeler> guest_class_1;
    List <Two_wheeler> guest_class_2;


    Parking(){
        employee_class1=new MySizeLimitedArrayList();
        employee_class2=new MySizeLimitedArrayList();
        guest_class_1=new MySizeLimitedArrayList();
        guest_class_2=new MySizeLimitedArrayList();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void get_two_wheeler_guests(){
        for (int i=0;i<guest_class_2.size();i++){
            System.out.printf("Guest Name is "+ guest_class_2.get(i).getP().getName());
        }
    }

    public void get_four_wheeler_guests(){
        for (int i=0;i<guest_class_1.size();i++){
            System.out.printf("Guest Name is "+ guest_class_1.get(i).getP().getName());
        }
    }

    public void get_two_wheeler_employees(){
        for (int i=0;i<employee_class2.size();i++){
            System.out.printf("Employee Name is "+ employee_class2.get(i).getP().getName());
        }
    }

    public void get_four_wheeler_employees(){
        for (int i=0;i<employee_class1.size();i++){
            System.out.printf("Employee Name is "+ employee_class1.get(i).getP().getName());
        }
    }

}
