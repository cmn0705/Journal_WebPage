*Tags: Frontend, Backend, Web Development*

[Website Layout](https://cmn0705.github.io/Journal_WebPage/tomcat/webapps/FinalProject/WEB-INF/Journal.html)

**Description**
- Developed a Journal Webpage that allows users to log in, type their ideas in to the text box, and save them into the server. Texts will be saved along with the date and time of the entries. Users can retrieve all their previous entries by clicking the retrieve button.
- Designed the webpage  with bootstrap4 to make it responsible to screen sizes, having a popup login window, a running random slides that provoke thoughts.
- Developed the webpage with a server so entries will not be lost if the user turn on/off the Webpage and can retrieve them later.
- Tools used: *html, css, bootstrap 4, Java, Servlet, Tomcat*

**Files:**
- Journal.html
- styles.css
- main.css *(Bootstrap lite)*
- main.js *(Bootstrap lite)*
- web.xml
- Save.java
- Retrieve.java

**How to Run**
* Note: Running Server on Mac
1.	Application folder ‘FinalProject’ is placed in the folder tomcat/webapps
2.	In Terminal, go to tomcat/bin folder, type ‘./startup.sh’ to start the server:
3.	In browser, go to http://localhost:9091/ to make sure the server is running
4.	Go into FinalProject/WEB-INF folder.
5.	Open Journal.html on a browser of your choice.
6.	Enter at least one entry into text box and click the Save button or press Enter.
7.	Click the Retrieve button to list all the entries saved on the database in chronological order. (This data is saved in ‘FinalProject’ file in the tomcat/bin folder)