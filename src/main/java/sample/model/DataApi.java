package sample.model;

import retrofit.http.GET;
import sample.Entity.UserReason;
import retrofit.Call;

import java.util.List;

public interface DataApi {

    @GET("reasons.json")
    Call<List<UserReason>> getReasonsList();
}
