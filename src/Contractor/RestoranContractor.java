package Contractor;

import java.io.IOException;

public interface RestoranContractor {

    interface View {

        int greetingOfGuests() throws IOException;

        void showingMenu() throws IOException;

        void showingBill();

        void setRestoranPresenter();

    }

    interface Presenter{

        void checkingOrderWithMenu();

        void takingOrders();

        void givingBill();


    }
}
