# Healthy Habits Tracker App

A simple Android app to help users manage and track their healthy habits, such as daily water intake, exercise, and sleep.  
Developed in Kotlin using Android Studio.

---

## Repository

**GitHub Repository:**  
[https://github.com/nosicelo7/tracker-app/tree/master](https://github.com/nosicelo7/tracker-app/tree/master)

---

## Features

- **Main Screen**:  
  - Enter daily values for water intake (ml), exercise (minutes), and sleep (hours) for up to 7 days.
  - Data is stored in parallel arrays for each habit.
  - Options to clear/reset all inputs or proceed to a detailed view.

- **Detailed View Screen**:  
  - Displays a summary of all 7 days’ records for water, exercise, and sleep.
  - Provides navigation back to the main input screen.

---

## Screenshots and Screen Explanations

### 1. Welcome Screen

![image3](image3)

**Explanation:**  
- This is the first screen the user sees when launching the app.
- It displays the application name ("Healthy Tracking App"), the student number, and the user’s name.
- The "Main Screen" button allows the user to proceed to the main input functionality of the app.

---

### 2. Main Input Screen

![image2](image2)

**Explanation:**  
- This screen allows users to enter their healthy habit data for each day.
- The user is prompted to input:
  - The amount of water consumed (in cups).
  - The duration of exercise performed (in minutes).
  - The amount of sleep (in minutes).
- The "Next Screen" button saves the current day’s data and moves to the next step or day.
- The "Clear Data" button will reset all input fields so the user can start over.
- The background with fruits provides a visually engaging and friendly interface.

---

### 3. Detailed View Screen

![image1](image1)

**Explanation:**  
- This screen displays a summary of the user’s healthy habit records for the week.
- The "Detailed Habit Records" title and a multi-line area (initially saying "Day details will appear here") are shown.
- After entering data for all days, the summary of all records will appear in this section.
- The "Main Screen" button at the bottom allows the user to go back to the main input screen and edit or add more records.
- The same playful fruit background ensures visual consistency across the app.

---

## Pseudocode

Below is a high-level pseudocode outline for the core logic of the app:

```
START APP

INITIALIZE three arrays: waterIntake[7], exerciseMinutes[7], sleepHours[7]
SET currentDay to 0

// Main Input Screen
WHILE currentDay < 7
    SHOW input fields for water, exercise, sleep
    ON 'Next' button clicked:
        IF all fields have valid numbers
            STORE values in respective arrays at currentDay index
            INCREMENT currentDay
        ELSE
            SHOW error message
    
    ON 'Clear Data' button clicked:
        RESET all arrays to zero
        RESET currentDay to 0
        CLEAR input fields

    IF currentDay == 7
        CHANGE 'Next' button to 'View Details'

// Detailed View Screen
ON screen opened:
    FOR day 1 TO 7
        DISPLAY waterIntake[day], exerciseMinutes[day], sleepHours[day]

    ON 'Back to Main Screen' button clicked:
        CLOSE details screen and return to input screen

END APP
```

---

## How it Works

1. **Enter Your Data**:  
   On the main screen, enter your water intake, exercise minutes, and sleep hours for each day.  
   Press "Next" to save each day's data.

2. **View Details**:  
   After entering 7 days, press "View Details" to see a summary for the week.

3. **Clear Data**:  
   Use the "Clear Data" button to reset all fields and start over.

4. **Navigate**:  
   From the details screen, press "Back to Main Screen" to return and re-enter or update your records.

---

## Tech Stack

- **Language:** Kotlin
- **UI:** XML Layouts with ConstraintLayout and ScrollView
- **IDE:** Android Studio

---

## File Structure

- `MainScreen.kt` — Main input activity for habit data.
- `ViewScreen.kt` — Shows detailed records for the week.
- `activity_main_screen.xml` — Layout for the main input screen.
- `activity_view_screen.xml` — Layout for the detailed view screen.
- `README.md` — App information and setup.

---

## How to Run

1. Clone or download this repository.
2. Open the project in Android Studio.
3. Build and run the app on an emulator or Android device.

---

## Author

- Student Name: **Nosicelo Ngubane**  
- Student Number: **ST10483775**

---

## License

This project is for educational purposes.
