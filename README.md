
# Java Serialization Login

A login application built using Java with JDK 11 and Apache ANT, leveraging Java serialization to store login details locally. This project uses Swing for the UI, along with **FlatLaf** for a modern look and feel, and interacts with a MySQL database for user authentication.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Requirements](#requirements)
- [Installation](#installation)
- [Configuration](#configuration)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Code Walkthrough](#code-walkthrough)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project implements a login application where user credentials (username and password) are validated against a MySQL database. It includes the ability to remember login details by saving them locally using serialization, enabling quick logins for returning users. 

The application UI is created using Java Swing, with **FlatLaf** providing a dark mode theme, offering a modern user interface experience.

## Features

- **User Login**: Validates username and password against a MySQL database.
- **Remember Me**: Option to save user credentials locally using Java serialization.
- **Last Login Details**: Automatically loads last login details if available.
- **Modern Dark UI**: Uses FlatLaf to provide a sleek, dark-themed user interface.

## Technologies Used

- **Java (JDK 11)**: Core language used for the application.
- **Apache ANT**: Used for building and managing the project.
- **Swing**: Java GUI toolkit for creating the application interface.
- **FlatLaf**: Provides a modern look and feel for Java Swing applications.
- **MySQL**: Database used to store and verify user login credentials.

## Requirements

- **JDK 11**: Make sure Java Development Kit 11 is installed.
- **Apache ANT**: Required for building and running the application.
- **MySQL Database**: For storing user login information.

## Installation

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/JavaSerializationLogin.git
   cd JavaSerializationLogin

2. Set up the Database: Configure your MySQL database with a table for users.
3. Configure Database Connection: Adjust the MySQL model class to include your database connection details.
4. 
