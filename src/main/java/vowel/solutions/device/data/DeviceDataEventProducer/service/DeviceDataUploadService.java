package vowel.solutions.device.data.DeviceDataEventProducer.service;

import vowel.solutions.device.data.device.data.event.producer.WorkoutEvent;

public interface DeviceDataUploadService {

    void uploadWorkoutEvent(WorkoutEvent workoutEvent);
}
