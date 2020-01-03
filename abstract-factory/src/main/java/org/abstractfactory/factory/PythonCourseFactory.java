package org.abstractfactory.factory;

import org.abstractfactory.bean.Note;
import org.abstractfactory.bean.PythonNote;
import org.abstractfactory.bean.PythonVideo;
import org.abstractfactory.bean.Video;

/**
 * 每个具体工厂中都会包含一个相应的产品变体
 **/
public class PythonCourseFactory implements CourseFactory {

    /**
     * 创建视频对象
     */
    @Override
    public Video createVideo() {
        return new PythonVideo();
    }

    /**
     * 创建笔记对象
     */
    @Override
    public Note createNote() {
        return new PythonNote();
    }
}
