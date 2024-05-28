**Features**

Create quizzes with specified category, number of questions, and title.
Add, update, and delete individual questions.
Retrieve details of all questions.
Get a specific quiz by its ID.
Submit a quiz with answers.

**API Endpoints**

**##Adding Questions**
```
POST http://localhost:8080/quiz/add
Use this endpoint to add a new question to the system.
```
**Deleting Questions**

DELETE http://localhost:8080/quiz/delete/{question_id}
Replace {question_id} with the unique identifier of the question you want to delete.
Getting All Questions

GET http://localhost:8080/quiz/all-questions
This endpoint retrieves information about all the questions in the system.
Updating Questions

PUT http://localhost:8080/quiz/update/{question_id}
Replace {question_id} with the unique identifier of the question you want to update. (details on specific data format required for updates are to be specified based on the actual implementation)
Creating a Quiz

GET http://localhost:8080/quiz/create?category={Java|Python}&{numberofQuestions}=5&title={title}
Replace the placeholders with your desired values:
{category}: Choose either "Java" or "Python" for the quiz category.
{numberofQuestions}: Specify the number of questions (e.g., 5).
{title}: Set a title for your quiz.
Getting a Quiz by ID

GET http://localhost:8080/quiz/get/{quiz_id}
Replace {quiz_id} with the unique identifier of the quiz you want to retrieve.
Submitting a Quiz

POST http://localhost:8080/quiz/submit/{quiz_id}
Replace {quiz_id} with the unique identifier of the quiz you are submitting. (details on specific data format required for submitting answers are to be specified based on the actual implementation)
Additional Notes

Refer to the application documentation (if available) for specific details on data formats required for requests and responses.
Authentication might be required for some endpoints (depending on the application's security setup).
