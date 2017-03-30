package pl.sdacademy.mg.googleplaystore01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class BuildConfigDisplay extends AppCompatActivity {

    private boolean debug = BuildConfig.DEBUG;
    private String applicationId = BuildConfig.APPLICATION_ID;
    private  String buildType = BuildConfig.BUILD_TYPE;
    private String flavor = BuildConfig.FLAVOR;
    private int versionCode = BuildConfig.VERSION_CODE;
    private String versionName = BuildConfig.VERSION_NAME;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build_config_display);

    }


}
