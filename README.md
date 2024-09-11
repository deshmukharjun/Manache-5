Manache Ganapati Information App
Manache Ganapati Information App is an Android application developed by Arjun Deshmukh that provides detailed information about the five Manache Ganapatis in Pune along with their respective locations. The app supports two languages: English and Marathi, allowing users to easily access information in their preferred language.

Features
Information about the five Manache Ganapatis in Pune.
Display of the exact locations of each Ganapati temple.
Support for English and Marathi languages.
Simple, user-friendly interface designed for easy navigation.
Installation
Clone the repository to your local machine:
bash
Copy code
git clone <repository-link>
Open the project in Android Studio.
Build and run the app on an Android emulator or a physical device.
Usage
Launch the app on your Android device.
Select your preferred language (English or Marathi).
Navigate through the list of the five Manache Ganapatis.
Tap on each Ganapati to view detailed information about the temple and its location.
Use the map feature to get directions to the temple.
Code Overview
MainActivity.java
Variables:

languageSelection: Stores the current language preference of the user (English or Marathi).
ganapatiList: Array that contains the information of the five Ganapatis.
locationData: Stores the GPS coordinates for each Ganapati temple.
Methods:

selectLanguage(View view): Allows the user to choose between English and Marathi.
displayGanapatiInfo(): Fetches and displays the details of the selected Ganapati.
openMap(): Launches the map with the temple's location pinned for easy navigation.
Lifecycle:

onCreate(Bundle savedInstanceState): Initializes the app, sets up the UI components, and loads the language preference.
Acknowledgments
This project was developed by Arjun Deshmukh to provide easy access to information about Pune’s iconic Ganapati temples.
Special thanks to all the sources that provided accurate historical and geographical data about the five Manache Ganapatis.
