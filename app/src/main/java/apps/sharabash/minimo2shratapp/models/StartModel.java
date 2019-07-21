package apps.sharabash.minimo2shratapp.models;

public class StartModel {

    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "StartModel{" +
                "status='" + status + '\'' +
                '}';
    }
}
