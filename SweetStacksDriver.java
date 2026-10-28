//import java.util.ArrayList;
//import java.util.Scanner;

public class SweetStacksDriver
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        ArrayList<MenuItem> menu = new ArrayList<>();

        int choice = 0;

        while (choice != 4)
        {
            System.out.println();
            System.out.println("===== Sweet Stacks Menu =====");
            System.out.println("1. Add Pizza");
            System.out.println("2. Add Drink");
            System.out.println("3. Display Menu");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            choice = Integer.parseInt(input.nextLine());

            if (choice == 1)
            {
                System.out.print("Pizza name: ");
                String name = input.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(input.nextLine());

                System.out.print("Size: ");
                String size = input.nextLine();

                System.out.print("Crust type: ");
                String crust = input.nextLine();

                System.out.print("Toppings: ");
                String toppings = input.nextLine();

                Pizza pizza =
                        new Pizza(name, price,
                                size, crust,
                                toppings);

                menu.add(pizza);

                System.out.println("Pizza added.");
            }

            else if (choice == 2)
            {
                System.out.print("Drink name: ");
                String name = input.nextLine();

                System.out.print("Price: ");
                double price = Double.parseDouble(input.nextLine());

                System.out.print("Size: ");
                String size = input.nextLine();

                System.out.print("Carbonated (true/false): ");
                boolean carbonated =
                        Boolean.parseBoolean(input.nextLine());

                System.out.print("Alcoholic (true/false): ");
                boolean alcoholic =
                        Boolean.parseBoolean(input.nextLine());

                Drink drink =
                        new Drink(name, price,
                                size,
                                carbonated,
                                alcoholic);

                menu.add(drink);

                System.out.println("Drink added.");
            }

            else if (choice == 3)
            {
                System.out.println();
                System.out.println("===== Menu Summary =====");

                for (MenuItem item : menu)
                {
                    item.displayItem();
                    System.out.println("-------------------");
                }
            }

            else if (choice == 4)
            {
                System.out.println("Goodbye.");
            }

            else
            {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        input.close();
    }
}