# Spring Framework Learning Project

This project is a systematic learning project for the Spring Framework, covering core Spring technologies including Bean management, AOP (Aspect-Oriented Programming), annotation-based development, XML configuration, Spring Boot, Spring MVC, and transaction management.

## Project Structure

The project adopts a multi-module Maven structure, where each module independently corresponds to a core Spring technology, facilitating step-by-step learning and practice.

```
spring/
├── Bean_factory/          # Spring Bean Factory and Lifecycle
├── proxy/                 # Spring AOP Proxy Mechanism
├── spring_annotion/       # Spring Annotation-Based Development
├── spring_buildpacking/   # Custom Spring IOC Container Implementation
├── spring_xml/            # Spring XML Configuration
├── springboot/            # Spring Boot Basics and Advanced Features
├── springmvc/             # Spring MVC Web Development
└── transaction/           # Spring Transaction Management
```

## Module Descriptions

### 1. Bean_factory - Bean Factory and Lifecycle

Learn about the creation, management, and lifecycle control of Spring Beans.

**Core Content:**
- **FactoryBean**: Customize Bean creation logic via the `FactoryBean` interface
- **Bean Lifecycle**: Implement initialization and destruction methods (`InitializingBean`, `DisposableBean`)
- **Bean Post-Processor**: Apply the `BeanPostProcessor` interface
- **Bean Name Awareness**: Use `BeanNameAware` and `BeanFactoryAware` interfaces
- **Circular Dependencies**: Resolve circular dependency issues between Beans

**Main Classes:**
- `StuFactory`: Implements `FactoryBean<Date>` to customize Date Bean creation
- `Lifecycle`: Demonstrates complete Bean lifecycle callbacks
- `Logbean`: Implements `BeanPostProcessor` for post-processing Beans
- `One`/`Two`: Demonstrate circular dependency scenarios

### 2. proxy - AOP Proxy Mechanism

Deeply understand the two proxy implementation methods in Spring AOP.

**Core Content:**
- **JDK Dynamic Proxy**: Interface-based proxy implementation
- **CGLIB Proxy**: Inheritance-based proxy implementation
- **AspectJ Aspects**: Configure aspects using annotations (`@Aspect`, `@Before`, `@After`, `@Around`, etc.)

**Main Classes:**
- `JDKProxy`: Implementation of JDK dynamic proxy
- `CGLIBProxy`: Implementation of CGLIB proxy
- `Useproxy`: AspectJ-based aspect configuration

### 3. spring_annotion - Annotation-Based Development

Configure Spring Beans and dependency injection using pure annotations.

**Core Content:**
- **@Configuration and @ComponentScan**: Configuration classes and component scanning
- **@Scope**: Bean scope (singleton, prototype)
- **@Value**: Property injection (supports SpEL expressions)
- **@Autowired and @Qualifier**: Dependency injection with precise matching
- **@Resource**: Java standard annotation for injection
- **@ConfigurationProperties**: Configuration property binding

**Main Classes:**
- `Stu`: Demonstrates multiple usage scenarios of `@Value`
- `One`: Demonstrates combined use of `@Autowired` and `@Qualifier`
- `Two`: Demonstrates usage of `@Resource`

### 4. spring_buildpacking - Custom IOC Container

Implement a simple Spring IOC container from scratch to deeply understand Spring's underlying principles.

**Core Content:**
- **XML Configuration Parsing**: Read and parse Spring configuration files
- **Bean Instantiation**: Create Bean objects based on configuration
- **Dependency Injection**: Complete property injection between Beans
- **Type Conversion**: Automatic conversion of primitive types

**Main Class:**
- `ClassPathXmlApplicationContext`: Custom IOC container implementation

### 5. spring_xml - XML Configuration

Configure Spring Beans using traditional XML configuration.

**Core Content:**
- **Setter Injection**: Configure properties via `<property>`
- **Constructor Injection**: Configure constructor arguments via `<constructor-arg>`
- **Primitive Type Injection**: Strings, integers, and other primitive types
- **Arrays and Collections**: Configure List, Set, Map, Properties
- **p-namespace**: Simplify property configuration

**Main Classes:**
- `SettingList`: Demonstrates array configuration
- `Arraypro`: Demonstrates List, Set, Map configuration
- `JDBC`: Demonstrates Properties configuration

### 6. springboot - Spring Boot Basics and Advanced Features

Learn core Spring Boot functionalities and common configurations.

**Core Content:**
- **@SpringBootApplication**: Spring Boot startup annotation
- **@ConfigurationProperties**: YAML/Properties configuration binding
- **@PropertySource**: Load external configuration files
- **Lombok**: Simplify POJO class writing
- **AOP**: AOP configuration in Spring Boot
- **Web Development**: Template engines, static resources, exception handling

**Main Modules:**
- `bean`: Example of configuration property injection
- `lombok`: Demonstration of Lombok annotations
- `aop`: Spring Boot AOP configuration
- `web`: Web development example (Controller, exception handling)
- `controller/jackson`: Jackson JSON processing

### 7. springmvc - Spring MVC Web Development

Complete Spring MVC web development examples.

**Core Content:**
- **Controller**: Controller development
- **Request Mapping**: `@RequestMapping`, `@GetMapping`, `@PostMapping`
- **RESTful**: RESTful-style API design
- **Request Parameters**: `@RequestParam`, `@PathVariable`, `@RequestBody`
- **Model Data**: Model, ModelMap, ModelAndView
- **Session**: `@SessionAttributes` for session management
- **Interceptor**: Implementation of `HandlerInterceptor` interface
- **Exception Handling**: `@ControllerAdvice` for global exception handling
- **File Upload/Download**: MultipartFile, ResponseEntity
- **JSON Processing**: AJAX requests and responses

**Main Modules:**
- `request`: Request mapping, forwarding, redirection
- `model`: Model data transfer
- `json`: JSON data processing
- `file`: File operations
- `ExceptionHandler`: Exception handling
- `HandlerInterceptor`: Interceptor

### 8. transaction - Spring Transaction Management

Learn declarative and programmatic transaction management in Spring.

**Core Content:**
- **@EnableTransactionManagement**: Enable transaction management
- **@Transactional**: Declarative transaction configuration
- **Transaction Rollback**: Specify rollback exceptions using `rollbackFor`
- **DataSourceTransactionManager**: Configure transaction manager

**Main Classes:**
- `Config`: Transaction configuration class
- `DrawMoney`: Implementation of transactional methods

## Environment Requirements

- JDK 1.8 or higher
- Maven 3.0+
- Spring Framework 5.x
- Spring Boot 2.x

## Quick Start

### 1. Build the Project

Execute in the project root directory:

```bash
mvn clean install
```

### 2. Run Examples

Each module includes test classes that can be run individually:

```bash
# Run Bean_factory module tests
cd Bean_factory
mvn test

# Run Spring Boot application
cd springboot
mvn spring-boot:run
```

### 3. Import into IDE

We recommend importing the Maven project into IntelliJ IDEA or Eclipse:

1. Open IDE and select `Import Project`
2. Select the `pom.xml` file in the project root directory
3. Choose `Import as Maven Project`
4. Wait for Maven dependencies to download

## Learning Suggestions

1. **Progressive Learning**: Follow the module order, starting with `spring_xml` for basic configuration
2. **Hands-On Practice**: Each module includes test code; modify parameters and observe results
3. **Comparative Learning**: Compare differences between XML and annotation-based configurations
4. **Source Code Reading**: Deepen understanding by studying Spring’s official source code

## License

This project is intended solely for learning and communication purposes.