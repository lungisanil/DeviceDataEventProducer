package vowel.solutions.device.data.DeviceDataEventProducer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import vowel.solutions.device.data.DeviceDataEventProducer.model.WorkoutEvent;
import vowel.solutions.device.data.DeviceDataEventProducer.service.KafkaProducerService;

@Service(value = "WorkoutEventKafkaProducerService")
public class WorkoutEventKafkaProducerService implements KafkaProducerService<WorkoutEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkoutEventKafkaProducerService.class);
    private final KafkaTemplate<String, WorkoutEvent> kafkaTemplate;

    @Value("${spring.kafka.topic.name}")
    private String workoutEventTopic;

    @Autowired
    public WorkoutEventKafkaProducerService(KafkaTemplate<String, WorkoutEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void sendMessage(WorkoutEvent message) {
        LOGGER.info("Preparing to send the message to the topic : {}", workoutEventTopic);

        try {
            Message<WorkoutEvent> workoutMessage = MessageBuilder
                    .withPayload(message)
                    .setHeader(KafkaHeaders.TOPIC, workoutEventTopic)
                    .build();
            this.kafkaTemplate.send(workoutMessage);
        } catch (Exception ex) {
            throw new RuntimeException("Failed to send the message to the topic");
        }

        LOGGER.info(String.format("Message sent %s", message));
    }
}
