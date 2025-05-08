# Create Spring Boot REST API That Returns JSON

To create a simple SpringBoot RESTful API, that returns a java bean as a JSON to the client

## First Steps

- Create a bean package
- Create a Student class in the above bean package
- Create/ define instance variables for this class



### Ref Path/ Code:

```diff
springboot-rest-api\springboot-rest-api\src\main\java\net\javaguides\springboot\bean\Student.java
```

```bash
public class Student {

    private int id;
    private String firstName;
    private String lastName;
}
```

- Create a constructor in class, after defining the variable for the above class

```bash 
    public Student(String lastName, String firstName, int id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    } 

```


- Create/ generate a setter and getter method for the instance variable

```bash
public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


```

- Now we have created, `Student` as a java bean, and when you develop the API, we use this java bean as a response and then the Spring MVC would convert this java object into JSON and it would send that JSON back to the client

## Second Steps - Create a Spring MVC Controller

### Ref Path/ Code:

```diff
springboot-rest-api\springboot-rest-api\src\main\java\net\javaguides\springboot\controller\StudentController.java
```

- Goto controller package and create new java class
- Annotate this class with the @RestController to make this class a Spring MVC REST Controller


```bash
import org.springframework.web.bind.annotation.RestController;
@RestController
```
- Create a SpringBoot RESTful API that returns java bean as a JSON to the client

```bash
    // http://localhost:8080/student
    @GetMapping("student")
    public Student getStudent() {
        Student student = new Student(
                "John",
              "Doe",
              1
        );
        return student;
    }

```

## Contributing

Pull requests are welcome. For major changes, please open an issue first
to discuss what you would like to change.

Please make sure to update `tests` as appropriate.

## License

***
