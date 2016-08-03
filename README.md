# TranslateWebService
This service translates words from and to one of 5 languages:
<ol>
<li>Serbian</li>
<li>English</li>
<li>German</li>
<li>Russian</li>
<li>Chinese</li>
</ol>
The service is developed with Java, SOAP and GlassFish server.

* Data is stored in XML file, which is located in package "business". (SOAPtranslate\src\java\buisiness\dictionary.xml). In code, relative path to this file is defined.

* WSDL: [http://localhost:8080/SOAPtranslate/TranslateService?WSDL](http://localhost:8080/SOAPtranslate/TranslateService?WSDL)

* The servis can be tested at this URL address: [http://localhost:8080/SOAPtranslate/TranslateService?Tester](http://localhost:8080/SOAPtranslate/TranslateService?Tester)

![service] (https://s31.postimg.org/t7jp8qsa3/Translateservice.jpg)
* You have to enter tree String parameters: word (word that you want to translate), fromLangauge (language of the entered word) and toLanguage (chose language to translate) and press translate button. As language parameters you can enter: english, serbian, german, russian, chinese. 

* COMMENT: Take a look at .xml file to see which words are supported for translation. For example, enter the following: butterfly, english, chinese.
