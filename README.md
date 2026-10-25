# studentList

Spring Boot exercise: a controller at `/hello` builds a list of 2 students (Mikko and Malla Mallikas) and hands it to a Thymeleaf template, `studentList.html`, that prints their names in a table.

Not working as committed:
- `DemoController` is in `com.example.java.web`, outside `com.example.demo`, so component scanning doesn't pick it up and `/hello` isn't mapped
- `pom.xml` has only the web starter, no Thymeleaf, so the template wouldn't render either
- The template reads `student.firsName`, a typo for `firstName`

Stack: Java 17, Spring Boot 3.1.3, Maven wrapper. The code is in `demo/`.

Run:

```
cd demo
sh mvnw spring-boot:run      # macOS / Linux
mvnw.cmd spring-boot:run     # Windows
```

Port 8080 (Spring Boot default). Because of the points above, `/hello` doesn't show the list.

Status: course assignment, 1 commit on 6 September 2023.
