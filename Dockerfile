FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD /target/demo-dockerize-0.0.1-SNAPSHOT.jar demo-dockerize-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "demo-dockerize-0.0.1-SNAPSHOT.jar"]