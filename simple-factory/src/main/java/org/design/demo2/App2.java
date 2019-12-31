package org.design.demo2;

/**
 * @Description:
 * @ClassName: App2
 * @Author: zhoucx
 * @Date: 2019/12/30 16:22
 **/
public class App2 {


    public static void main(String[] args) {
        Course course = CourseFactory.create("org.design.demo2.JavaCourse");
        course.liveCourse();
    }
}
