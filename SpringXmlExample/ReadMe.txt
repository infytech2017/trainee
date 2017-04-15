
1) Spring Xml Configuration
   AppXmlBean.java
   a)Spring bean creation
   AppSpringDI.java
   a) Spring IoC container uses Application Context to load/create spring bean from config location.
   b) Spring bean injection to another bean
        i) Dependency Injection by Setter Method
        ii)Dependency Injection by Constructor
2) AppSpringByBeanFactory.java
   -Spring IoC Container implementation BeanFactory to load Spring Xml Configuration - Not using by programmer.

3) AppSpringByApplicationContext.java
   -Spring IoC Container implementation ApplicationContext Spring Xml Configuration.
  a) using ClassPathXmlApplicationContext   //http://java-journal.blogspot.co.uk/2012/08/what-is-applicationcontext-what-are-its.html
  b) using FileSystemXmlApplicationContext -- not in use
  c) using AnnotationConfigApplicationContext -- not in use
  d) using - but MVC: By default Spring use XmlWebApplicationContext (an implementation of WebApplicationContext) for creating spring container in web applications. By default it loads the configuration from file "/WEB-INF/applicationContext.xml".
  e) using - but MVC: But we can change this default value to AnnotationConfigWebApplicationContext by changing the value of contextClass parameter of ContextLoaderListener or DispatcherServlet in web.xml

4) AppLooseCouple.java
   -Spring Loose Coupling Example


5) Spring Annotation Configuration
   -AnnotationConfigApplicationContext

-Spring bean auto-wiring through autowire mode in XML configuration
-Spring bean auto-wiring through @Autowired Annotation

6)  Spring @Autowired Annotation  : By default spring bean autowiring is turned off.
   autowire byName – For this type of autowiring, setter method is used for dependency injection. ...
   autowire byType – For this type of autowiring, class type is used

In Spring, you can use @Autowired annotation to auto wire bean on the setter method, constructor or a field.
   @Autowired annotation can be applied on variables and methods for autowiring byType. We can also use @Autowired annotation on constructor for constructor based spring autowiring.
   For @Autowired annotation to work, we also need to enable annotation based configuration in spring bean configuration file. This can be done by context:annotation-config element