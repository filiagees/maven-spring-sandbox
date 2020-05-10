# maven-spring-sandbox

## Getting started
### Running in CLI
`mvn spring-boot:run`

### Testing and Code coverage
Run simple tests:

`mvn clean test`

An updated report will be generated in the folder: 

`/target/site/jacoco/index.html`

To check if coverage level is under minimum expected (see `pom.xml` for details):

`mvn clean verify`

#### Details
##### Different results of coverage
Pay attention to slight different value of code coverage, according the way it was invoked.
For example:
* with `mvn clean verify` there is 98% (missed 2 of 114 instructions)
* with Intellij's *Run with Coverage* there is 94% (missed 6 of 118 instructions) 

##### Covering Spring Code
To cover Spring code properly pay attention to pom.xml entry:

     <execution>
        <id>default-report</id>
        <phase>verify</phase>
        <goals>
            <goal>report</goal>
        </goals>
    </execution>

### Extra links (answers, repositories):
* StackOverflow: [Generate Code Coverage with JaCoCo and spring-boot-maven-plugin](https://stackoverflow.com/a/60040545/7362660)
* Project: https://github.com/maciejwalkowiak/jacoco-spring-boot-maven-plugin-sample

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/maven-plugin/)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#using-boot-devtools)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Prometheus](https://docs.spring.io/spring-boot/docs/2.2.7.RELEASE/reference/html/production-ready-features.html#production-ready-metrics-export-prometheus)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

