package androidkun.com.versionupdatelibrary.entity;

import android.os.Environment;

/**
 * Created by Kun on 2017/5/22.
 * GitHub: https://github.com/AndroidKun
 * CSDN: http://blog.csdn.net/a1533588867
 * Description:配置文件
 */

public class Config {
    /**
     * 通知栏标题
     */
    public static String notificationTitle ;
    /**
     * 通知栏小图标
     */
    public static int notificaionSmallIconResId = 0;
    /**
     * 通知栏图标
     */
    public static int notificaionIconResId = 0;
    /**
     * 文件下载地址
     */
    public static String downLoadPath = Environment.getExternalStorageDirectory().getAbsolutePath()
            + "/downloads/";

    /**
     * 开始下载
     */
    public final static String ACTION_START = "ACTION_START";
    /**
     * 暂停下载
     */
    public final static String ACTION_PAUSE = "ACTION_PAUSE";
    /**
     * 下载完成
     */
    public final static String ACTION_FININSHED = "ACTION_FININSHED";
    /**
     * 刷新下载进度
     */
    public final static String ACTION_REFRESH = "ACTION_REFRESH";
}
