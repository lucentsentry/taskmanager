# Task Manager

Open this folder in IntelliJ IDEA using File > Open and select pom.xml. When prompted, trust the project and load it as a Maven project. Set the Project SDK to your installed Java 21 JDK (File > Project Structure > Project). Wait for Maven to download dependencies, then run TaskmanagerApplication. Visit http://localhost:8080/.

Add, edit and delete tasks from the list. H2 stores data in the data folder relative to the working directory. For the H2 console visit http://localhost:8080/h2-console and enter JDBC URL jdbc:h2:file:./data/taskdb, username sa, and leave the password blank. Stop the application using IntelliJ's Stop button.
