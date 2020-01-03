package org.abstractfactory.bean;

/**
 * @Description:
 * @ClassName: JavaNote
 * @Author: zhoucx
 * @Date: 2019/12/31 17:12
 **/
public class JavaNote implements Note {
    /**
     * 编辑笔记
     */
    @Override
    public void editNote() {
        System.out.println("编辑Java课程笔记···");
    }
}
