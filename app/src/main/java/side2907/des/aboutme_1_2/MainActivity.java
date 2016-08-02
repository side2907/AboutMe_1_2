package side2907.des.aboutme_1_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView list_of_wic = (TextView) findViewById(R.id.textView5);
        list_of_wic.setText("");
        String[] tmp = getResources().getStringArray(R.array.what_i_can);
        for (int i = 0; i < tmp.length; i++) {
            list_of_wic.setText(list_of_wic.getText()+">> "+tmp[i]+( i < tmp.length - 1  ? "\n":""));
        }
    }
}
