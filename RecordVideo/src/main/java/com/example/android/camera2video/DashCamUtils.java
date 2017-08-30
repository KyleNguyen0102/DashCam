package com.example.android.camera2video;

import android.os.Environment;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static android.util.Log.d;
import static com.example.android.camera2video.BuildConfig.DEBUG;

/**
 * Created by oneone on 8/26/2017.
 */

public class DashCamUtils {

    private static final String TAG = DashCamUtils.class.getSimpleName();

    /**
     * Save app in public memory in sd card.
     * @return path.
     */
    private String getOutputMediaFile() {
        // To, you should be safe check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.
        if (!Environment.getExternalStorageState().equalsIgnoreCase(Environment.MEDIA_MOUNTED)) {
            return  null;
        }

        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_MOVIES), "DashCam");
        // Create the storage directory if it does not exist
        if (!mediaStorageDir.exists()) {
            if (!mediaStorageDir.mkdirs()) {
                if (DEBUG) {
                    d(TAG, "failed to create directory");
                }
                return null;
            }
        }

        // Create a media file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date());
        String pathName = mediaStorageDir.getPath() + File.separator + "_" + timeStamp + ".mp4";
        if (DEBUG) {
            d(TAG, "getOutputMediaFile: timeStamp = " + timeStamp + "\n pathName = " + pathName);
        }
        return pathName;
    }


}
