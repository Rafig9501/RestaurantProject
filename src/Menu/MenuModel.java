package Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MenuModel {

    public Map<String, Integer> Menu = new HashMap<>();
    public ArrayList<String> MenuForShowing = new ArrayList<>();
    public static ArrayList<String> OrdersFromActivity = new ArrayList<>();

    public MenuModel() {

        Menu.put(soup1,6);
        Menu.put(soup2,5);
        Menu.put(soup3,4);
        Menu.put(soup4,6);

        Menu.put(salad1,5);
        Menu.put(salad2,6);
        Menu.put(salad3,4);

        Menu.put(drink1,2);
        Menu.put(drink2,2);
        Menu.put(drink3,3);
        Menu.put(drink4,2);

        Menu.put(mainCourse1,12);
        Menu.put(mainCourse2,19);
        Menu.put(mainCourse3,14);
        Menu.put(mainCourse4,15);

        Menu.put(dessert1,7);
        Menu.put(dessert2,6);
        Menu.put(dessert3,5);


        MenuForShowing.add(0,soup1+" 6 AZN");
        MenuForShowing.add(1,soup2+" 5 AZN");
        MenuForShowing.add(2,soup3+" 4 AZN");
        MenuForShowing.add(3,soup4+" 6 AZN");

        MenuForShowing.add(4,salad1+" 5 AZN");
        MenuForShowing.add(5,salad2+" 6 AZN");
        MenuForShowing.add(6,salad3+" 4 AZN");

        MenuForShowing.add(7,drink2+" 2 AZN");
        MenuForShowing.add(8,drink2+" 2 AZN");
        MenuForShowing.add(9,drink3+" 3 AZN");
        MenuForShowing.add(10,drink2+" 2 AZN");

        MenuForShowing.add(11,mainCourse1+" 12 AZN");
        MenuForShowing.add(12,mainCourse2+" 19 AZN");
        MenuForShowing.add(13,mainCourse3+" 14 AZN");
        MenuForShowing.add(14,mainCourse4+" 15 AZN");

        MenuForShowing.add(15,dessert1+" 7 AZN");
        MenuForShowing.add(16,dessert2+" 6 AZN");
        MenuForShowing.add(17,dessert3+" 5 AZN");

    }

    private String salad1 = "Ceasar salad";
    private String salad2 = "Kus Kus salad";
    private String salad3 = "Greek salad";

    private String mainCourse1 = "Lamb Chops";
    private String mainCourse2 = "Pepper Steak T Bone";
    private String mainCourse3 = "Cryspy Chicken";
    private String mainCourse4 = "Chicken Basket";

    private String drink1 = "Cola";
    private String drink2 = "Fanta";
    private String drink3 = "Juice";
    private String drink4 = "Ayran";

    private String dessert1 = "Red Velvet Cake";
    private String dessert2 = "Cheesecake";
    private String dessert3 = "Napoleon Cake";

    private String soup1 = "Gospacho soup";
    private String soup2 = "Mushroom soup";
    private String soup3 = "Tomato soup";
    private String soup4 = "Minestrone soup";
}


