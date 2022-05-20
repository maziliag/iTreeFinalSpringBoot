***To run iTreeFinalProject you must download two repositories:***

https://github.com/maziliag/iTreeFinalAngular       *for front-end*

https://github.com/maziliag/iTreeFinalSpringBoot    *for back-end (current rep)*


Recommended way to get the app running

**Back-end**
1. Install Eclipse IDE
2. Open the the folder that you have forked in Eclipse (back-end)
3. In package explorer navigate to:
   src/main/java/com.finaltest.NaujokuManageris
4. Right click on NaujokuManagerisApplication.java 
   and select Run As/Java Application
5. You have successfully started back-end of your application

**Front-end**
1. Install VS Code IDE
2. Open the the folder that you have forked in VS Code (front-end)
3. Make sure you have Node js and npm installed
4. Install angular CLI. Open terminal and type
   npm install - g @angular/cli
4. Open a new terminal in VS Code and type -> ng serve
5. You have successfully started front-end of your application


**Project functionality**

The project is intended to represent a full stack application. It has a mock list of test cusotmers and their detailed information when clicked on them. 

New customers may also be added. When adding a new entry, there are basic validations checks:
- *Valid email*
- *Valid phone number *
- *Customers must be over 18 years old.*
- *Customers with duplicate contact details (emails or/and phone numbers) will not be added.*

Customers may not be edited nor deleted. No real database is connected and data is stored locally in list.
