package com.example.testproject;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class Common_Log {
    public final int DEBUG_LOG = 1;

    public final int TRACE_LEVEL_0 = 0;
    public final int TRACE_LEVEL_1 = 1;
    public final int TRACE_LEVEL_2 = 2;
    public final int TRACE_LEVEL_3 = 3;
    public final int TRACE_LEVEL_4 = 4;

    public final int LOG_COMMON = 0;
    public final int LOG_ERROR = 1;
    public final int LOG_WARNING = 2;

    String mClassName;

    private Common_Log(){}

//    private static class InnterInstanceClass {
//        private static final Common_Log instance = new Common_Log();
//    }
//
//    public static Common_Log getInstance() {
//        return InnterInstanceClass.instance;
//    }

    public Common_Log(String className) {
        mClassName = className;
    }

    private Boolean Debug_Log_Check() {
        if(DEBUG_LOG == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void BwLog(int log_type, String message) {
        if(!Debug_Log_Check())
            return;

        StackTraceElement ste = Thread.currentThread().getStackTrace()[TRACE_LEVEL_3];

        if(log_type == LOG_COMMON) {
            Log.i(mClassName,"[ Line : "+ste.getLineNumber()+" ]  " + message);
        }
        else if(log_type == LOG_ERROR) {
            Log.e(mClassName,"[ Line : "+ste.getLineNumber()+" ]  " + message);
        }
        else if(log_type == LOG_WARNING) {
            Log.w(mClassName,"[ Line : "+ste.getLineNumber()+" ]  " + message);
        }
    }

    public void BwToast_s(Context context, String message) {
        if(!Debug_Log_Check())
            return;

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public void BwToast_l(Context context, String message) {
        if(!Debug_Log_Check())
            return;

        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
