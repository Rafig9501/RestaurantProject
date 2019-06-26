package Contractor;

import java.io.IOException;

public interface RestoranContractor {

    interface View {

        void greetingOfGuests() throws IOException;

        void showingMenu() throws IOException;

        void takingOrders() throws Exception;

        void setView() throws Exception;

    }

    interface Presenter{

        void sendingMenuDataFromModelToActivity();

        int checkingOrderWithMenu(String order) throws IOException;

        void givingBill(int bill);


    }
}
