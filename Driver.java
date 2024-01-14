import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BlueRayCollection bRay = new BlueRayCollection();
        int choice = 3;

        while (choice != 0){
        try{
            System.out.println("----Menu----" +
                    "\n0) Quit " +
                    "\n1) Add BlueRay to Collection " +
                    "\n2) See Collection ");
            choice = Integer.parseInt(scan.nextLine());

                if (choice == 0){
                    System.out.println("Goodbye!");
                    break;
                }
                else if (choice == 1){
                    System.out.println("Title: ");
                    String t = scan.nextLine();

                    System.out.println("Director: ");
                    String d = scan.nextLine();

                    System.out.println("Year or Release: ");
                    int y = scan.nextInt(); scan.nextLine();

                    System.out.println("Cost: ");
                    double c = Double.parseDouble(scan.nextLine());

                    bRay.add(t,d,y,c);
                }
                else if (choice == 2){
                    bRay.show_all();
                }
                else{
                    System.out.println("Invalid input, please try again.");
                }
            }
            catch (Exception e2){
                System.out.println("Please try again.");
            }

        }


    }
}
