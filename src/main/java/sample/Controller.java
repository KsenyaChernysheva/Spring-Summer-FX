package sample;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import retrofit.Callback;
import retrofit.Response;
import retrofit.Retrofit;
import sample.Entity.UserReason;
import sample.model.DataApi;
import sample.model.NetworkClient;

import java.util.List;

public class Controller {

    private DataApi dataApi = NetworkClient.getInstance().getDataApi();

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

        dataApi.getReasonsList().enqueue(new Callback<List<UserReason>>() {
            public void onResponse(Response<List<UserReason>> response, Retrofit retrofit) {
                tableUsers.setItems(FXCollections.observableArrayList(response.body()));
            }

            public void onFailure(Throwable throwable) {

            }
        });
    }
}
