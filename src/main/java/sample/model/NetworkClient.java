package sample.model;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.logging.HttpLoggingInterceptor;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class NetworkClient {
    private static NetworkClient ourInstance = new NetworkClient();

    public static NetworkClient getInstance() {
        return ourInstance;
    }

    private NetworkClient() {
    }

    private DataApi dataApi;

    public DataApi getDataApi() {
        if (dataApi == null) {
            OkHttpClient client = new OkHttpClient();
            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            client.interceptors().add(logging);

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://localhost:8080/spring_controllers_war_exploded/api/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();

            dataApi = retrofit.create(DataApi.class);
        }
        return dataApi;
    }
}
