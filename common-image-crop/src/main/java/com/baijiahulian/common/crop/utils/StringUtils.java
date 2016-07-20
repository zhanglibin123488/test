package com.baijiahulian.common.crop.utils;

/**
 * Created by ZhangLibin on 2016/7/19.
 * function
 */
public class StringUtils {
    public static boolean isEmpty(String mPhotoTargetFolder) {
        if (mPhotoTargetFolder == null){
            return true;
        }
        return false;
    }

    public static boolean isEquals(String tagPath, String photoPath) {
        return tagPath.equals(photoPath);
    }

    public static boolean isBlank(String filePath) {
        if (filePath == null || filePath.equals("")){
            return true;
        }
        return false;
    }
}
