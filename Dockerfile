FROM openjdk:8-jdk-alpine
VOLUME /tmp
RUN apk add --no-cache fontconfig ttf-dejavu
COPY target/mavenchatclient-0.0.1-SNAPSHOT.jar target/mavenchatclient-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","target/mavenchatclient-0.0.1-SNAPSHOT.jar"]