package org.design.demo2;

/**
 * @Description:
 * @ClassName: App3
 * @Author: zhoucx
 * @Date: 2019/12/30 16:31
 **/
public class App3 {


    public static void main(String[] args) {
        Course course = CourseFactory.create(JavaCourse.class);
        course.liveCourse();
    }
}
