# 🔧 Autoconfiguration

Autoconfiguration is one of Spring Boot’s core features. It tries to automatically configure your Spring application based on the dependencies present in the classpath and the beans you define.

How it works:
Spring Boot uses @EnableAutoConfiguration (usually through @SpringBootApplication) to enable auto-configuration.

For example, if spring-boot-starter-data-jpa is on the classpath, Spring Boot will:

Configure a DataSource.

Set up JPA entity manager and repositories automatically.

Benefits:
No need to write boilerplate configuration.

Sensible defaults help you get started quickly.

You can override or customize any part with your own config.

# 📦 Starters
Starters are pre-configured Maven/Gradle dependencies that you can include in your project to bring in a set of related libraries and configurations.

Examples:
spring-boot-starter-web: Includes Spring MVC, Jackson, and an embedded Tomcat server.

spring-boot-starter-data-jpa: Includes Spring Data JPA, Hibernate, and a database connector.

spring-boot-starter-security: Includes Spring Security with sensible defaults.

Benefits:
Simplifies dependency management.

Reduces setup time by bundling related dependencies together.

Consistent and curated by the Spring Boot team.

# 📊 Actuator
Spring Boot Actuator provides production-ready features to help you monitor and manage your application.

Features:
Built-in endpoints to expose application health, metrics, info, beans, environment, etc.

Common endpoints:

/actuator/health – Application health status

/actuator/metrics – Metrics like memory, CPU, HTTP requests

/actuator/env – Environment properties

/actuator/beans – Loaded Spring beans

Configuration:
Add spring-boot-starter-actuator to your project.

Customize endpoints via application.properties or application.yml.

Security:
Endpoints can be secured or exposed selectively (e.g., only /health and /info for public access).
