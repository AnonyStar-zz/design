package org.abstractfactory.bean;

/**
 * @Description:
 * @ClassName: PythonVideo
 * @Author: zhoucx
 * @Date: 2019/12/31 17:04
 **/
public class PythonVideo implements Video {
    /**
     * 录制视频.
     */
    @Override
    public void record() {
        System.out.println("录制python视频···");
    }
}
