# SoccerLeague
Java Spring Hibernate H2 Project

This project was developed with the intent of better understanding Spring, JPA, and AngularJS.

While Hibernate is the chosen Object-relational Mapping tool for this project, the design is localize
its usage to a Spring java configuration file for creating the SessionFactory using Hibernate's LocalSessionFactoryBean.
This enables more flexible swapping with other JPA implementations.

Currently the project utilizes the H2 embedded database. A plan for the future will be to implement other database structures.
