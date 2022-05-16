import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to your paint calculator");
            System.out.println("Specify dimensions for walls in meters and volume in liters")

            System.out.println("Please specify the number of walls you would like: ");
            int numberOfWalls = Integer.parseInt(scanner.nextLine());

            if (numberOfWalls>=0){
                for (int i = 0; i < numberOfWalls; i++) {
                    System.out.println("Number of walls: " + (i+1));
                    System.out.print("Please specify the height of the wall " + (i +1) + ": ");

                }
            }

            double totalWallSurfaceArea = 0;

            System.out.print("Enter the height of the wall: ");
            double height = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the width of the wall: ");
            double width = Double.valueOf(scanner.nextLine());



            System.out.println("Enter the number of doors: ");
            double numberofDoors = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the area of the door: ");
            double DoorArea = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the number of windows: ");
            double numberofWindows = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the size of window: ");
            double WindowArea = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the number of sockets: ");
            double numberofSockets = Double.valueOf(scanner.nextLine());
            System.out.println("Enter the socket size: ");
            double SocketArea = Double.valueOf(scanner.nextLine());
            System.out.println("How many coats would you like to apply?: ");
            double numberofCoats = Double.valueOf(scanner.nextLine());
            double totalWallSurface = numberofCoats * (height * width);

            double totalDoorArea = numberofDoors * DoorArea;
            double totalWindowArea = numberofWindows * WindowArea;
            double totalSocketArea = numberofSockets * SocketArea;

            double totalPaintArea = totalWallSurface - totalDoorArea - totalWindowArea - totalSocketArea;

            System.out.println(" Total Paint Area " + totalPaintArea + " square meters");

            double PaintRequired = totalPaintArea * 0.1; //b&q estimation

            System.out.println(" Total Paint Required " + PaintRequired + " liters ");

            double PaintToBuy = Math.ceil(totalPaintArea * 0.1);
            System.out.println("Paint required to buy " + PaintToBuy + " liters ");


        }
    }
}
