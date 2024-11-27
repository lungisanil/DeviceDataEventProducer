package vowel.solutions.device.data.DeviceDataEventProducer.model;

public class WorkoutEvent {
    private Long memberId;
    private String workoutType;
    private String deviceName;
    private Float averageSpeed;
    private Float averageHeartRate;

    public Long getMemberId() {
        return memberId;
    }

    public WorkoutEvent setMemberId(Long memberId) {
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

    public Float getAverageSpeed() {
        return averageSpeed;
    }

    public WorkoutEvent setAverageSpeed(Float averageSpeed) {
        this.averageSpeed = averageSpeed;
        return this;
    }

    public Float getAverageHeartRate() {
        return averageHeartRate;
    }

    public WorkoutEvent setAverageHeartRate(Float averageHeartRate) {
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
