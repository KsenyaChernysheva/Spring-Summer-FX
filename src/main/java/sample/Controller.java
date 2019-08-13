package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Entity.UserReason;
import sample.model.DataApi;
import sample.model.DataApiStaticImpl;

public class Controller {

    private DataApi dataApi = new DataApiStaticImpl();

//    private ObservableList<UserReason> usersData = dataApi.getReasonsList();

    @FXML
    private TableView<UserReason> tableUsers;

    @FXML
    private TableColumn<UserReason, String> user;

    @FXML
    private TableColumn<UserReason, String> country;

    @FXML
    private TableColumn<UserReason, String> reason;

    @FXML
    private TableColumn<UserReason, String> comment;

    @FXML
    private void initialize() {

        user.setCellValueFactory(new PropertyValueFactory<UserReason, String>("user"));
        country.setCellValueFactory(new PropertyValueFactory<UserReason, String>("country"));
        reason.setCellValueFactory(new PropertyValueFactory<UserReason, String>("reason"));
        comment.setCellValueFactory(new PropertyValueFactory<UserReason, String>("comment"));

        tableUsers.setItems(dataApi.getReasonsList());
    }

}
