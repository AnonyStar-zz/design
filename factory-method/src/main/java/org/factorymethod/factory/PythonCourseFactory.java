package org.factorymethod.factory;

import org.factorymethod.Course;
import org.factorymethod.PythonCourse;

/**
 * @Description:
 * @ClassName: PythonCourseFactory
 * @Author: zhoucx
 * @Date: 2019/12/31 10:43
 **/
public class PythonCourseFactory implements CourseFactory {
    /**
     * 创建对象
     * @return
     */
    @Override
    public Course create() {
        return new PythonCourse();
    }
}
