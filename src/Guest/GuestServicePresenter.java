package Guest;

import Contractor.RestoranContractor;
import Menu.MenuModel;
import java.util.HashMap;

public class GuestServicePresenter implements RestoranContractor.Presenter {

    RestoranContractor.View view;

    MenuModel menuModel;

    public GuestServicePresenter(RestoranContractor.View view) {

        this.view = view;

        menuModel = new MenuModel();

    }

    @Override
    public void checkingOrderWithMenu() {

        HashMap<String, String> menuFromModel = new MenuModel().menuModel();

    }

    @Override
    public void takingOrders() {

    }


    @Override
    public void givingBill() {

    }
}
