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

3. Open the the folder that you have forked in Eclipse (back-end) and open pom.xml
   In plugins section paste changing maven version to yours
   <plugin>
     <groupId>org.apache.maven.plugins</groupId>
     <artifactId>maven-resources-plugin</artifactId>
     <version>3.1.0</version>  
   </plugin>               
4. In package explorer navigate to:
   iTreeFinalSpringBoot-main/src.main.java.com.finaltest.NaujokuManageris
5. Right click on NaujokuManagerisApplication.java 
   and select Run As/Java Application
6. You have successfully started back-end of your application

**Front-end**
1. Install VS Code IDE
2. Open the the folder that you have downloaded in VS Code (front-end)
3. Make sure you have Node js and npm installed
4. Install angular CLI. Open terminal  and type
   npm install - g @angular/cli
5. Open a new terminal in VS Code and install missing node packages
   Type into terminal -> npm i
6. Run your application by typing to terminal -> ng serve


**Project functionality**

The project is intended to represent a full stack application. It has a mock list of test cusotmers and their detailed information when clicked on them. 

New customers may also be added. When adding a new entry, there are basic validations checks:
- *Valid email*
- *Valid phone number *
- *Customers must be over 18 years old.*
- *Customers with duplicate contact details (emails or/and phone numbers) will not be added.*

Customers may not be edited nor deleted. No real database is connected and data is stored locally in list.
