package vowel.solutions.device.data.DeviceDataEventProducer.service;

public interface KafkaProducerService<M> {
    void sendMessage(M message);
}
