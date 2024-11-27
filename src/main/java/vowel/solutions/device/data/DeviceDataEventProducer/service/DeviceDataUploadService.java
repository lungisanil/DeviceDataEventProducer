package vowel.solutions.device.data.DeviceDataEventProducer.service;

import vowel.solutions.device.data.DeviceDataEventProducer.model.WorkoutEvent;

public interface DeviceDataUploadService {

    void uploadWorkoutEvent(WorkoutEvent workoutEvent);
}
