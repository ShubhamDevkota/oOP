package Models;


import java.util.Scanner;

public class Bike {
    public boolean incGear = true;
    public int gear = 1;
    public int wheels = 2;
    public int cc1  = 250;
    public int cc2 = 200;
    public int cc3 = 150;
    public void startB(){
        System.out.println("bike is started");
        System.out.println("Gear"+gear);
    }
    public void gearC(Scanner sc){

        while(incGear){
            System.out.println("Do you want to change the gear? Write true or false");
            String gearChoice = sc.nextLine();

            if (gearChoice.equals("true")) {
                incGear = true;
                gear += 1;
                System.out.println("Gear: " + gear);
            } else {
                incGear = false;
            }

            System.out.println("Do you want to continue? Write true or false");
            if(sc.nextLine().equals("false")){
                break;
            }
        }
    }


}
