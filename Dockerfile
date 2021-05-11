FROM openjdk:8-jdk-alpine
ENV JAR_FILE=target/*.jar
ENV JAVA_OPTS=""
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]