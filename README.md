

# Spring Framework 学习项目

本项目是一个系统性的 Spring 框架学习项目，涵盖了 Spring 框架的核心知识点，包括 Bean 管理、AOP 面向切面编程、注解开发、XML 配置、Spring Boot、Spring MVC 以及事务管理等核心技术。

## 项目结构

项目采用多模块 Maven 结构，每个模块独立对应一个 Spring 核心技术点，便于逐个学习和实践。

```
spring/
├── Bean_factory/          # Spring Bean 工厂与生命周期
├── proxy/                 # Spring AOP 代理机制
├── spring_annotion/       # Spring 注解开发
├── spring_buildpacking/   # 手写 Spring IOC 容器
├── spring_xml/            # Spring XML 配置方式
├── springboot/            # Spring Boot 基础与高级
├── springmvc/             # Spring MVC Web 开发
└── transaction/           # Spring 事务管理
```

## 模块说明

### 1. Bean_factory - Bean 工厂与生命周期

学习 Spring Bean 的创建、管理与生命周期控制。

**核心内容：**
- **FactoryBean**: 通过 `FactoryBean` 接口自定义 Bean 创建逻辑
- **Bean 生命周期**: 初始化方法与销毁方法的实现（`InitializingBean`、`DisposableBean`）
- **Bean 后置处理器**: `BeanPostProcessor` 接口的应用
- **Bean 名称感知**: `BeanNameAware`、`BeanFactoryAware` 接口
- **相互依赖**: 解决 Bean 之间的循环依赖问题

**主要类：**
- `StuFactory`: 实现 `FactoryBean<Date>` 自定义日期Bean创建
- `Lifecycle`: 演示完整的 Bean 生命周期回调
- `Logbean`: 实现 `BeanPostProcessor` 进行 Bean 后置处理
- `One`/`Two`: 演示相互依赖场景

### 2. proxy - AOP 代理机制

深入理解 Spring AOP 的两种代理实现方式。

**核心内容：**
- **JDK 动态代理**: 基于接口的代理实现
- **CGLIB 代理**: 基于继承的代理实现
- **AspectJ 切面**: 使用注解配置切面（`@Aspect`、`@Before`、`@After`、`@Around`等）

**主要类：**
- `JDKProxy`: JDK 动态代理实现
- `CGLIBProxy`: CGLIB 代理实现
- `Useproxy`: 基于 AspectJ 的切面配置

### 3. spring_annotion - 注解开发

使用纯注解方式配置 Spring Bean 和依赖注入。

**核心内容：**
- **@Configuration 与 @ComponentScan**: 配置类与组件扫描
- **@Scope**: Bean 作用域（singleton、prototype）
- **@Value**: 属性值注入（支持 SpEL 表达式）
- **@Autowired 与 @Qualifier**: 依赖注入与精确匹配
- **@Resource**: Java 标准注解注入
- **@ConfigurationProperties**: 配置属性绑定

**主要类：**
- `Stu`: 演示 `@Value` 注解的多种使用方式
- `One`: 演示 `@Autowired` 与 `@Qualifier` 配合使用
- `Two`: 演示 `@Resource` 注解使用

### 4. spring_buildpacking - 手写 IOC 容器

从零实现一个简单的 Spring IOC 容器，深入理解 Spring 原理。

**核心内容：**
- **XML 配置解析**: 读取并解析 Spring 配置文件
- **Bean 实例化**: 根据配置创建 Bean 对象
- **依赖注入**: 完成 Bean 之间的属性注入
- **类型转换**: 基本类型值的自动转换

**主要类：**
- `ClassPathXmlAppplicationContext`: 自定义 IOC 容器实现

### 5. spring_xml - XML 配置方式

使用传统 XML 方式配置 Spring Bean。

**核心内容：**
- **setter 注入**: 通过 `<property>` 配置属性
- **构造器注入**: 通过 `<constructor-arg>` 配置构造参数
- **基本类型注入**: 字符串、整数等基本类型
- **数组与集合**: List、Set、Map、Properties 配置
- **p 命名空间**: 简化属性配置

**主要类：**
- `SettingList`: 演示数组配置
- `Arraypro`: 演示 List、Set、Map 配置
- `JDBC`: 演示 Properties 配置

### 6. springboot - Spring Boot 基础与高级

学习 Spring Boot 的核心功能与常用配置。

**核心内容：**
- **@SpringBootApplication**: Spring Boot 启动注解
- **@ConfigurationProperties**: YAML/Properties 配置绑定
- **@PropertySource**: 外部配置文件加载
- **Lombok**: 简化 POJO 类编写
- **AOP**: Spring Boot 中的 AOP 配置
- **Web 开发**: 模板引擎、静态资源、异常处理

**主要模块：**
- `bean`: 配置属性注入示例
- `lombok`: Lombok 注解使用演示
- `aop`: Spring Boot AOP 配置
- `web`: Web 开发示例（Controller、异常处理）
- `controller/jaskon`: Jackson JSON 处理

### 7. springmvc - Spring MVC Web 开发

完整的 Spring MVC Web 开发示例。

**核心内容：**
- **Controller**: 控制器开发
- **请求映射**: `@RequestMapping`、`@GetMapping`、`@PostMapping`
- **RESTful**: RESTful 风格接口设计
- **请求参数**: `@RequestParam`、`@PathVariable`、`@RequestBody`
- **模型数据**: Model、ModelMap、ModelAndView
- **Session**: `@SessionAttributes` 会话管理
- **拦截器**: `HandlerInterceptor` 接口实现
- **异常处理**: `@ControllerAdvice` 全局异常处理
- **文件上传/下载**: MultipartFile、ResponseEntity
- **JSON 处理**: AJAX 请求与响应

**主要模块：**
- `request`: 请求映射、转发、重定向
- `model`: 模型数据传递
- `json`: JSON 数据处理
- `file`: 文件操作
- `ExceptionHandler`: 异常处理
- `HandlerInterceptor`: 拦截器

### 8. transaction - Spring 事务管理

学习 Spring 声明式事务与编程式事务。

**核心内容：**
- **@EnableTransactionManagement**: 开启事务管理
- **@Transactional**: 声明式事务配置
- **事务回滚**: `rollbackFor` 指定回滚异常类型
- **DataSourceTransactionManager**: 事务管理器配置

**主要类：**
- `Config`: 事务配置类
- `DrawMoney`: 事务方法实现

## 环境要求

- JDK 1.8 或更高版本
- Maven 3.0+
- Spring Framework 5.x
- Spring Boot 2.x

## 快速开始

### 1. 构建项目

在项目根目录执行：

```bash
mvn clean install
```

### 2. 运行示例

各模块均包含测试类，可以单独运行：

```bash
# 运行 Bean_factory 模块测试
cd Bean_factory
mvn test

# 运行 Spring Boot 应用
cd springboot
mvn spring-boot:run
```

### 3. IDE 导入

推荐使用 IntelliJ IDEA 或 Eclipse 导入 Maven 项目：

1. 打开 IDE，选择 `Import Project`
2. 选择项目根目录下的 `pom.xml`
3. 选择 `Import as Maven Project`
4. 等待 Maven 依赖下载完成

## 学习建议

1. **循序渐进**: 建议按照模块顺序学习，从 `spring_xml` 基础配置开始
2. **动手实践**: 每个模块都包含测试代码，建议修改参数观察结果
3. **对比学习**: 对比 XML 配置与注解配置的区别
4. **源码阅读**: 结合 Spring 官方源码深入理解原理

## 许可证

本项目仅供学习交流使用。