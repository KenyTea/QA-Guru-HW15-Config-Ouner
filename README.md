# Automation testing project for [Air Astana](https://airastana.com/global/en-us/)


___

## Technology stack:

<p  align="center">

<code>
<img width="5%" title="Java" src="forReadme/Java_icon.png">
<img width="5%" title="Gradle" src="forReadme/Gradle_icon.svg">
<img width="5%" title="JUnit5" src="forReadme/JUnit5_icon.png">
<img width="5%" title="IntelliJ IDEA" src="forReadme/Intellij_icon.png">
<img width="5%" title="Selenide" src="forReadme/Selenide_icon.svg">
<img width="5%" title="Selenoid" src="forReadme/Selenoid_icon.svg">
<img width="5%" title="Github" src="forReadme/Github_icon.png">
<img width="5%" title="Jenkins" src="forReadme/Jenkins_icon.svg">
<img width="5%" title="Allure Report" src="forReadme/Allure_Report_icon.svg">
<img width="5%" title="Telegram" src="forReadme/Telegram_icon.png">
</code>
</p>


___

## Run tests from terminal locally:

```bash
gradle clean test -DairUrl=https://airastana.com/global/en-us/
```
___

## [Jenkins](https://jenkins.autotests.cloud/job/QA.Guru9_HW13AirAstana/)

To run an autotest with the help of Jenkins, you need to click on to the button 
 [Run with parameters](https://jenkins.autotests.cloud/job/QA.Guru9_HW13AirAstana/build?delay=0sec) 
then select [url](https://airastana.com/global/en-us/) and click the button Run.


## Allure Report

After finishing Jenkins work generates [Allure report](https://jenkins.autotests.cloud/job/QA.Guru9_HW13AirAstana/allure/))

For example Allure report:

<p align="center">
  <img src="forReadme/Report_example.png">
</p>

Also gait can record video and take screenshots:

<p align="center">
  <img src="forReadme/Report_example_video.png">
</p>

<p align="center">
  <img src="forReadme/Report_example_screenshots.png">
</p>

___

## Notifications in Telegram channel

After completion of the work, the project sends a notification to the Telegram channel

<p align="center">
  <img src="forReadme/Telegram_example.png">
</p>

___
