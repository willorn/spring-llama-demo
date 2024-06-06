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

### 4. 构建项目
在项目根目录下运行以下命令：
```sh
mvn clean install
```

### 5. 运行项目
使用以下命令启动 Spring Boot 应用：
```sh
mvn spring-boot:run
```

### 6. 访问应用
打开浏览器，访问 `http://localhost:15001` 查看应用是否启动成功。

## 结语
按照上述步骤，您可以在 Windows 环境下成功搭建并运行 Spring AI 项目。如果遇到任何问题，请查阅相关文档或寻求社区帮助。
