# PARCIAL_JPA_SPRINGBOOT

Este proyecto es una API REST desarrollada con Spring Boot y JPA para la gestión de préstamos y recursos bibliográficos.

## Estructura del proyecto
- **controller/**: Controladores REST para manejar las solicitudes HTTP.
- **models/**: Entidades JPA que representan las tablas de la base de datos.
- **repository/**: Interfaces que extienden JpaRepository para el acceso a datos.
- **services/**: Lógica de negocio y servicios de la aplicación.

## Requisitos previos
- Java 17 
- Maven 3.8+

## Instalación y ejecución
1. Clona el repositorio.
2. Navega a la carpeta `demo`.
3. Ejecuta: en la terminal

   mvn clean install  (opcional)
   mvn spring-boot:run
   
  
4. La aplicación estará disponible en: http://localhost:8080/swagger-ui/index.html#


## Endpoints principales
- `/prestamo` — Gestión de préstamos
- `/recurso-bibliografico` — Gestión de recursos bibliográficos
- `/usiario` — Gestión de usuarios

## Swagger/OpenAPI
http://localhost:8080/swagger-ui/index.html#

## Autor
- Sergio Alexander Gomez Zapata



