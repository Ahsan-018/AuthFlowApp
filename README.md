# AuthFlowApp

An Android application developed using **Java and XML** in Android Studio. This project demonstrates a splash screen, a login screen with basic input validation, and a signup interface.

## Features

- Splash screen with app title and loading indicator.
- Automatic navigation from splash screen to login screen.
- Login form with email and password fields.
- Basic email and password validation.
- Navigation between login and signup screens.
- Signup form with name, email, password, and confirm password fields.
- Clean and scrollable user interface.

## Technologies Used

- Java
- XML
- Android Studio
- Android SDK
- Git and GitHub

## Project Structure

```text
AuthFlowApp/
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/authflowapp/
│           │   ├── SplashActivity.java
│           │   ├── MainActivity.java
│           │   └── SignupActivity.java
│           ├── res/layout/
│           │   ├── activity_splash.xml
│           │   ├── activity_main.xml
│           │   └── activity_signup.xml
│           └── AndroidManifest.xml
├── screenshots/
│   ├── splash.png
│   ├── login.png
│   └── signup.png
├── README.md
└── .gitignore
```

## How to Run

1. Clone this repository:

   ```bash
   git clone https://github.com/Ahsan-018/AuthFlowApp.git
   ```

2. Open the project in Android Studio.
3. Wait for Gradle synchronization to complete.
4. Start an Android emulator or connect a compatible Android device.
5. Click the **Run** button to launch the application.

## Login and Signup Functionality

The login screen performs basic input validation and displays a demo message for valid-looking input. Real authentication is not connected.

The signup screen provides the registration interface, but account creation is intentionally not implemented as required by the assignment.

## Limitations

- No backend or database integration.
- No real user authentication.
- No account registration or persistent user data.

## Author

**Ahsan Mahmood**

Mobile Application Development Assignment

## Purpose

This project was created for educational purposes to practice Android activities, XML layouts, input validation, and screen navigation.
