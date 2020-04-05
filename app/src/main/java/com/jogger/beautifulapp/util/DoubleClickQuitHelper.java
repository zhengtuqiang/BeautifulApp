package com.jogger.beautifulapp.util;

import android.app.Activity;
import android.os.Handler;

import com.jogger.beautifulapp.R;

public class DoubleClickQuitHelper {
    private boolean isExit = false;
    private Handler mHandler = new Handler();

    public void quit(Activity activity) {
        if (isExit) {
            mHandler.removeCallbacksAndMessages(null);
            activity.finish();
        } else {
            isExit = true;
            T.show(R.string.exit_msg);
            mHandler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    isExit = false;
                }
            }, 1000);
        }
    }
}
