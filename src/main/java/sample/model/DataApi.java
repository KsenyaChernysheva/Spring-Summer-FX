package sample.model;

import javafx.collections.ObservableList;
import sample.Entity.UserReason;

import java.util.List;
import java.util.Observable;

public interface DataApi {

    ObservableList<UserReason> getReasonsList();
}
