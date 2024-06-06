# Spring AI 项目搭建指南

## 项目简介
这是一个基于 Spring Boot 框架的项目，旨在集成和适配 OpenAI 和 Ollama 模型接口。通过本指南，您将了解如何在 Windows 环境中搭建和运行此项目。

## 环境要求
- Windows 操作系统
- Java 21
- Maven 3.6 及以上版本

## 安装步骤

### 1. 安装 Java Development Kit (JDK)
1. 下载 [Java Development Kit (JDK) 21](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html)。
2. 安装 JDK 并配置环境变量：
   - 设置 `JAVA_HOME` 为 JDK 的安装路径。
   - 在 `PATH` 变量中添加 `%JAVA_HOME%\bin`。

### 2. 安装 Apache Maven
1. 下载 [Maven](https://maven.apache.org/download.cgi)。
2. 解压下载的文件到某个目录，例如 `C:\Program Files\Apache\maven`。
3. 配置环境变量：
   - 设置 `MAVEN_HOME` 为 Maven 的安装路径。
   - 在 `PATH` 变量中添加 `%MAVEN_HOME%\bin`。
4. 打开命令提示符，输入 `mvn -v` 以验证 Maven 是否安装成功。

### 3. 克隆项目代码
在命令提示符或 Git Bash 中运行以下命令：
```sh
git clone https://github.com/willorn/spring-llama-demo
cd spring-llama-demo
```

### 4. 配置项目
确保 `pom.xml` 文件内容如下：

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.3.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.example</groupId>
    <artifactId>spring-ai</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>spring-ai</name>
    <description>spring-ai</description>
    <properties>
        <java.version>21</java.version>
        <spring-ai.version>1.0.0-M1</spring-ai.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <!--适配 openai 接口-->
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-openai-spring-boot-starter</artifactId>
        </dependency>
        <!--适配 ollama 模型接口 -->
        <dependency>
            <groupId>org.springframework.ai</groupId>
            <artifactId>spring-ai-ollama-spring-boot-starter</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    <dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.ai</groupId>
                <artifactId>spring-ai-bom</artifactId>
                <version>${spring-ai.version}</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    <repositories>
        <repository>
            <id>spring-milestones</id>
            <name>Spring Milestones</name>
            <url>https://repo.spring.io/milestone</url>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
        <repository>
            <id>spring-snapshots</id>
            <name>Spring Snapshots</name>
            <url>https://repo.spring.io/snapshot</url>
            <releases>
                <enabled>false</enabled>
            </releases>
        </repository>
    </repositories>
</project>
```

### 5. 构建项目
在项目根目录下运行以下命令：
```sh
mvn clean install
```

### 6. 运行项目
使用以下命令启动 Spring Boot 应用：
```sh
mvn spring-boot:run
```

### 7. 访问应用
打开浏览器，访问 `http://localhost:8080` 查看应用是否启动成功。

## 项目结构
```plaintext
spring-ai/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── pom.xml
└── README.md
```

## 结语
按照上述步骤，您可以在 Windows 环境下成功搭建并运行 Spring AI 项目。如果遇到任何问题，请查阅相关文档或寻求社区帮助。
