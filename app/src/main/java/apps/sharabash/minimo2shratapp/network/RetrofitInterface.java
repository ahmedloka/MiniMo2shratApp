package apps.sharabash.minimo2shratapp.network;

import apps.sharabash.minimo2shratapp.models.ResponseStartModel;
import apps.sharabash.minimo2shratapp.models.StartModel;
import retrofit2.http.Body;
import retrofit2.http.PUT;
import rx.Observable;

public interface RetrofitInterface {

    @PUT("api/home/PutStatus")
    Observable<ResponseStartModel> modifeyData(@Body StartModel startModel);
}
