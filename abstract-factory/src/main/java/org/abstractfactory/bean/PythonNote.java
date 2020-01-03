package org.abstractfactory.bean;

/**
 * @Description:
 * @ClassName: PythonNote
 * @Author: zhoucx
 * @Date: 2019/12/31 17:12
 **/
public class PythonNote implements Note {
    /**
     * 编辑笔记
     */
    @Override
    public void editNote() {
        System.out.println("编辑python课程笔记···");
    }
}
