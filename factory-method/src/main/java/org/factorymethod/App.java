package org.factorymethod;

import org.factorymethod.factory.CourseFactory;
import org.factorymethod.factory.JavaCourseFactory;
import org.factorymethod.factory.PythonCourseFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CourseFactory factory = new JavaCourseFactory();
        Course course = factory.create();
        course.liveCourse();

        factory = new PythonCourseFactory();
        course = factory.create();
        course.liveCourse();

    }
}
