README:
=================
- TranslateServis predstavlja web servis za prevodjenje reci (srpski, engleski, nemacki, ruski i kineski jezik). Realizovan je pomocu SOAP i GlassFish servera. Nalazi se u projektu SOAPtranslate.

- Podaci su smesteni u XML fajl, koji se nalazi u okviru ovog projekta u paketu business. 
(SOAPtranslate\src\java\buisiness\dictionary.xml). U kodu je definisana relativna putanja do ovog fajla.

- WSDL: http://localhost:8080/SOAPtranslate/TranslateService?WSDL

- Servis se moze testirati pomocu NetBeans opcije TestWebService ili unosenjem sledece URL adrese u browser: http://localhost:8080/SOAPtranslate/TranslateService?Tester
Potrebno je uneti tri String parametra: word (rec koja se prevodi), fromLanguage (sa kog jezika se prevodi) i toLanguage(na koji jezik se prevodi) i pritisnuti taster translate. Kao parametri jezika se mogu uneti: english, serbian, german, russian, chinese.

- Takodje, servis se isto moze testirati i preko klijentske konzolne aplikacije koja je data u paketu ClientWebTranslate.

 
