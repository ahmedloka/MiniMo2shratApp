package apps.sharabash.minimo2shratapp.models;

public class ResponseStartModel {

    private String Message;

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    @Override
    public String toString() {
        return "ResponseStartModel{" +
                "Message='" + Message + '\'' +
                '}';
    }
}
