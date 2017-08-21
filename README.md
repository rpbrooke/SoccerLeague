# An exercise in developing a Java Spring Boot Application with Hibernate and AngularJS

The project's goal was to better understand Spring, JPA, Hibernate and AngularJS and how they could be brought together to develop to deliver an interactive website backed by a REST Web Service that connects with a database.

While Hibernate is the chosen Object-relational Mapping tool for this project, the design is to localize
its usage to only a Spring java configuration file for creating the SessionFactory using Hibernate's LocalSessionFactoryBean.
This enables more flexible swapping with other JPA implementations.

Currently the project utilizes the H2 embedded database. A plan for the future will be to implement other database structures.
