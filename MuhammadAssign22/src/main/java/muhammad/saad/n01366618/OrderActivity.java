package muhammad.saad.n01366618;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

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

    public void validate(View view) {
        Intent act = new Intent(this, PaymentActivity.class);
        startActivity(act);

    }
}