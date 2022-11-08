# syllabus-webservice
## Installation
### Maven
We use Maven as project manager. You can check our pom.xml file for all the used dependecies and project specificities.
### Database 
You have to create a "Secret" class in the main, along the "Database" class : 
```
package com.SoftwareQuality.Projet_syllabus;

public class Secret {
    public String host = "yourHost";
    public String user = "yourUsername";
    public String  password = "yourPassword";

}
```
This is needed to connect to our MySQL database.
You can import [this file](https://github.com/smarbal/syllabus-webservice/blob/main/MySQL.sql) in MySQL Workbench to have our database structure. 
## Functionnalities
This web service allows a user to see documents related to a specific course. The user can order the documents that he wants and it is possible to export all the orders that have been made. There's also the possiblity to add new documents to a course. 

## Useful links:
* https://lucid.app/lucidchart/b340a24a-37cf-4438-8019-bbbfcdea4bd4/edit?invitationId=inv_2f86983e-661c-4173-9de0-0e0f5a16852e&page=0_0#
* https://trello.com/b/9YV8Py7a/projet-archi-quality
* https://teams.microsoft.com/l/team/19%3aX_AucsPKZOsWvLGkeYJAFcYlgdmhqqGO2Km4G0X6W5U1%40thread.tacv2/conversations?groupId=3cccb804-cdc0-4938-95c6-488bca987dcc&tenantId=e3d6f09e-9ba9-4a36-ad75-d9039be4fe29



#### Year 2022-2023 

#### A software architecture project

## **Project participants:**

- Kuijpers Nick 20324
- Baudoin Loisseau 19593
- Quentin Jadoul 18155
- Theo Engels 195367

## **Introduction**

As part of the software architecture course, we were asked to continue the development of the syllabus micro-service started by students last year.
We used the "agile" method and divided our project in different sprints.

## 1. User stories

###  1.1. Sprint 1 
- As a user, I want to be able to see the documents related to a course.
- As a user, I want to be able to add documents into my basket to order later.
- As a user, I want to be able to access my basket.
- As a user, I want to be able to delete elements from my basket.
- As a user, I want to be able to order all the elements in my basket.
- As a user, I want to be able to add new documents to a course.

###  1.2. Sprint 2  

###  1.3. Sprint 3  

###  1.4. Backlog 

## 2. Classes   

The Model classes of the MVC pattern are the following :
 
## 3. Diagrams and mock-ups  
-  
## 4. Links  
-  
## 5. Releases  

## 6. Continue the project  

### 6.1. Setup your project   

### 6.2. How to modify   

### 6.3. How to implement APIs 

### 6.4. Suggested improvements
 







