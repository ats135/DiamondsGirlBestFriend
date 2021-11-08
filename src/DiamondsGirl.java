import java.util.Scanner;

public class DiamondsGirl {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        String name;
        int carats = -1;
        double value;
        Girl diamondGirl = new Girl();
        Diamond actualDiamond = new Diamond();

        actualDiamond.setCarats(0);
        actualDiamond.setValue(0.0);
        System.out.print("Enter the name of the girl : ");
        name = keyboard.next();
        diamondGirl.setName(name);

        do {
            //check if girl has diamond
            if (actualDiamond.getCarats() == 0) {
                System.out.println(diamondGirl.getName() + " has no best friend");
            }
            System.out.print("Enter carats and value     : ");
            carats = keyboard.nextInt();
            value = keyboard.nextDouble();

            if (carats > 0) {
                if (carats > actualDiamond.getCarats()) {
                    System.out.println("Woohoo, the girl took the diamond");
                    actualDiamond.setCarats(carats);
                    actualDiamond.setValue(value);
                    System.out.println(diamondGirl.getName() + " has a diamond, " + actualDiamond.getCarats() + " carats, worth $" + actualDiamond.getValue());
                } else {
                    System.out.println("Aaargh, the diamond was rejected ");
                    System.out.println(diamondGirl.getName() + " has a diamond, " + actualDiamond.getCarats() + " carats, worth $" + actualDiamond.getValue());
                }
            } else {
                System.out.println(diamondGirl.getName() + "has a diamond, " + actualDiamond.getCarats() + " carats, worth $" + actualDiamond.getValue());
            }


            //if no diamond, print girl has no best friend
            //else if diamond
             // enter carats and value, read them as double



            // compare new carats with old carats, if new carat is less than old, then print aarh
            //else new carats is more than old, replace carat and value
            // loop until carats = 0




        }while ((carats != 0));
    }

}
