package vowel.solutions.device.data.DeviceDataEventProducer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topic.name}")
    private String workoutEventTopic;

    @Bean
    public NewTopic getWorkoutEventTopic() {
        return TopicBuilder.name(workoutEventTopic).build();
    }
}
