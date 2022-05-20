***To run iTreeFinalProject you must download two repositories:***

https://github.com/maziliag/iTreeFinalAngular       *for front-end*

https://github.com/maziliag/iTreeFinalSpringBoot    *for back-end (current rep)*


Recommended way to get the app running

**Back-end**
1. Install Eclipse IDE
2. Install java JDK from https://www.oracle.com/java/technologies/downloads/#jdk18-windows
   and Maven from https://maven.apache.org/install.html
   
*Check out this tutorial for a smoother Maven installation*
https://www.youtube.com/watch?v=RfCWg5ay5B0 
   
3. Go to https://start.spring.io/ and generate a new project with the following details

***Project Metadata***
Group          com.final-test
Artifact       NaujokuManageris
Name           NaujokuManageris
Description    Finaline uzduotis
Package name   com.final-test.NaujokuManageris
Packaging      Jar
Java           17

***Dependencies***
Spring Web
Thymeleaf
Validation


*Leave the rest of settings default*

4. Extract the generated folder into your working dir. Open your downlaoded Git (back-end) folder and drag and drop all the files into your newly generated folder. Make sure to agree to replace all existing files. 

5. In Eclipse's package explorer navigate to:
   iTreeFinalSpringBoot-main/src.main.java.com.finaltest.NaujokuManageris
6. Right click on NaujokuManagerisApplication.java 
   and select Run As/Java Application
7. You have successfully started back-end of your application

**Front-end**
1. Install VS Code IDE
2. Open the the folder that you have downloaded in VS Code (front-end)
3. Make sure you have Node js and npm installed
4. Install angular CLI. Open terminal  and type
   npm install - g @angular/cli
5. Open a new terminal in VS Code and install missing node packages
   Type into terminal -> npm i
6. Run your application by typing to terminal -> ng serve

**In case you get error message saying that you can't run scripts on your system**
- Open power shell as admin and type Set-ExecutionPolicy RemoteSigned


**Project functionality**

The project is intended to represent a full stack application. It has a mock list of test cusotmers and their detailed information when clicked on them. 

New customers may also be added. When adding a new entry, there are basic validations checks:
- *Valid email*
- *Valid phone number *
- *Customers must be over 18 years old.*
- *Customers with duplicate contact details (emails or/and phone numbers) will not be added.*

Customers may not be edited nor deleted. No real database is connected and data is stored locally in list.
