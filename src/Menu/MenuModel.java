package Menu;

import java.util.HashMap;

public class MenuModel {

    public HashMap<String,String> Menu = new HashMap<>();


    private String soup1 = "Gospacho soup";
    private String soup2 = "Mushroom soup";
    private String soup3 = "Tomato soup";
    private String soup4 = "Minestrone soup";

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

    private String desert1 = "Red Velvet Cake";
    private String desert2 = "Cheesecake";
    private String desert3 = "Napoleon Cake";

    public HashMap menuModel(){

        Menu.put("1",mainCourse1);
        Menu.put("2",mainCourse2);
        Menu.put("3",mainCourse3);
        Menu.put("4",mainCourse4);

        Menu.put("5",salad1);
        Menu.put("6",salad2);
        Menu.put("7",salad3);

        Menu.put("8",drink1);
        Menu.put("9",drink2);
        Menu.put("10",drink3);
        Menu.put("11",drink4);

        Menu.put("12",soup1);
        Menu.put("13",soup2);
        Menu.put("14",soup3);
        Menu.put("15",soup4);

        Menu.put("16", desert1);
        Menu.put("17", desert2);
        Menu.put("18", desert3);

        return Menu;

    }
}


