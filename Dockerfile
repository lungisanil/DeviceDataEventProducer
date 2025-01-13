
FROM amazoncorretto:17-alpine-jdk
COPY target/DeviceDataEventProducer-1.0.0-SNAPSHOT.war DeviceDataEventProducer.war
ENTRYPOINT ["java", "-jar", "/DeviceDataEventProducer.war"]

#docker build -t device-data-event-producer-image .