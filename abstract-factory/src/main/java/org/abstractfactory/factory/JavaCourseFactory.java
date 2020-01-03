package org.abstractfactory.factory;

import org.abstractfactory.bean.JavaNote;
import org.abstractfactory.bean.JavaVideo;
import org.abstractfactory.bean.Note;
import org.abstractfactory.bean.Video;

/**
 * 具体工厂可生成属于同一变体的系列产品。工厂会确保其创建的产品能相互搭配
 * 使用。具体工厂方法签名会返回一个抽象产品，但在方法内部则会对具体产品进
 * 行实例化。
 **/
public class JavaCourseFactory implements CourseFactory {

    /**
     * 创建视频对象
     */
    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    /**
     * 创建笔记对象
     */
    @Override
    public Note createNote() {
        return new JavaNote();
    }
}
