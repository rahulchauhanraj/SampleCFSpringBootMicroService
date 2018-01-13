
Sample Predix Microservice Template using Spring Rest
==============

Welcome to Predix Microservice CF Spring, a Predix Backend Microservice Template.  

This Microservice Template project shares the following characteristics

* REST implementation and framework
* Cloud ready with a Manifest file
* Continuous Integration capable


1. Download the project  
  ```
  $ git clone https://github.build.ge.com/212578960/SampleCFSpringRest.git  
  
  $ cd SampleCFSpringRest
  
  $ mvn clean package  
  
    note: mvn clean install may run integration tests against services you may not have set up yet
  ```
  ```
2. Push to cloud  

    Take a look at the [SampleCFSpringRest manifest.yml](manifest.yml) which provides properties and instructions for [pushing cloud foundry]		 
    ```
    $ cf push 
 
