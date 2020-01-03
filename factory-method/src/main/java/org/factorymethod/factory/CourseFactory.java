package org.factorymethod.factory;

import org.factorymethod.Course;

/**
 * @Description:
 * @ClassName: CourseFactory
 * @Author: zhoucx
 * @Date: 2019/12/31 10:33
 **/
public interface CourseFactory {
    /**
     * 创建对象
     * @return
     */
    Course create();
}
