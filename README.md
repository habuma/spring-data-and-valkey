# Spring Data Redis and Valkey

This project is a simple example of how to use Spring Data Redis with 
[Valkey](https://valkey.io/). It should come as no surprise that Spring
Data Redis works fine with Valkey, since Valkey is a drop-in replacement
for Redis. But, it's still nice to see it in action.

Valkey will be started automatically when the application starts because
of the Docker Compose file and because the project includes Spring Boot's
Docker Compose support dependency. You will need to have Docker installed
and running before you start the application.

To run the application, execute the following command:

```
$ ./mvnw spring-boot:run
```

Once the application is running, you can use the following HTTPie commands
to interact with it (the `-b` option is to have HTTPie only return the response
body and not the headers):

```
$ http :8080/books -b
[
    {
        "author": "Craig Walls",
        "id": "a28ed07c-02c6-46c7-a9ca-2e1053f4f21a",
        "isbn": "9781617297571",
        "title": "Spring in Action"
    }
]

$ http :8080/books isbn="9781617297571" title="Spring in Action" author="Craig Walls" -b
{
    "author": "Craig Walls",
    "id": "b1764c64-2279-4980-b501-694d098f023a",
    "isbn": "9781617297571",
    "title": "Spring in Action"
}

$ http :8080/books -b
[
    {
        "author": "Craig Walls",
        "id": "b1764c64-2279-4980-b501-694d098f023a",
        "isbn": "9781617297571",
        "title": "Spring in Action"
    }
]
```