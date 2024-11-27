package vowel.solutions.device.data.DeviceDataEventProducer.model;

public class ErrorResponse {
    private String statusCode;
    private String message;

    public String getStatusCode() {
        return statusCode;
    }

    public ErrorResponse setStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "statusCode='" + statusCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
