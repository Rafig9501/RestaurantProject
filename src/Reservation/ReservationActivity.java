package Reservation;

import Contractor.RestoranContractor;
import Guest.GuestServicePresenter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReservationActivity implements RestoranContractor.View {

    RestoranContractor.Presenter presenter;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void setView() throws Exception {

        presenter = new GuestServicePresenter(this);

        greetingOfGuests();

        showingMenu();

        takingOrders();

    }

    public static void main(String[] args) throws Exception {

        new ReservationActivity().setView();

    }

    @Override
    public void greetingOfGuests() {

        System.out.println("Welcome to our restaurant!!!");



    }

    @Override
    public void showingMenu() throws IOException {

        System.out.println("Here is our menu, please take a look");

        System.out.println();

        presenter.sendingMenuDataFromModelToActivity();

        System.out.println();

        System.out.println("Please enter orders\n" +
                "Whenever you finish your orders just write \"finish\"");

    }

    @Override
    public void takingOrders() throws Exception{

        String order = br.readLine();

            if (order.equals("finish")){

                presenter.givingBill(new GuestServicePresenter(this).bill);

            }
            else {

                new GuestServicePresenter(this).checkingOrderWithMenu(order);

                takingOrders();

            }
    }
}