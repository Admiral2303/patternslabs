import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SeeBatle batle = new SeeBatle(4, 3, 2, 1);
        char[][] batle_field = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                batle_field[i][j] = '1';
            }
        }



        for (int i = 0; i < batle.get_ship_count(1); i++) {
            if (i != 0) {
                Ship ship = batle.get_ship(1);
                ship.show_info(batle_field, i + i);
            } else {
                Ship ship = batle.get_ship(1);
                ship.show_info(batle_field, i);
            }
        }
        for (int i = 0; i < batle.get_ship_count(2); i++) {
            if (i != 0) {
                Ship ship = batle.get_ship(2);
                ship.show_info(batle_field, i + 2 * i);
            } else {
                Ship ship = batle.get_ship(2);
                ship.show_info(batle_field, i);
            }
        }
        for (int i = 0; i < batle.get_ship_count(3); i++) {
            if (i != 0) {
                Ship ship = batle.get_ship(3);
                ship.show_info(batle_field, i + 3 * i);
            } else {
                Ship ship = batle.get_ship(3);
                ship.show_info(batle_field, i);
            }
        }
        Ship ship = batle.get_ship(4);
        ship.show_info(batle_field, 0);


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%c ", batle_field[i][j]);
            }
            System.out.println();
        }


        System.out.println(batle.get_size());





        //        System.out.println("Add one deck ship");
//        for(int i = 0; i <  batle.get_ship_count(1); i ++){
//            System.out.println("Enter coordinats");
//            Ship ship = batle.get_ship(1);
//            System.out.println("Enter x1: ");
//            int x1 = in.nextInt();
//            System.out.println("Enter y1: ");
//            int y1 = in.nextInt();
//            ship.show_info(batle_field, x1, y1, x1 ,y1);
//        }
//
//        System.out.println("Add two deck ship");
//        for(int i = 0; i <  batle.get_ship_count(2); i ++){
//            System.out.println("Enter coordinats");
//            Ship ship = batle.get_ship(2);
//            System.out.println("Enter x1: ");
//            int x1 = in.nextInt();
//            System.out.println("Enter y1: ");
//            int y1 = in.nextInt();
//            System.out.println("Enter x2: ");
//            int x2 = in.nextInt();
//            System.out.println("Enter y2: ");
//            int y2 = in.nextInt();
//            ship.show_info(batle_field, x1, y1, x2 ,y2);
//        }
//
//        System.out.println("Add three deck ship");
//        for(int i = 0; i <  batle.get_ship_count(3); i ++){
//            System.out.println("Enter coordinats");
//            Ship ship = batle.get_ship(3);
//            System.out.println("Enter x1: ");
//            int x1 = in.nextInt();
//            System.out.println("Enter y1: ");
//            int y1 = in.nextInt();
//            System.out.println("Enter x2: ");
//            int x2 = in.nextInt();
//            System.out.println("Enter y2: ");
//            int y2 = in.nextInt();
//            ship.show_info(batle_field, x1, y1, x2 ,y2);
//        }
//
//        System.out.println("Add three deck ship");
//        for(int i = 0; i <  batle.get_ship_count(4); i ++){
//            System.out.println("Enter coordinats");
//            Ship ship = batle.get_ship(4);
//            System.out.println("Enter x1: ");
//            int x1 = in.nextInt();
//            System.out.println("Enter y1: ");
//            int y1 = in.nextInt();
//            System.out.println("Enter x2: ");
//            int x2 = in.nextInt();
//            System.out.println("Enter y2: ");
//            int y2 = in.nextInt();
//            ship.show_info(batle_field, x1, y1, x2 ,y2);
//        }


    }
}
