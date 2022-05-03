[![Java language](https://img.shields.io/badge/language-Java-bf7b3b.svg)](https://www.oracle.com/java/ "Java language")
[![Built with Apache Maven](https://img.shields.io/badge/built_with-Apache_Maven-f69625.svg)](http://maven.apache.org "Built with Apache Maven")

# Spring Boot 2 Web Thymeleaf Sample

The &ldquo;Spring Boot 2 Web Thymeleaf Sample&rdquo; is a basic and minimal [Maven](https://maven.apache.org "Apache Maven")-based project to show how to use [Thymeleaf](https://www.thymeleaf.org) (a modern server-side Java *template engine*) with [Spring Boot](https://spring.io/projects/spring-boot) version 2.x. 


## How to build and run

You can build and run the application in many ways (depending on your environment and/or IDE).

#### 1) Using Maven to build a &ldquo;fat&rdquo; JAR that you can easily run<br>
   From command line (in project's main directory):
   * run `mvn package`
   * then go into the `target/` directory
   * then run `java -jar spring-boot2-web-thymeleaf-sample-X.Y.Z.jar` (*X.Y.Z* the real version numbers)

#### 2) Using Maven to directly build&run the application<br>
   From command line (in project's main directory):
   * run `mvn spring-boot:run`

#### 3) Using the Eclipse IDE
   * import the project (&ldquo;File&rdquo; -> &ldquo;Import...&rdquo; then &ldquo;Existing Maven Projects&rdquo; etc...)
   * then build the project (if it's not built automatically)
   * then find the `Application` class and &ldquo;Run As&rdquo; -> &ldquo;Java Application&rdquo; (but there are other ways in Eclipse)

<br>

Note: other IDEs (e.g. NetBeans, IntelliJ IDEA) may also be used, the procedure may be very similar/equivalent.

Once the application is running, point your browser to `http://localhost:8080`. You should see a simple page that shows some informations about the running application.




