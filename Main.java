import java.util.Scanner;
public class Main 
{
public static void main(String[] args) 
{
        Elevator test = new Elevator(2000, true);
        ElevatorA testA = new ElevatorA(2100, true);
        ElevatorB testB = new ElevatorB(1800, true);
        ElevatorD testD = new ElevatorD(1900, true);
        ElevatorE testE = new ElevatorE(1950, true);

        Scanner scanner = new Scanner(System.in);

        System.out.print("What floor do you want to get to?");
        int floor = scanner.nextInt();

        System.out.print("Do you have an elevator pass? Y/N");
        String pass = scanner.nextLine();

        if (pass.equals("Y")) 
        {
            test.changePass(true);
        }

        System.out.println("What side of the building are you currently on? NE / SE / SW / NW");
        String side = scanner.nextLine();

        if(side.equals("NW"))
        {
            System.out.println(testA.displayStatus("A"));
            System.out.println(testB.displayStatus("B"));
        }
        
        if(side.equals("NE"))
        {
            System.out.println("The closest elevators to you are elevators A & B: ");
            System.out.println(testA.displayStatus("A"));
            System.out.println(testB.displayStatus("B"));
        }

        if(side.equals("SW"))
        {
            System.out.println(testD.displayStatus("D"));
            System.out.println(testE.displayStatus("E"));
        }

        if(side.equals("SE"))
        {
            System.out.println("The closest elevators to you are elevators D & E: ");
            System.out.println(testD.displayStatus("D"));
            System.out.println(testE.displayStatus("E"));
        }


    



}
}
