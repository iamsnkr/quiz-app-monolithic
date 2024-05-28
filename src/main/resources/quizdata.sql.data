show variables where Variable_name='lower_case_table_names';

DROP database if EXISTS quizdata;

CREATE database quizdata COLLATE = utf8mb3_general_ci;

USE quizdata;

drop table if exists question;
CREATE TABLE question (
  id INT PRIMARY KEY AUTO_INCREMENT,
  category VARCHAR(20) NOT NULL,
  difficulty VARCHAR(20) NOT NULL,
  question VARCHAR(255) NOT NULL,
  option1 VARCHAR(255) NOT NULL,
  option2 VARCHAR(255) NOT NULL,
  option3 VARCHAR(255) NOT NULL,
  option4 VARCHAR(255) NOT NULL,
  answer VARCHAR(255) NOT NULL
);


-- Easy Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Easy', 'What is the data type for storing a single character in Java?', 'int', 'char', 'float', 'String', 'char'),
       ('Java', 'Easy', 'Which keyword is used to create a loop that repeats until a condition is met?', 'for', 'while', 'do-while', 'if', 'while');

-- Medium Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Medium', 'How do you access elements in an array in Java?', 'Using direct variable names', 'Using index starting from 1', 'Using index starting from 0', 'Using a loop without an index', 'Using index starting from 0'),
       ('Java', 'Medium', 'What is the difference between final and finally keywords in Java?', 'Both are used for error handling.', 'final declares a constant variable, finally ensures a block of code executes.', 'Both are used for loop control.', 'There is no difference.', 'final declares a constant variable, finally ensures a block of code executes.');

-- Hard Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Hard', 'Which is the correct way to override a method in a subclass?', 'By having the same method signature and adding the final keyword.', 'By having the same method signature and adding the static keyword.', 'By having the same method signature but with a different return type.', 'By having the same method signature but with different access modifiers.', 'By having the same method signature but with a different access modifiers.');

-- Easy Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Easy', 'What is the operator used for string concatenation in Python?', '+', '-', '*', '/', '+'),
       ('Python', 'Easy', 'Which of the following is the correct way to define a function in Python?', 'function_name(arguments) { ... }', 'define function_name(arguments): ...', 'def function_name(arguments): ...', 'func name(arguments) = ...', 'def function_name(arguments): ...');

-- Medium Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Medium', 'What is the correct way to iterate through a list in Python?', 'Using a for loop with the index', 'Using a while loop with the index', 'Using a for loop with the element itself', 'There is no built-in way to iterate in Python.', 'Using a for loop with the element itself');

-- Hard Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Hard', 'What is the difference between a list and a tuple in Python?', 'Lists can hold different data types, tuples cannot.', 'Tuples can hold different data types, lists cannot.', 'Lists are used for mathematical operations, tuples for storing data.', 'There is no difference.', 'Lists can be modified, tuples cannot.');


-- Easy Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Easy', 'What is the keyword used to declare a class in Java?', 'class', 'function', 'define', 'object', 'class'),
       ('Java', 'Easy', 'How do you comment a single line in Java?', '// comment', '/* comment */', '# comment', '; comment', '// comment');

-- Medium Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Medium', 'Which access modifier allows access from the same class and subclasses?', 'public', 'private', 'protected', 'default', 'protected'),
       ('Java', 'Medium', 'What is the wrapper class for the primitive data type int in Java?', 'Integer', 'Int', 'intWrapper', 'None of the above', 'Integer');

-- Hard Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Hard', 'What is the difference between an interface and an abstract class in Java?', 'Both define contracts but interfaces cannot have implementations.', 'Interfaces only define abstract methods, abstract classes can have both abstract and concrete methods.', 'There is no difference.', 'Interfaces can have static methods, abstract classes cannot.', 'Interfaces only define abstract methods, abstract classes can have both abstract and concrete methods.');

-- Easy Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Easy', 'How do you print a string in Python?', 'print("string")', 'echo("string")', 'display("string")', 'cout("string")', 'print("string")'),
       ('Python', 'Easy', 'What is used to indent code blocks in Python?', 'Tabs', 'Spaces (consistent number)', 'Semicolons', 'Curly braces', 'Spaces (consistent number)');

-- Medium Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Medium', 'What is the purpose of a break statement in a loop?', 'Continues to the next iteration', 'Exits the loop completely', 'Skips the current iteration', 'Restarts the loop from the beginning', 'Exits the loop completely');

-- Easy Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Easy', 'What is the data type for storing a single floating-point number in Java?', 'float', 'double', 'decimal', 'numeric', 'float'),
       ('Java', 'Easy', 'How do you declare a variable in Java?', 'variable_name = value', 'var name = value', 'int name (value)', 'None of the above', 'variable_name = value');

-- Medium Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Medium', 'What is the keyword used to define a method that can throw an exception?', 'throws', 'throw', 'except', 'try', 'throws'),
       ('Java', 'Medium', 'What is the difference between primitive data types and reference data types in Java?', 'Primitive data types store actual values, reference data types store memory addresses.', 'Primitive data types are passed by value, reference data types are passed by reference.', 'Both are the same.', 'Primitive data types can be modified, reference data types cannot.', 'Both are the same.');

-- Hard Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Hard', 'What is garbage collection in Java?', 'Automatic memory management process', 'Manual memory deallocation by programmer', 'Process of collecting unused objects', 'A method for optimizing code execution', 'Automatic memory management process');

-- Easy Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Easy', 'How do you assign a value to a variable in Python?', 'name = value', 'var name value', 'define name value', 'None of the above', 'name = value'),
       ('Python', 'Easy', 'What does a colon (:) at the end of a line in Python indicate?', 'Indentation block', 'Comment', 'Line continuation', 'Error', 'Indentation block');

-- Medium Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Medium', 'What is the difference between a list and a dictionary in Python?', 'Lists are ordered sequences, dictionaries are unordered collections of key-value pairs.', 'Lists can hold different data types, dictionaries cannot.', 'Lists are used for mathematical operations, dictionaries for storing data.', 'There is no difference.', 'Lists are ordered sequences, dictionaries are unordered collections of key-value pairs.');

-- Easy Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Easy', 'What is the default value of a boolean variable in Java?', 'true', 'false', 'null', 'undefined', 'false'),
       ('Java', 'Easy', 'How do you access elements in a String object in Java?', 'String[index]', '.get(index)', 'using index directly', 'elementName', 'using index directly');

-- Medium Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Medium', 'What is the purpose of the `static` keyword in Java?', 'Declares a class-level variable or method', 'Increases performance', 'Allows access from other classes without creating an object', 'All of the above', 'All of the above'),
       ('Java', 'Medium', 'What is the difference between an overloaded method and an overridden method in Java?', 'Overloaded methods have the same name but different parameter lists, overridden methods have the same signature in subclass and superclass.', 'Overloaded methods have the same return type, overridden methods can have different return types.', 'There is no difference.', 'Overloaded methods are defined in the same class, overridden methods are defined in subclass and superclass.', 'Overloaded methods have the same signature in the same class, overridden methods have the same signature in subclass and superclass.');

-- Hard Java question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Java', 'Hard', 'What is the difference between inheritance and polymorphism in Java?', 'Inheritance allows code reuse, polymorphism allows objects of different classes to respond to the same method call.', 'Inheritance defines an "is-a" relationship, polymorphism defines a "has-a" relationship.', 'Both are the same.', 'Inheritance is static, polymorphism is dynamic.', 'Inheritance allows code reuse, polymorphism allows objects of different classes to respond to the same method call.');

-- Easy Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Easy', 'How do you check if a variable is empty in Python?', 'if variable is None:', 'if variable == "":', 'if not variable:', 'if len(variable) == 0:', 'if variable == "":'),
       ('Python', 'Easy', 'What does the `in` keyword do in Python?', 'Checks if a value exists within a sequence (list, tuple, string)', 'Compares two values for equality', 'Assigns a value to a variable', 'Negates a boolean value', 'Checks if a value exists within a sequence (list, tuple, string)');

-- Medium Python question
INSERT INTO question (category, difficulty, question, option1, option2, option3, option4, answer)
VALUES ('Python', 'Medium', 'What is the purpose of a list comprehension in Python?', 'Concise way to create a new list based on an existing iterable', 'Iterates through a list and performs an action on each element', 'Sorts a list in ascending order', 'Reverses the order of elements in a list', 'Concise way to create a new list based on an existing iterable');


