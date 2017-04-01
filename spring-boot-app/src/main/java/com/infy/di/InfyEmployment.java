package com.infy.vivah;

/**
 * Created by ravi on 01/04/2017.
 */
public class InfyEmployment {
    public static void main(String[] args) {
        //approach1
        Employee1 employee1 = new Employee1();
        System.out.println("Employee1 getCurrentAddress: "+ employee1.address.getCurrentAddress());
        System.out.println("Employee1 getPermanentAddress: "+ employee1.address.getPermanentAddress());

        //approach2 a)
        Address addressSesh = new Address();
         /*<bean id="addressSesh" class="com.infy.vivah.Address">
        </bean>*/
        Employee2 empShesh= new Employee2(addressSesh);
        System.out.println("Employee2 getCurrentAddress: "+empShesh.address.getCurrentAddress());
        System.out.println("Employee2 getPermanentAddress: "+empShesh.address.getPermanentAddress());

        //approach2 b)
        Address addressRavi = new Address("Glasgow, Scotland","Pandhurna, MP"); //address manipulation/ user define creation
    /*    <bean id="addressRavi" class="com.infy.vivah.Address">
                <property name="currentAddress" value="Glasgow, Scotland"></property>
                <property name="permenentAddress" value="Pandhurna, MP"></property>
        </bean>*/

        Employee2 empRavi= new Employee2(addressRavi);
        System.out.println("Employee3 getCurrentAddress: "+empRavi.address.getCurrentAddress());
        System.out.println("Employee3 getPermanentAddress: "+empRavi.address.getPermanentAddress());

        //approach Spring
        Address addressAarohi;
        /*    <bean id="addressAarohi" class="com.infy.vivah.Address">
                <property name="currentAddress" value="Edenburg, Scotland"></property>
                <property name="permenentAddress" value="Pandhurna, MP"></property>
        </bean>*/


        /*    <bean id="empAarohi" class="com.infy.vivah.Employee2">
                <property name="address" ref ="addressAarohi"/property>   ------Setter Injection
        </bean>*/
          /*    <bean id="empAarohi" class="com.infy.vivah.Employee2">
               <constructor-arg ref = "addressAarohi"></constructor-arg>
        </bean>*/
        Resource resource=new ClassPathResource("applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        Employee2 empAarohi=(Employee2)factory.getBean("empAarohi");

        System.out.println("Employee3 getCurrentAddress: "+empRavi.address.getCurrentAddress());
        System.out.println("Employee3 getPermanentAddress: "+empRavi.address.getPermanentAddress());
    }
}
