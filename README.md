## GBIF parser demo

Simple demo using [Spring](https://spring.io/) to wrap [GBIF parsers](https://github.com/gbif/parsers).  

Right now I have only exposed the `date parser`. 

### Usage 

```shell script
cd parser-rest-service
mvn clean package
java -jar target/gs-rest-service-0.1.0.jar
```

Test the API:

* http://localhost:8080/date/
* http://localhost:8080/date/?date=june%201%202000
* http://localhost:8080/date/?date=3rd%20July%201999

