package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Common_Log common_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //test2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        common_log = new Common_Log(this.getClass().getName().trim());

        common_log.BwLog(common_log.LOG_COMMON,"Message to Common");
        common_log.BwLog(common_log.LOG_ERROR,"Message to Error");

        ShowMainActivityLog();

        common_log.BwToast_l(this, "show short toast");

//        Common_Log common_log1 = Common_Log.getInstance();
//        Common_Log common_log2 = Common_Log.getInstance();
//
//        if(common_log1 == common_log2) {
//            common_log1.BwLog(common_log1.LOG_COMMON,"same object");
//        }else {
//            common_log1.BwLog(common_log1.LOG_COMMON,"another object");
//        }
    }

    private void ShowMainActivityLog() {
        if(common_log != null) {
            common_log.BwLog(common_log.LOG_WARNING,"Message to Warning");
        }

    }
}
