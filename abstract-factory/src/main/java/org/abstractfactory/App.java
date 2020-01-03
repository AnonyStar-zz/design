package org.abstractfactory;

import org.abstractfactory.bean.Note;
import org.abstractfactory.bean.Video;
import org.abstractfactory.factory.CourseFactory;
import org.abstractfactory.factory.JavaCourseFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * 程序会根据当前配置或环境设定选择工厂类型，并在运行时创建工厂（通常在初始化阶段）
     */
    public static void main( String[] args )
    {
      CourseFactory javaFactory = new JavaCourseFactory();
        Video video = javaFactory.createVideo();
        Note note = javaFactory.createNote();
        video.record();
        note.editNote();

    }
}
