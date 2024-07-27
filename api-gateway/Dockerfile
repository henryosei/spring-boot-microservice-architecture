FROM amazoncorretto:21-alpine
WORKDIR apps
LABEL authors="henryosei"
COPY target/api-gateway-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]