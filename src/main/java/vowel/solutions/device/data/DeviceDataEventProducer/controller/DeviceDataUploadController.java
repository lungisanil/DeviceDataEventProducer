package vowel.solutions.device.data.DeviceDataEventProducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vowel.solutions.device.data.DeviceDataEventProducer.model.SuccessResponse;
import vowel.solutions.device.data.DeviceDataEventProducer.service.DeviceDataUploadService;
import vowel.solutions.device.data.device.data.event.producer.WorkoutEvent;

@RestController
@RequestMapping(value = "/workout-event", produces = MediaType.APPLICATION_JSON_VALUE)
public class DeviceDataUploadController {

    private final DeviceDataUploadService deviceDataUploadService;

    @Autowired
    public DeviceDataUploadController(DeviceDataUploadService deviceDataUploadService) {
        this.deviceDataUploadService = deviceDataUploadService;
    }

    @PostMapping(value = "/upload")
    public ResponseEntity<SuccessResponse> uploadSong(@RequestBody WorkoutEvent workoutEvent) {
        this.deviceDataUploadService.uploadWorkoutEvent(workoutEvent);
        return ResponseEntity.ok().body(new SuccessResponse().setMessage("Event uploaded").setStatusCode(HttpStatus.OK.toString()));
    }
}
