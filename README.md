# Maven Exploration

This repository is designed to explore and demonstrate the key features of Maven, the popular build automation tool used primarily for Java projects. The repository is structured as a multi-module Maven project and includes several key concepts of Maven, such as dependencies management, multi-module builds, plugin configuration, and build lifecycles.

---
## Repository Structure

Here's a sample README.md file to accompany your Maven exploration repository. This will provide an overview of the repository structure, its purpose, and how to get started with Maven in this context.

---

# Maven Exploration

This repository is designed to explore and demonstrate the key features of Maven, the popular build automation tool used primarily for Java projects. The repository is structured as a multi-module Maven project and includes several key concepts of Maven, such as dependencies management, multi-module builds, plugin configuration, and build lifecycles.

---

## Repository Structure
```text
maven-exploration
│
├── pom.xml                           # Root POM file (parent POM)
├── core                               # Core module (to demonstrate module structure)
│   ├── pom.xml                       # Module-specific POM (inherits from parent POM)
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── CoreApp.java   # Core module source file
│   │   │   ├── resources
│   │   │   │   └── application.properties # Example resource file
│   ├── target
│
├── webapp                              # Web module (to demonstrate multi-module build)
│   ├── pom.xml                       # Web-specific POM (inherits from parent POM)
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── WebApp.java   # Web module source file
│   │   │   ├── resources
│   │   │   │   └── web.xml              # Web-specific resource file
│   │   │   └── webapp
│   │   │       └── index.jsp           # Web page (JSP)
│   ├── target
│
├── utils                              # Utility module (to demonstrate dependency management)
│   ├── pom.xml                       # Utility-specific POM
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── example
│   │   │   │           └── Utils.java   # Utility class
│   │   │   └── resources
│   │   │       └── util-config.properties
│   ├── target
│
├── reports                            # Reports module (to explore plugins)
│   ├── pom.xml                       # Plugin-specific POM (to configure reporting plugins)
│   ├── src
│   │   └── main
│   │       └── resources
│   │           └── report-template.xml  # Report template for plugins
│   ├── target
│
├── .gitignore                        # To ignore build outputs and IDE files
└── README.md                         # Explanation of the repository structure and Maven features

```
---

## Key Features

This repository demonstrates the following key Maven features:

1. **Multi-Module Projects**:
    - The project consists of multiple modules (`core`, `webapp`, `utils`, `reports`). These modules can be built independently or together as part of a larger project.
    - The `pom.xml` files in each module inherit from the root `pom.xml`, which allows for shared configurations and dependency management.

2. **Dependencies Management**:
    - Dependencies between modules are managed via Maven's dependency management system. For instance, the `webapp` module may depend on the `core` and `utils` modules.
    - External dependencies (e.g., libraries, frameworks) can also be added in the `pom.xml` files.

3. **Build Lifecycle**:
    - Maven follows a defined build lifecycle (`clean`, `validate`, `compile`, `test`, `package`, `install`, `deploy`).
    - The `mvn clean install` command is used to execute the full build lifecycle, generating artifacts (e.g., `.jar`, `.war`) in the `/target/` directory.

4. **Plugin Configuration**:
    - The `pom.xml` files also demonstrate how to configure various plugins such as the `maven-compiler-plugin`, `maven-surefire-plugin`, `maven-jar-plugin`, and `maven-war-plugin` to customize the build process.
    - A `reports` module has been included to demonstrate how Maven integrates with reporting plugins like `maven-site-plugin`.

5. **Profiles**:
    - Different profiles can be created in the `pom.xml` files to manage configurations for different environments (e.g., development, testing, production).
    - Example: `mvn install -Pdev` can activate a development profile to use specific configurations for development environments.

6. **Testing Integration**:
    - The `utils` module includes unit tests using the `maven-surefire-plugin` to demonstrate how Maven runs tests during the build lifecycle.

7. **Resource Management**:
    - Static resources (e.g., `web.xml`, `index.jsp`, configuration files) are managed in the `src/main/resources` or `src/main/webapp` directories.

8. **Version Management**:
    - By managing versions in the pom.xml files, you can see how Maven handles dependency resolution, including transitive dependencies.

---

## Getting Started

### Prerequisites

To get started with this project, you'll need the following:

- Java 8 or higher
- Maven (you can download it from [Maven's official website](https://maven.apache.org/))
- An IDE (optional, but recommended): IntelliJ IDEA, Eclipse, or Visual Studio Code

### Clone the Repository

To clone this repository, run the following command:

```bash
git clone https://github.com/rvguradiya/maven-exploration.git
cd maven-exploration
```
### Build the Project

To build the entire project, run the following Maven command from the root of the repository:
```bash
mvn clean install
```
This will:
1. Clean the target/ directory.
2. Compile the project.
3. Run tests (if any).
4. Package the modules into their respective artifacts (.jar, .war, etc.).
5. Install the artifacts into the local Maven repository.

### Running the Project

Once the build is complete, you can find the generated artifacts in the target/ directories of each module.

For example, the core module might generate a .jar file, while the web module might generate a .war file (depending on the project's structure and configuration).

### Customizing the Build

You can modify the `pom.xml` files to add your own dependencies, plugins, and configurations. Maven's extensive plugin ecosystem makes it easy to integrate with other tools like testing frameworks, CI/CD, code coverage tools, and more.

### Explore Maven Profiles

You can explore different Maven profiles by activating them during the build. For example:
```bash
mvn clean install -Pdev
```
This will use the `dev` profile if it's defined in the `pom.xml` files.

---

## Contributing

Feel free to fork this repository, submit issues, or open pull requests to enhance the exploration of Maven's features.

---

## License

This project is licensed under the [MIT License](LICENSE) - see the LICENSE file for details.

---

### Explanation:
- **Repository Structure**: The file describes the layout of the project and its modules (`core`, `webapp`, `utils`, `reports`).
- **Key Features**: This section outlines the main Maven concepts demonstrated in the repository, such as multi-module builds, dependency management, plugin configuration, and build lifecycle.
- **Getting Started**: Instructions for setting up and building the project, including prerequisites, how to clone the repo, and how to use Maven commands.
- **Running the Project**: After building, this section explains where to find the built artifacts.
- **Customizing the Build**: Encourages users to explore modifying the `pom.xml` to suit their needs.
- **Contributing**: Lets others know they can contribute if they want to improve the repository or explore additional Maven features.

This `README.md` will serve as a clear guide for anyone exploring this repository or learning about Maven's key features.


