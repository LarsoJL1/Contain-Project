FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY src /app/src

RUN javac src/*.java -d out

ENTRYPOINT ["java", "-cp", "out", "CustomerApp"]