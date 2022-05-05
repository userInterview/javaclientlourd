FROM openjdk:8-jdk-alpine
EXPOSE 1099
VOLUME /tmp
COPY target/MavenServerRMI-0.0.1-SNAPSHOT.jar target/MavenServerRMI-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-Djava.rmi.server.hostname=localhost", "target/MavenServerRMI-0.0.1-SNAPSHOT.jar"]