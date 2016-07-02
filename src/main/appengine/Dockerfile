FROM gcr.io/google_appengine/openjdk8
VOLUME /tmp
ADD s3cr3ts.jar app.jar
CMD [ "java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]