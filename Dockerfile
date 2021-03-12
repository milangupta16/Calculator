FROM openjdk:8
MAINTAINER Milan Gupta milangupta1998@gmail.com
COPY ./target/calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "  -jar", "calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]