package Guest;

import Contractor.RestoranContractor;
import Menu.MenuModel;
import Reservation.ReservationActivity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;


public class GuestServicePresenter implements RestoranContractor.Presenter {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    RestoranContractor.View view;

    MenuModel menuModel;

    public static int bill=0;

    public GuestServicePresenter(RestoranContractor.View view) {

        this.view = view;

        menuModel = new MenuModel();

    }

    @Override
    public void sendingMenuDataFromModelToActivity() {

        menuModel = new MenuModel();

        ArrayList<String> menuFromModel = menuModel.MenuForShowing;

        for (int i = 0;i<menuFromModel.size();i++){

            if (i==0) {
                System.out.println("       Soups");
            }
            if (i == 4){
                System.out.println("\n       Salads");
            }
            if (i == 7){
                System.out.println("\n       Drinks");

            }
            if (i == 11){
                System.out.println("\n       Maincourses");

            }
            if (i == 15){
                System.out.println("\n       Desserts");
            }

            System.out.println(menuFromModel.get(i));

        }
    }

    @Override
    public int checkingOrderWithMenu(String order) throws IOException {

        view = new ReservationActivity();

        if (menuModel.Menu.containsKey(order)) {

            menuModel.OrdersFromActivity.add(order);

            bill = bill + menuModel.Menu.get(order);

        }

        else {

            System.out.println("Please enter correctly order's name");

            try {

                new ReservationActivity().setView();

            }
            catch (Exception e) {

                e.printStackTrace();

            }
        }
        return bill;
    }

    @Override
    public void givingBill(int bill) {

        bill = this.bill;

        Iterator iterator = menuModel.OrdersFromActivity.iterator();

        System.out.println("Your orders is : ");

        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        System.out.println("Your bill is " + bill + " AZN");

        menuModel.OrdersFromActivity.clear();

    }
}
