package vowel.solutions.device.data.DeviceDataEventProducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import vowel.solutions.device.data.DeviceDataEventProducer.model.WorkoutEvent;
import vowel.solutions.device.data.DeviceDataEventProducer.service.DeviceDataUploadService;
import vowel.solutions.device.data.DeviceDataEventProducer.service.KafkaProducerService;

@Service
public class DeviceDataUploadServiceImpl implements DeviceDataUploadService {
    private final KafkaProducerService<WorkoutEvent> kafkaProducerService;

    @Autowired
    public DeviceDataUploadServiceImpl(@Qualifier(value = "WorkoutEventKafkaProducerService") KafkaProducerService<WorkoutEvent> kafkaProducerService) {
        this.kafkaProducerService = kafkaProducerService;
    }

    @Override
    public void uploadWorkoutEvent(WorkoutEvent workoutEvent) {
        this.kafkaProducerService.sendMessage(workoutEvent);
    }
}
