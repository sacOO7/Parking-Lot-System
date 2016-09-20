import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        int total_people;
        int person_type;
        int person_class;
        String name;
        String email_id;
        String address;

        BufferedReader scanner=new BufferedReader(new InputStreamReader(System.in));
        Parking p=new Parking();

        /**
         * Total number of people entering the building
         */
        System.out.println("Enter the total number of people");
        total_people=Integer.valueOf(scanner.readLine());
        System.out.println("Total people are "+total_people);


        /**
         * Take credentials from person
         */
        while (total_people!=0){
            System.out.printf("Enter the type person");
            person_type=Integer.valueOf(scanner.readLine());

            //Person is employee
            if (person_type==1){

                Employee employee = new Employee();
                System.out.println("Enter the name of employee");
                name=scanner.readLine();
                employee.setName(name);
                System.out.println("Name is " + employee.getName());
                System.out.println("Enter email-id of employee");
                email_id=scanner.readLine();
                employee.setEmailID(email_id);
                System.out.printf("Enter address of employee");
                address=scanner.readLine();
                employee.setAddress(address);


                System.out.println("Enter the class of employee");
                person_class=Integer.valueOf(scanner.readLine());

                if (person_class==1) {
                    //Class is four wheeler

                    Four_wheeler four_wheeler = new Four_wheeler();

                    four_wheeler.setP(employee);
                    four_wheeler.setSlot_no(2);
                    four_wheeler.setVehicle_no("7087");

                    if (p.employee_class1.add(four_wheeler)){
                        System.out.println("Added successfully");
                    }else{
                        System.out.println("Four wheelers are full , need to look for another slot");
                    }
                }else{

                    //Class is two wheeler
                    Two_wheeler two_wheeler = new Two_wheeler();

                    two_wheeler.setP(employee);
                    two_wheeler.setSlot_no(2);
                    two_wheeler.setVehicle_no("7078");

                    if (p.employee_class2.add(two_wheeler)){
                        System.out.println("Added successfully");
                    }else{
                        System.out.println("Four wheelers are full , need to look for another slot");
                    }

                }


            //Person is guest
            }else{

                Guest guest = new Guest();
                System.out.println("Enter the name of guest");
                name=scanner.readLine();
                guest.setName(name);
                System.out.println("Name is " + guest.getName());
                System.out.println("Enter email-id of guest");
                email_id=scanner.readLine();
                guest.setEmailID(email_id);
                System.out.printf("Enter address of guest");
                address=scanner.readLine();
                guest.setAddress(address);


                System.out.println("Enter the class of guest");
                person_class=Integer.valueOf(scanner.readLine());

                if (person_class==1){

                    //Class is four wheeler

                    Four_wheeler four_wheeler = new Four_wheeler();
                    four_wheeler.setP(guest);
                    four_wheeler.setSlot_no(3);
                    four_wheeler.setVehicle_no("1234");

                    if (p.employee_class1.add(four_wheeler)){
                        System.out.println("Added successfully");
                    }else{
                        System.out.println("Four wheelers are full , need to look for another slot");
                    }


                }else{

                    //Class is two wheeler
                    Two_wheeler two_wheeler = new Two_wheeler();
                    two_wheeler.setP(guest);
                    two_wheeler.setSlot_no(3);
                    two_wheeler.setVehicle_no("1234");

                    if (p.employee_class2.add(two_wheeler)){
                        System.out.println("Added successfully");
                    }else{
                        System.out.println("Four wheelers are full , need to look for another slot");
                    }

                }
            }

            total_people--;
        }

        System.out.printf("Printing total two wheeler guests");
        p.get_two_wheeler_guests();

        System.out.printf("Printing total two wheeler Employees");
        p.get_two_wheeler_employees();

        System.out.printf("Printing total four wheeler guests");
        p.get_four_wheeler_guests();

        System.out.printf("Printing total four wheeler Employees");
        p.get_four_wheeler_employees();

    }
}
