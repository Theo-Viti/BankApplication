#Start with a base image containing Java runtime
FROM openjdk:17.0.1-jdk-slim AS build

#Information around who maintains the image
MAINTAINER Kael

# Add the application's jar to the container
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]