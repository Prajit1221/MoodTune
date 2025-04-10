# MoodTune: YouTube Music Player Based on Mood

## Overview

MoodTune is a basic Android application designed to play music from YouTube based on the detected mood of the listener. Leveraging device sensors (initially planned for future expansion with more sophisticated mood detection techniques), the app aims to create a personalized and emotionally resonant listening experience by streaming relevant music videos from YouTube.

**Note:** This is a basic version currently under development. The initial implementation focuses on a simplified mood selection mechanism for testing the core YouTube music playback functionality. Future updates will incorporate more advanced mood detection methods.

## Features (Current Stage)

* **Mood Selection:** Users can manually select their current mood from a predefined list (e.g., Happy, Calm, Energetic, Sad).
* **YouTube Music Playback:** Plays a predefined playlist of YouTube music videos associated with the selected mood using the YouTube Android Player API.
* **Simple User Interface:** Easy-to-navigate interface for mood selection and basic music control (play, pause, next, previous - limited by the YouTube API).

## Planned Future Features

* **Advanced Mood Detection:** Integration with device sensors (e.g., microphone for voice analysis, camera for facial expression analysis) and potentially third-party APIs for more accurate and automatic mood detection.
* **Dynamic YouTube Playlist Generation:** Generation of YouTube playlists based on the detected mood, potentially utilizing YouTube Data API for searching and retrieving relevant music videos.
* **Personalized Recommendations:** Learning user preferences over time to provide more tailored YouTube music recommendations for specific moods.
* **Background Playback (API Dependent):** Explore possibilities for background playback within the constraints of the YouTube Android Player API.
* **Notifications:** Basic playback controls in the notification area (API Dependent).

## Technologies Used

* **Android SDK:** For building the native Android application.
* **Java:** The primary programming language used for development.
* **YouTube Android Player API:** For embedding and controlling YouTube video playback.
* **(Potentially in the future):**
    * **TensorFlow Lite/Other ML Libraries:** For on-device mood analysis.
    * **Retrofit/Volley:** For network requests to mood analysis APIs or YouTube Data API.
    * **Room Persistence Library:** For local data storage of user preferences.

## Setup and Installation

1.  **Clone the repository:**
    ```bash
    git clone <https://github.com/Prajit1221/MoodTune.git>
    ```
    
2.  **Open the project in Android Studio:**
    * Launch Android Studio.
    * Select "Open an existing Android Studio project".
    * Navigate to the cloned repository directory and select the root `build.gradle` file.

3.  **Build and Run:**
    * Connect an Android device or start an emulator with Google Play Services installed (as the YouTube Android Player API relies on it).
    * In Android Studio, click the "Run" button (green triangle) or use `Shift+F10`.

## Current Limitations

* **Basic Mood Detection:** Currently relies on manual mood selection, which is not the intended core functionality.
* **YouTube Dependency:** The app relies entirely on YouTube for music content and is subject to YouTube's terms of service and API limitations.
* **Internet Connection Required:** Streaming from YouTube requires a stable internet connection.
* **API Key Required:** Users will need a YouTube API key for the app to function correctly.
* **Playback Controls Limited by API:** Control over playback (e.g., background playback, advanced controls) might be limited by the capabilities of the YouTube Android Player API.
* **No Advanced Features:** Features like dynamic playlist generation, personalized recommendations, and advanced playback controls are not yet implemented.
* **Basic UI:** The user interface is functional but will be improved in future iterations.

## Contribution

Contributions to this project are welcome! If you have ideas for new features, bug fixes, or improvements, please feel free to:

1.  Fork the repository.
2.  Create a new branch for your feature or fix.
3.  Commit your changes.
4.  Push to your branch.
5.  Create a pull request.

Please ensure that your code adheres to the project's coding style and includes appropriate handling of the YouTube Android Player API.
