# ExpertiseTest
# Versions


#java version "1.8.0_181"
#apache-tomcat-9.0.37
#apache-maven-3.6.3


****** Rest service to convert kelvin to Celsius*****

 

Endpoint: http://localhost:8080/conversionApp/rest/conversions/ktoc?kelvin=100

HTTP Method: GET

Response:

{"statusMessage":"Your Kelvin temperature 100.0 K has been converted to celcius -173.14999999999998 C"}

 

****** Rest service to convert Celcius to Kelvin*****

 

Endpoint: http://localhost:8080/conversionApp/rest/conversions/ctok?celcius=1

HTTP Method: GET

Response:

{"statusMessage":"Your celcius temperature 1.0 C has been converted to kelvin 274.15 K"}
 

 

****** Rest service to convert Mile to Kilometer *****

 

Endpoint: http://localhost:8080/conversionApp/rest/conversions/mtok?mile=1

HTTP Method: GET

Response:

{"statusMessage":"Your mile input 1.0 m has been converted to kilometer 1.60934"}
 

 

****** Rest service to convert Kilometer to mile*****

 

Endpoint: http://localhost:8080/conversionApp/rest/conversions/ktom?km=1

HTTP Method: GET

Response:

{"statusMessage":"Your kilometer input 1.0km  has been converted to mile 0.6213727366498067 m"}