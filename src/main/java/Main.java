import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the height of the wall: ");
    double height = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the width of the wall: ");
    double width = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the number of doors: ");
    double numberofDoors = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the area of the door: ");
    double DoorArea = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the number of windows: ");
    double numberofWindows = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the size of window: ");
    double WindowArea = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the number of sockets: ");
    double numberofSockets = Double.valueOf(scanner.nextLine());
    System.out.print("Enter the socket size: ");
    double SocketArea = Double.valueOf(scanner.nextLine());
    System.out.print("How many coats would you like to apply?: ");
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
