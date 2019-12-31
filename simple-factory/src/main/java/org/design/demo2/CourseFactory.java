package org.design.demo2;

import java.util.Objects;

/**
 * @Description:
 * @ClassName: CourseFactory
 * @Author: zhoucx
 * @Date: 2019/12/30 15:09
 **/
public class CourseFactory {

  /*  *//**
     * 创建课程对象
     * @param name 需要创建对象名
     * @return
     *//*
    public Course create1(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }else if ("python".equals(name)){
            return new PythonCourse();
        }
        return null;
    }

    *//**
     * 创建对象
     * @param className 需要被创建对象的全路径
     * @return
     *//*
    public static Course create(String className){

        try {
            if (!Objects.isNull(className) && !"".equals(className)){
                Class<?> aClass = Class.forName(className);
                Course course = (Course) aClass.newInstance();
                return course;
            }
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }*/

    /**
     * @param clazz 传入需要创建对象的Class
     * @return
     */
    public static Course create(Class<? extends Course> clazz) {
        try {
            if (!Objects.isNull(clazz)){
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
