# Patrones Arquitecturales

Utilizando patrones de arquitectura se desarrollo una api con spring boot y MongoDB para la realizacion de este laboratorio

[![CircleCI](https://circleci.com/gh/Arep-Nico/Patrones-Arquitecturales/tree/master.svg?style=svg)](https://circleci.com/gh/Arep-Nico/Patrones-Arquitecturales/tree/master)
[![Maven Central](https://img.shields.io/maven-central/v/org.springframework.boot/spring-boot-maven-plugin)](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-maven-plugin)
![GitHub](https://img.shields.io/github/license/Arep-Nico/Patrones-Arquitecturales)

### Prerequisitos

Se requiere maven y Java version 8 como minimo.

## Diseño

La documentacion del Api de **Spring Boot** esta a continuacion [aqui](documents/Laboratorio_5_Arep.pdf).

## Documentacion de Endpoins
```
  Gets:
  - Todo los usuarios: /api/v1/users
  - Nombre: /api/v1/users/{nombre}
  - Nombre y Apellido: /api/v1/users/{nombre}.{apellido}

  Post:
  - Usuario: /api/v1/users

  Put:
  - Usuario: /api/v1/users

  Delete: 
  - Usuario: /api/v1/users/{id}
```

## Running
 Para empaquetar el proyecto de Java 
 > ``` mvn package ```
 
 Para correr los test
 > ``` mvn test ```
 
 Para ejecutar Spring Boot
 > ``` mvn spring-boot:run ```
 
 Para generar la documentacion de Java
 > ``` mvn javadoc:javadoc ```

### **Ejecucion sin mvn instalado**:

 **MacOS/Linux**:
 > ``` ./mvnw spring-boot:run ```

 **Windows**:
 > ``` mvnw spring-boot:run ```


## Desarrollado

* [Maven](https://maven.apache.org/) - Dependency Management
* [JAVA](https://www.java.com/es/download) - Framework
* [JDK](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Framework
* [MongoDB](https://spring.io/guides/gs/accessing-data-mongodb/) - DataBase
* [Spring Boot](https://spring.io/quickstart) - Framework

## Versionamiento

Para ver las versiones disponible, mire [realese version](https://github.com/Arep-Nico/ConcurrentFramework/releases).

## Autor

| Developer |
| :--: |
| Nicolas Cardenas |

## License

This project is under GNU General Public License - see [LICENSE](LICENSE) to more info.

## Conocimientos

* StackOverflow
* Java Documnetation Api
* Spring Boot Documnetation
* MongoDB Documnetation