# Library Management System

This project is a Java-based implementation of a Library Management System. It includes functionalities for managing users (members and librarians) and books, and incorporates various design patterns for efficient and maintainable code.

## Functionality

### Users Management
- **User Types**: Supports two types of users: Members and Librarians.
- **User Creation**: Users are created using a `UserFactory` which implements the Factory pattern.
- **User Management**: Allows adding users and displays all existing users.

### Books Management
- **Book Management**: Uses a Singleton pattern for managing a collection of books (`BookManagement`).
- **Book Operations**: Supports adding and removing books, and displays all books.
- **Book Transactions**: Includes functionalities for issuing and returning books.

## Design Patterns Used

### Factory Pattern
- **Purpose**: Used to create instances of different types of users (`Member` and `Librarian`) through a central `UserFactory`.

### Singleton Pattern
- **Purpose**: Ensures there is only one instance of `BookManagement` which manages the collection of books throughout the application.

### Observer Pattern
- **Purpose**: Implemented to notify all users (members and librarians) whenever a new book is added to the library.

## Project Structure
library-management-system/
├── src/
│ ├── book_storage/
│ │ ├── Book.java
│ │ ├── BookManagement.java
│ │ ├── Observer.java
│ │ ├── Subject.java
│ ├── library_management_system/
│ │ ├── Librarian.java
│ │ ├── Main.java
│ │ ├── Member.java
│ │ ├── User.java
│ │ ├── UserFactory.java
│ │ ├── UserManagement.java
├── build.gradle
├── settings.gradle

