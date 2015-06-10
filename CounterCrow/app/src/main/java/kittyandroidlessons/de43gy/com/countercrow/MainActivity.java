package kittyandroidlessons.de43gy.com.countercrow;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    private Button mCrowCounter;
    private int mCounter = 0;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCrowCounter = (Button) findViewById(R.id.crowsCounter);
        mInfoTextView = (TextView) findViewById(R.id.InfoTextView);

        mCrowCounter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mCounter++;
                if (mCounter<=1){
                    mInfoTextView.setText("We counted " + mCounter + " Crow");
                }else{
                        mInfoTextView.setText("We counted " + mCounter + " Crows");
                }
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

    public void onClick(View view) {
        mInfoTextView.setText("Hello Kitty!!!");
    }
}
