package com.itheima74.toggleview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.itheima74.toggleview.ui.ToggleView;
import com.itheima74.toggleview.ui.ToggleView.OnSwitchStateUpdateListener;

public class MainActivity extends Activity {

    private ToggleView toggleView;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        toggleView = (ToggleView) findViewById(R.id.toggleView);
//        toggleView.setSwitchBackgroundResource(R.drawable.switch_background);
//        toggleView.setSlideButtonResource(R.drawable.slide_button);
//        toggleView.setSwitchState(true);
//        
        // 设置开关更新监听
        toggleView.setOnSwitchStateUpdateListener(new OnSwitchStateUpdateListener(){

			@Override
			public void onStateUpdate(boolean state) {
				Toast.makeText(getApplicationContext(), "state: " + state, 0).show();
			}
        	
        });
    }

//	@Override
//	protected void onResume() {
//		super.onResume();
//	}
//    
}
