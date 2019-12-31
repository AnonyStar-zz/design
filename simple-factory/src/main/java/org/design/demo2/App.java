package org.design.demo2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        CourseFactory factory = new CourseFactory();
        //创建Java课程
        Course java = factory.create("java");
        java.liveCourse();
        //创建python课程
        Course python = factory.create("python");
        python.liveCourse();
    }
}
