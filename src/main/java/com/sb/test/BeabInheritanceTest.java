package com.sb.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.sb.beans.Car;

public class BeabInheritanceTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Car c1=null;Car c2=null;
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com\\nt\\cfg\\ApplicationContext.xml");
		c1=factory.getBean("satyaCar",Car.class);
		System.out.println(c1);
		System.out.println("----------------------------------------------------------------------");
		c2=factory.getBean("babyCar",Car.class);
		System.out.println(c2);
		
	}
}
