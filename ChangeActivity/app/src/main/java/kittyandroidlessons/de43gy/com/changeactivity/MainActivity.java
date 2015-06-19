package kittyandroidlessons.de43gy.com.changeactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

    //Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // btnSend = (Button) findViewById(R.id.btnSend);
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

    public void onClickAndSendMessage(View view) {
        EditText etEnterFrom = (EditText) findViewById(R.id.etEnterFrom);
        EditText etEnterWhom = (EditText) findViewById(R.id.etEnterWhom);
        EditText etEnterDescription = (EditText) findViewById(R.id.etEnterDescription);

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        intent.putExtra("from", etEnterFrom.getText().toString());
        intent.putExtra("username", etEnterWhom.getText().toString());
        intent.putExtra("description", etEnterDescription.getText().toString());
        startActivity(intent);
    }
}
