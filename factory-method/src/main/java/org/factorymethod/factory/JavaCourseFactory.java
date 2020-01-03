package org.factorymethod.factory;

import org.factorymethod.Course;
import org.factorymethod.JavaCourse;

/**
 * @Description:
 * @ClassName: JavaCourseFactory
 * @Author: zhoucx
 * @Date: 2019/12/31 10:42
 **/
public class JavaCourseFactory implements CourseFactory {
    /**
     * 创建对象
     * @return
     */
    @Override
    public Course create() {
        return new JavaCourse();
    }
}
