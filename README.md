# quarkus-anti-fraud-system

This project uses Quarkus, the Supersonic Subatomic Java Framework.

This is a learning project I built for the JetBrains Academy 'Java Backend Developer' course.
It was initially developed with Spring Boot and has now become my first <b>Quarkus</b> application.
The 'transfer' took just a few hours using Spring extensions within Quarkus
(specifically Spring Web, Spring DI and Spring Data JPA).
The project is deployed through Docker using the <b>native image produced with GraalVM
</b>. The 'original' project is built with Spring Boot and available here:
<https://github.com/stiebo/Anti-Fraud-System>

                        
Project description:
Frauds carry significant financial costs and risks for all stakeholders. So, the presence of
an anti-fraud system is a necessity for any serious e-commerce platform.

The Anti-Fraud System project provides a comprehensive framework for detecting and preventing
fraudulent financial transactions. By integrating role-based access control, RESTful APIs,
heuristic validation rules, and adaptive feedback mechanisms, the system offers a robust
solution for financial institutions to safeguard against fraud.
                        
Link to Github repository: <https://github.com/stiebo/quarkus-anti-fraud-system>
                        
Check out my Github profile: <https://github.com/stiebo>
                        
Link to the learning project: <https://hyperskill.org/projects/232>
                        
Check out my learning profile: <https://hyperskill.org/profile/500961738>

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Running the application in dev mode

You can run the application in dev mode that enables live coding using:

```shell script
./mvnw compile quarkus:dev
```

> **_NOTE:_**  Quarkus now ships with a Dev UI, which is available in dev mode only at <http://localhost:8080/q/dev/>.

## Packaging and running the application

The application can be packaged using:

```shell script
./mvnw clean package
```

It produces the `quarkus-run.jar` file in the `target/quarkus-app/` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/quarkus-app/lib/` directory.

The application is now runnable using `java -jar target/quarkus-app/quarkus-run.jar`.

If you want to build an _über-jar_, execute the following command:

```shell script
./mvnw package -Dquarkus.package.jar.type=uber-jar
```

The application, packaged as an _über-jar_, is now runnable using `java -jar target/*-runner.jar`.

## Creating a native executable

You can create a native executable using:

```shell script
./mvnw package -Dnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:

```shell script
./mvnw package -Dnative -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./target/quarkus-anti-fraud-system-0.0.1-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult <https://quarkus.io/guides/maven-tooling>.

## Related Guides

- Quarkus Extension for Spring Security API ([guide](https://quarkus.io/guides/spring-security)): Secure your application with Spring Security annotations
- Quarkus Extension for Spring DI API ([guide](https://quarkus.io/guides/spring-di)): Define your dependency injection with Spring DI
- Quarkus Extension for Spring Web API ([guide](https://quarkus.io/guides/spring-web)): Use Spring Web annotations to create your REST services
- Quarkus Extension for Spring Data JPA API ([guide](https://quarkus.io/guides/spring-data-jpa)): Use Spring Data JPA annotations to create your data access layer
- Quarkus Extension for Spring Boot properties ([guide](https://quarkus.io/guides/spring-boot-properties)): Use Spring Boot properties annotations to configure your application

## Provided Code

### Spring Web

Spring, the Quarkus way! Start your REST Web Services with a Spring Controller.

[Related guide section...](https://quarkus.io/guides/spring-web#greetingcontroller)
