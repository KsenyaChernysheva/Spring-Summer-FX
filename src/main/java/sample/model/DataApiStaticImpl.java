package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import sample.Entity.Reason;
import sample.Entity.User;
import sample.Entity.UserReason;

import java.util.ArrayList;

public class DataApiStaticImpl implements DataApi{

    public ObservableList<UserReason> getReasonsList() {
        ArrayList<UserReason> arrayList = new ArrayList<UserReason>(30);

        for (int i = 0; i < 30; i++) {
            arrayList.add(new UserReason(1L + i, new User(1L, "ksusha" + i, "123"),
                    new Reason(1L, "like"), "Russia", "oraora"));
        }

        ObservableList<UserReason> list = FXCollections.observableArrayList(arrayList);

        return list;
    }
}
