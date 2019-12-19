# MToDoList

A task management application with basic REST API and thymeleaf web.

## Built With

* 	[Maven](https://maven.apache.org/) - Dependency Management
* 	[JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java™ Platform, Standard Edition Development Kit 
* 	[Spring Boot](https://spring.io/projects/spring-boot) - Framework to ease the bootstrapping and development of new Spring Applications
* 	[MySQL](https://www.mysql.com/) - Open-Source Relational Database Management System
* 	[H2 Database](https://www.h2database.com/html/main.html) - Open-Source In-Memory Database
* 	[git](https://git-scm.com/) - Free and Open-Source distributed version control system 
* 	[Thymeleaf](https://www.thymeleaf.org/) - Modern server-side Java template engine for both web and standalone environments.
* 	[Lombok](https://projectlombok.org/) - Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.
* 	[MyBatis](https://mybatis.org/mybatis-3/) - MyBatis is a first class persistence framework with support for custom SQL, stored procedures and advanced mappings.


## External Tools Used

* [Postman](https://www.getpostman.com/) - API Development Environment (Testing Docmentation)

## Running the application locally

One way is to execute the `main` method from your IDE.

- Download the zip or clone the Git repository.
- Unzip the zip file (if you downloaded one)
- Open Command Prompt and Change directory (cd) to folder containing pom.xml
- Open Eclipse 
   - File -> Import -> Existing Maven Project -> Navigate to the folder where you unzipped the zip
   - Select the project
- Choose the Spring Boot Application file (search for @SpringBootApplication)
- Right Click on the file and Run as Java Application

### M-Tasks UI
![M-Tasks UI](https://github.com/UNO998/MToDoList/blob/master/doc/UI.png "M-Tasks UI")

### Thymeleaf webs

To monitor and manage your application

|  URL |  Method |
|----------|--------------|
|`http://localhost:8081`  						         | GET |
|`http://localhost:8081/tasks/list`  		         | GET |
|`http://localhost:8081/tasks/showFormForAdd`  		| GET |
|`http://localhost:8081/tasks/showFormForUpdate`  	| GET |
|`http://localhost:8081/tasks/save`  		         | POST |
|`http://localhost:8081/tasks/delete`  		      | GET |
|`http://localhost:8081/tasks/search`  		      | GET |

### REST API

|  URL |  Method |
|----------|--------------|
|`http://localhost:8081/api/task`  						| POST |
|`http://localhost:8081/api/task/{tid}`  				| GET |
|`http://localhost:8081/api/tasks`  					| GET |
|`http://localhost:8081/api/task`  						| PUT |
|`http://localhost:8081/api/task/{tid}`  				| DELETE |
|`http://localhost:8081/api/tasks/search`  			| GET |

## Documentation

* [Postman Collection](https://www.getpostman.com/collections/5ce3eedc5306221d843e)

## packages

- `bean` — to hold our entities;
- `mapper` — to communicate with the database;
- `service` — to hold our business logic;
- `webControllers` — to listen to the client;
- `restControllers` — to listen to the client and provide Rest APIs;

- `resources/` - Contains all the static resources, templates and property files.
- `resources/static` - contains static resources such as css, js and images.
- `resources/sql` - contains sql to initial MySQL or H2 database
- `resources/templates` - contains server-side templates which are rendered by Spring.
- `resources/application.yml` - It contains application-wide properties. Spring reads the properties defined in this file to configure your application.
- `resources/application-dev.yml` - It contains mysql database configuration including setup username and password to access your local MySQL database.
- `resources/application-test.yml` - It contains H2 database configuration.
- `test/` - contains unit and integration tests

- `pom.xml` - contains all the project dependencies

## License
