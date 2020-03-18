# Folders API

## Environment Set Up

### Requirements

* Java 11
* Maven 3.0.5
* Docker 19.03.5
* Docker-Compose 1.24.1

### Set Up

Assuming the Java is installed at /opt/jdk-11.0.5:

```shell script
export JAVA_HOME=/opt/jdk-11.0.5
```

## Build

```shell script
mvn clean install
```

## Run

### Local

```shell script
$JAVA_HOME/bin/java -jar docker/target/spring-boot-web-service-app.jar
```

### Local within Docker

```shell script
cd ./docker
docker build -t spring-boot-web-service .
docker-compose -f docker-compose.yml up
```

## Run Tests

### Unit tests

```shell script
mvn clean verify -P UnitTests
```

### Integration tests

TODO

## Versions Plugin

Check plugin updates:
```shell script
mvn versions:display-plugin-updates
```

Check dependency updates:
```shell script
mvn versions:display-dependency-updates
```
