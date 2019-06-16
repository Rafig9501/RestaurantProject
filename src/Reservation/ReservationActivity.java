package Reservation;

import Contractor.RestoranContractor;
import Guest.GuestServicePresenter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReservationActivity implements RestoranContractor.View {

    RestoranContractor.Presenter presenter;

    void setView(){

        new GuestServicePresenter(this);

    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {

        new ReservationActivity().setView();

    }

    @Override
    public int greetingOfGuests() throws IOException {

        System.out.println("Welcome to our restaurant!!!");

        System.out.println("Please enter amount of the guests");

        int numberOfGuests = Integer.parseInt(br.readLine());

        return numberOfGuests;

    }

    @Override
    public void showingMenu() throws IOException {

        System.out.println("Here is our menu, please take a look");



    }


    @Override
    public void showingBill() {

    }

    @Override
    public void setRestoranPresenter() {

        new GuestServicePresenter(this);

    }
}
