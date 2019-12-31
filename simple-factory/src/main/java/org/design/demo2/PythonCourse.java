package org.design.demo2;

/**
 * @Description:
 * @ClassName: PythonCourse
 * @Author: zhoucx
 * @Date: 2019/12/30 15:02
 **/
public class PythonCourse implements Course {
    /**
     * 课程录制方法
     */
    @Override
    public void liveCourse() {
        System.out.println("python课程正在录制···");
    }
}
