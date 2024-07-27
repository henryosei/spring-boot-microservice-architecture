FROM amazoncorretto:21-alpine
LABEL authors="henryosei"
COPY target/config-server-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["jar", "-jar","app.jar"]