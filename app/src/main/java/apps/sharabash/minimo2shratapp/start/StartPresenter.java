package apps.sharabash.minimo2shratapp.start;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import org.json.JSONObject;

import apps.sharabash.minimo2shratapp.models.ResponseStartModel;
import apps.sharabash.minimo2shratapp.models.StartModel;
import apps.sharabash.minimo2shratapp.network.NetworkUtil;
import apps.sharabash.minimo2shratapp.utils.Constant;
import apps.sharabash.minimo2shratapp.utils.Validation;
import retrofit2.HttpException;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import rx.subscriptions.CompositeSubscription;

public class StartPresenter {

    private static final String TAG = "addTinder";
    private Context mContext;
    private CompositeSubscription mSubscriptions;
    private SharedPreferences sharedPreferences;

    public StartPresenter(Context context) {
        this.mContext = context;
        mSubscriptions = new CompositeSubscription();
        sharedPreferences = mContext.getSharedPreferences("MySharedPreference", Context.MODE_PRIVATE);
    }

    public void putRequest(String status) {
        if (Validation.isConnected(mContext)) {
            StartModel startModel = new StartModel();
            startModel.setStatus(status);

            mSubscriptions.add(NetworkUtil.getRetrofitByToken(Constant.TOKEN)
                    .modifeyData(startModel)
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribeOn(Schedulers.io())
                    .subscribe(this::handleResponse, this::handleError));
        }


    }

    private void handleError(Throwable throwable) {
        String message = "";
        if (throwable instanceof HttpException) {
            try {
                HttpException error = (HttpException) throwable;
                JSONObject jsonObject = new JSONObject(((HttpException) throwable).response().errorBody().string());
                Log.d(TAG, "handleError: " + message);
                message = jsonObject.getString("Warning");
            } catch (Exception e) {
                message = throwable.getMessage();
                Log.d(TAG, "handleError: " + message);
            }
        }
    }

    private void handleResponse(ResponseStartModel responseStartModel) {

        Log.d(TAG, "handleResponse: " + responseStartModel.toString());
    }

}
