# ece651-group-project

### Mission Statement

The goal of this project is to build a cloud-based personal health management system. The personalized health management system can help patients to track their health-related data comfortably, increase prevention, detect risks and make the communication between patient and doctor easier and more efficient.

![](https://github.com/ece651-winter2019/ece651-group-project/blob/master/Softdev-lifecycle/Planning/Images/wiki_mission%20_statement.png)

Server-side application is deployed on a service-based cloud server. The front end is a smartphone app. In the first phase, an Android phone is considered as a client device, it is possible to expand to an iPhone app in the next phase. Also, the initial version of the system will only capture blood pressure and heart rate information. Once this data is successfully captured and processed, the system capabilities could expand to add more information such as gym workout information, etc.

<img src="https://github.com/ece651-winter2019/ece651-group-project/blob/master/Softdev-lifecycle/Planning/Images/telemedicine_3.jpg" width="600">

On the server side, all data received from the mobile app will be stored into a database indexed by the user’s name, date of birth or other. The server shall be able to run a data analysis process to show, analyze and detect risks based on user data trends. Server application shall also be able to show a visual representation of user data via graphs or other on a webpage. This webpage interface would enable doctors to monitor or review the patient’s health status, evaluate and make decisions based on that health information.

The Android phone app will provide data input functionalities for this system. It would be able to input blood pressure and heart rate information manually, or input via OCR (optical character recognition) based text, auto reading from an image which is taken by phone camera. Android phone shall collect this blood pressure information – high, low, pulse, store most recent data on the phone and at the same time forward this information to the server and store them on the server permanently. The application shall also be able to visualize user data on a graph within the GUI.




Please refer to the repo's Wiki for more information about the project (ie. Requirements Spec, Architectural Design, Testing Documentation, Resources & References and Available APIs)

The original repo for this project can be found here: https://github.com/ece651-winter2019/ece651-group-project/
