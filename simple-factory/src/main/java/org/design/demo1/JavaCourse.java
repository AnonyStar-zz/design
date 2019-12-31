package org.design.demo1;

/**
 * @Description:
 * @ClassName: JavaCourse
 * @Author: zhoucx
 * @Date: 2019/12/30 14:02
 **/
public class JavaCourse implements Course{
    @Override
    public void liveCourse() {
        System.out.println("正在直播Java课程···");
    }
}
