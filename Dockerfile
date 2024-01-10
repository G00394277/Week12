FROM openjdk:17

WORKDIR /app

COPY target/Week12-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "Week12-0.0.1-SNAPSHOT.jar"]