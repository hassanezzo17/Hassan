@echo off
:: If you already have a valid JAVA_HOME environment variable set, feel free to comment the below two lines
set JAVA_HOME=C:\Program Files\Java\jdk-19
set path=%JAVA_HOME%\bin;%path%
set path=C:\Users\hassa\.m2\repository\allure\allure-2.20.1\bin;%path%
allure serve allure-results
pause
exit