package pixel.academy.rest_crud_app.rest;

public class StudentErrorResponse {

    private int status;

    private String massage;

    private long timeStamp;

    public StudentErrorResponse(int status, String message, long timeStamp) {
        this.status    = status;
        this.massage   = message;
        this.timeStamp = timeStamp;
    }

    public StudentErrorResponse() {

    }

    // getters

    public int getStatus() {
        return status;
    }

    public String getMassage() {
        return massage;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    // setters

    public void setStatus(int status) {
        this.status = status;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
