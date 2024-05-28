**Features**

Create quizzes with specified category, number of questions, and title.
Add, update, and delete individual questions.
Retrieve details of all questions.
Get a specific quiz by its ID.
Submit a quiz with answers.

**API Endpoints**

**Adding Questions**
```
POST http://localhost:8080/quiz/add
Use this endpoint to add a new question to the system.
```
**Deleting Questions**

```
DELETE http://localhost:8080/quiz/delete/{question_id}
Replace {question_id} with the unique identifier of the question you want to delete.
```
Getting All Questions
```
GET http://localhost:8080/quiz/all-questions
This endpoint retrieves information about all the questions in the system.
```
**Updating Questions**
```
PUT http://localhost:8080/quiz/update/{question_id}
Replace {question_id} with the unique identifier of the question you want to update.
```
**Creating a Quiz**
```
GET http://localhost:8080/quiz/create?category={Java|Python}&{numberofQuestions}=5&title={title}
Replace the placeholders with your desired values:
{category}: Choose either "Java" or "Python" for the quiz category.
{numberofQuestions}: Specify the number of questions (e.g., 5).
{title}: Set a title for your quiz.
```
**Getting a Quiz by ID**
```
GET http://localhost:8080/quiz/get/{quiz_id}
Replace {quiz_id} with the unique identifier of the quiz you want to retrieve.
```
**Submitting a Quiz**
```
POST http://localhost:8080/quiz/submit/{quiz_id}
Replace {quiz_id} with the unique identifier of the quiz you are submitting.
```
**Additional Notes**

Refer to the postman collection ```**Quiz-Rest-API.postman_collection.json**``` for specific details on data formats required for requests and responses.


**Project Setup**
Here's how to run the provided Docker commands to create databases for your Spring Boot REST API project:

**1. MySQL Database:**

This command creates a detached (-d) MySQL container named by default (--name=""). It sets the root password (MYSQL_ROOT_PASSWORD) to "root" and maps the container's port 3309 to the host machine's port 3306 (-p 3309:3306). Additionally, it forces lowercase table names (--lower_case_table_names=1).

Here's how to run the provided Docker commands to create databases for your Spring Boot REST API project:

**Getting Started

This project uses Spring Boot to simplify the initial setup and configuration.**

**1. MySQL Database:**

**Instructions:**

Open a terminal window.
Run the following command
```bash
docker run -d -e MYSQL_ROOT_PASSWORD=root -p 3309:3306 mysql --lower_case_table_names=1
Note: Add some data to MYSQL Database
      using the scripts details mention in the below path
      **src/main/resources/quizdata.sql**
```

**Prerequisites:**

Java 11 or above
Maven or Gradle (build tool)
Running the application

Clone or download the project.

Open a terminal in the project directory.

Run the following command (using Maven as an example):

```
mvn spring-boot:run
The application should start and be accessible by default at http://localhost:8080.
```

