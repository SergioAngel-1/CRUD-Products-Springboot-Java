# CRUD Spring Boot Application

Este proyecto es una aplicación CRUD (Crear, Leer, Actualizar, Eliminar) desarrollada con Spring Boot. La aplicación permite gestionar entidades (como usuarios, productos, etc.) de forma eficiente utilizando una arquitectura basada en RESTful APIs.

## Requisitos previos

Asegúrate de tener los siguientes requisitos instalados en tu sistema antes de iniciar el proyecto:

- **Java 8 o superior**: [Descargar e instalar Java](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- **Maven Wrapper**: El proyecto incluye el archivo `mvnw`, por lo que no es necesario instalar Maven globalmente.
- **Git (opcional)**: Para clonar el repositorio desde un control de versiones.

## Pasos para iniciar el proyecto

1. **Clonar el repositorio** (si no lo has hecho ya):
   ```bash
   git clone git@github.com:SergioAngel-1/CRUD-Products-Springboot-Java.git
   cd crudspring
   ```

2. **Navegar al directorio del proyecto**:
   En este caso, el directorio del proyecto es `demo`. Ejecuta el siguiente comando para entrar en la carpeta correcta:
   ```bash
   cd demo
   ```

3. **Ejecutar el proyecto**:
   El proyecto incluye el `mvnw` (Maven Wrapper), que te permite ejecutar el proyecto sin tener Maven instalado globalmente. Solo necesitas el siguiente comando para iniciar la aplicación:
   ```bash
   ./mvnw spring-boot:run
   ```

   - En **Windows**, si no puedes ejecutar el comando anterior, usa:
     ```bash
     mvnw.cmd spring-boot:run
     ```

4. **Acceder a la aplicación**:
   Una vez que la aplicación esté en ejecución, puedes acceder a ella a través de tu navegador en la siguiente URL:
   ```
   http://localhost:8080
   ```

## Configuración adicional

### Propiedades de la aplicación
El archivo de configuración de la aplicación está ubicado en `src/main/resources/application.properties`. Aquí puedes definir configuraciones adicionales como el puerto, la base de datos, etc.

### Compilación del proyecto
Si deseas compilar el proyecto y generar un archivo `.jar` ejecutable, utiliza el siguiente comando:
```bash
./mvnw clean package
```

El archivo `.jar` generado estará en el directorio `target/`.

## Tecnologías utilizadas

- **Java 8+**
- **Spring Boot**
- **Maven**

## Problemas comunes

1. **El puerto 8080 está en uso**:
   Si el puerto 8080 ya está siendo utilizado por otro servicio en tu máquina, puedes cambiar el puerto predeterminado en el archivo `application.properties`:
   ```properties
   server.port=8081
   ```

2. **Errores de dependencia**:
   Si encuentras problemas relacionados con dependencias, intenta limpiar y volver a compilar el proyecto:
   ```bash
   ./mvnw clean install
   ```

## Contacto

Si tienes alguna pregunta o problema con el proyecto, no dudes en ponerte en contacto con el autor.
