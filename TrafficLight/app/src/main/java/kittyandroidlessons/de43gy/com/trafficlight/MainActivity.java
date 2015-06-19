package kittyandroidlessons.de43gy.com.trafficlight;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Button mBtnRed, mBtnYellow, mBtnGreen;
    private TextView mTVWhatTheColor;
    private RelativeLayout mRelativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnRed = (Button) findViewById(R.id.btnRed);
        mBtnYellow = (Button) findViewById(R.id.btnYellow);
        mBtnGreen = (Button) findViewById(R.id.btnGreen);
        mTVWhatTheColor = (TextView) findViewById(R.id.tvWhatTheColor);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        mBtnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                mTVWhatTheColor.setText(R.string.text_green);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.greenColor));
            }
        });

        mBtnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTVWhatTheColor.setText(R.string.text_yellow);
                mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.yellowColor));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onRedButtonClick(View view){
        mTVWhatTheColor.setText(R.string.text_red);
        mRelativeLayout.setBackgroundColor(getResources().getColor(R.color.redColor));
    }
}
