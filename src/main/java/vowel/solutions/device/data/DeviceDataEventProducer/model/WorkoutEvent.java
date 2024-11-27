package vowel.solutions.device.data.DeviceDataEventProducer.model;

public class WorkoutEvent {
    private long memberId;
    private String workoutType;
    private String deviceName;
    private float averageSpeed;
    private float averageHeartRate;

    public long getMemberId() {
        return memberId;
    }

    public WorkoutEvent setMemberId(long memberId) {
        this.memberId = memberId;
        return this;
    }

    public String getWorkoutType() {
        return workoutType;
    }

    public WorkoutEvent setWorkoutType(String workoutType) {
        this.workoutType = workoutType;
        return this;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public WorkoutEvent setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }

    public float getAverageSpeed() {
        return averageSpeed;
    }

    public WorkoutEvent setAverageSpeed(float averageSpeed) {
        this.averageSpeed = averageSpeed;
        return this;
    }

    public float getAverageHeartRate() {
        return averageHeartRate;
    }

    public WorkoutEvent setAverageHeartRate(float averageHeartRate) {
        this.averageHeartRate = averageHeartRate;
        return this;
    }

    @Override
    public String toString() {
        return "WorkoutEvent{" +
                "memberId=" + memberId +
                ", workoutType='" + workoutType + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", averageSpeed=" + averageSpeed +
                ", averageHeartRate=" + averageHeartRate +
                '}';
    }
}
