*Tags: Frontend, Backend, Web Development*

[Website Layout](https://cmn0705.github.io/Journal_WebPage/tomcat/webapps/FinalProject/WEB-INF/Journal.html)

**Description**
- Developed a Journal Webpage that allows users to log in, type and save their ideas into the server along with the time of the entries, retrieve all their previous entries, and download the whole journal.
- Designed the webpage to make it responsive to screen sizes, with popup login window, and running slides of random ideas.
- Wrote JavaScript codes to validate the information entered.
- Designed server side of the webpage to save user login information and all entries so they will not be lost if the user turn on/off the Webpage and can be retrieved them later.
- Tools used: *html, css, javaScript, bootstrap 4, Java, Servlet, Tomcat*

**Files:**
- Journal.html
- Login.html
- styles.css
- main.css *(Bootstrap lite)*
- main.js *(Bootstrap lite)*
- scripts.js
- web.xml
- Save.java
- Retrieve.java
- Login.java

**How to Run**
* Note: Running Server on Mac
- Application folder ‘FinalProject’ is placed in the folder tomcat/webapps
- In Terminal, go to tomcat/bin folder, type ‘./startup.sh’ to start the server:
- In browser, go to http://localhost:9091/ to make sure the server is running
- Go into FinalProject/WEB-INF folder.
- Open Journal.html on a browser of your choice.
- Click login buttion and enter your email and password. If you submit with blank it will ask you again. After done, the place will display a hello message.
- Enter at least one entry into text box and click the Save button or press Enter.
- Click the Retrieve button to list all the entries saved on the database in chronological order, or click download to get text file.