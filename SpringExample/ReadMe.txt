1) Spring Xml Configuration
   AppSpringDI.java
   a) Spring IoC container uses Application Context to load/create spring bean from config location.
   a) Spring bean creation
   b) Spring bean injection to another bean
        i) Dependency Injection by Setter Method
        ii)Dependency Injection by Constructor
2) Spring IoC Container implementation BeanFactory to load Spring Xml Configuration - Not using by programmer.
   AppSpringByBeanFactory.java
3) Spring IoC Container implementation ApplicationContext Spring Xml Configuration.
    AppSpringByApplicationContext.java
  a) using ClassPathXmlApplicationContext   //http://java-journal.blogspot.co.uk/2012/08/what-is-applicationcontext-what-are-its.html
  b) using FileSystemXmlApplicationContext
  c) using AnnotationConfigApplicationContext
  c) using - but MVC: By default Spring use XmlWebApplicationContext (an implementation of WebApplicationContext) for creating spring container in web applications. By default it loads the configuration from file "/WEB-INF/applicationContext.xml".
  d) using - but MVC: But we can change this default value to AnnotationConfigWebApplicationContext by changing the value of contextClass parameter of ContextLoaderListener or DispatcherServlet in web.xml