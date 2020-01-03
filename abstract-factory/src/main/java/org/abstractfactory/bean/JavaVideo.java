package org.abstractfactory.bean;

/**
 * @Description:
 * @ClassName: JavaVideo
 * @Author: zhoucx
 * @Date: 2019/12/31 17:03
 **/
public class JavaVideo implements Video {
    /**
     * 录制视频.
     */
    @Override
    public void record() {
        System.out.println("录制Java视频···");
    }
}
