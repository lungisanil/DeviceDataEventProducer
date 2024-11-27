package vowel.solutions.device.data.DeviceDataEventProducer.model;

public class SuccessResponse {
    private String statusCode;
    private String message;

    public String getStatusCode() {
        return statusCode;
    }

    public SuccessResponse setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public SuccessResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "SuccessResponse{" +
                "statusCode='" + statusCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
