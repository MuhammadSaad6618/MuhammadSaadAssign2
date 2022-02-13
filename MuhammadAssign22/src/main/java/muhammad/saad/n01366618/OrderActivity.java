package muhammad.saad.n01366618;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Intent intent = getIntent();
        String newTxt = intent.getStringExtra(MuhammadActivity.extxt);
        TextView ab = (TextView) findViewById(R.id.Muhammadtv1);
        ab.setText(newTxt);
    }
}