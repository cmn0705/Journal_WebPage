*Tags: Html, Css, JavaScript, Servlet, Tomcat*

[Website Layout](https://cmn0705.github.io/Journal_WebPage/tomcat/webapps/FinalProject/WEB-INF/Journal.html)

**Functional Description**
* Allows user to save a thought or idea to the server along with the time and date.
* Allows user to retrieve all their entries and list them in order along with the date of entry.
* Allows user to login.
* Provides thought provoking ideas on running slides.
* Provides a different color for date in order to distinguish it from user entry. 

**Technical Information**
* Uses java servlet to host app.
* Journal is saved on the server “FinalProject”
* Languages used: HTML/Java/Javascript/Bootstrap Framework/CSS
* Database is created when user saves information.

**How to Run**
* Note: Running Server on Mac
1.	Application folder ‘FinalProject’ is placed in the folder tomcat/webapps
2.	In Terminal, go to tomcat/bin folder, type ‘./startup.sh’ to start the server:
3.	In browser, go to http://localhost:9091/ to make sure the server is running
4.	Go into FinalProject/WEB-INF folder.
5.	Open Journal.html on a browser of your choice.
6.	Enter at least one entry into text box and click the Save button or press Enter.
7.	Click the Retrieve button to list all the entries saved on the database in chronological order. (This data is saved in ‘FinalProject’ file in the tomcat/bin folder)