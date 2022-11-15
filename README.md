# :cinema: Cinema :cinema:

## :key:  About
Cinema is a simple API implemented with Hibernate and Spring that allows you to register, select a movie session or book a ticket, view attendance history if you are a user, an administrator can create a movie session and more.

## :mag:  Details

The user can register, add a ticket to the cart, buy a ticket and get information about the session. 
Users have the opportunity to see what films are shown in a particular cinema, with the ability to view 
descriptions of films and descriptions of cinema halls.

Admins have the opportunity to add a cinema halls, a movie and a movie session. Can view user information. 

## :scroll:  Project Structure

In this project used the n-tier architecture

- DAO tier - allows to modify data in database using CRUD methods
- Service tier - this is where all the logic happens
- Controller tier - provides an interface to interact with application

#### __All visitors can:__

- __GET__
  - log in `GET: /login`
  - logout `GET: /logout`
- __POST__
  - register `POST: /register` 


#### __ADMIN can:__

- __GET:__
  - user by __email__ `GET: /users/by-email`
  - movies `GET: /movies`
  - cinema halls `GET: /cinema-halls`
  - available movie sessions `GET: /movie-sessions/available`
  - certain movie session `GET: /movie-sessions/{id}`
- __POST:__
    - movies `POST: /movies`
    - cinema halls `POST: /cinema-halls`
    - movie sessions `POST: /movie-sessions`
- __PUT:__
    - certain movie session `PUT: /movie-sessions/{id}`
- __DELETE:__
    - certain movie session `DELETE: /movie-sessions/{id}`

#### __USER can:__

- __GET:__
  - orders `GET: /orders`
  - cinema halls `GET: /cinema-halls`
  - movies `GET: /movies`
  - available movie sessions `GET: /movie-sessions/available`
  - certain movie session `GET: /movie-sessions/{id}`
  - shopping carts by user `GET: /shopping-carts/by-user`
- __POST:__
  - orders `POST: /orders/complete`
- __PUT:__
  - tickets to shopping cart for some movie session `PUT: /shopping-carts/movie-sessions`

## :hammer_and_wrench:  Technologies

 - Relational Database Server
 - Elastic Beanstalk
 - MySQL 8.0.30
 - Apache Maven 3.8.5
 - Java 11
 - Hibernate
 - Spring Core
 - Spring ORM
 - Spring Web MVC
 - Spring Security
 - Apache TomCat 9.0.50
 
 ## :gear:  How to launch
 
 - click on the [link](http://cinemaapp.eba-2di7gr42.eu-north-1.elasticbeanstalk.com/login)
 
 ## :rocket: Future
 
 - upgrade from Spring to Spring Boot
 - add Logger
 - add Spring testing
 - add user registration page
 
