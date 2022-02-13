//Name: Muhammad Saad
//Section: RNA
//Student id: N01366618
package muhammad.saad.n01366618;

import static muhammad.saad.n01366618.R.*;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MuhammadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case id.Muhammadhelp:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blazepizza.com/contact-us"));
                startActivity(web);
                return true;

            case id.Muhammadpizza:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6476420090"));
                startActivity(intent);

            case id.Muhammad:
                View myLayout = findViewById(id.MuhammadLayout);

                Snackbar.make(myLayout, "Our Pizza Is So Good!", Snackbar.LENGTH_LONG).show();


            default:
                return super.onOptionsItemSelected(item);

        }
    }

    public void myToastMsg1(View view) {
        Context context = getApplicationContext();
        CharSequence text = "You have selected Pizza Pizza";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void myToastMsg2(View view) {
        Context context = getApplicationContext();
        CharSequence text = "You have selected Dominos";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void myToastMsg3(View view) {
        Context context = getApplicationContext();
        CharSequence text = "You have selected Pizza Depot";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void myToastMsg4(View view) {
        Context context = getApplicationContext();
        CharSequence text = "You have selected the pizza box";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void nextButtonClicked(View view) {
        RadioButton bt1 = findViewById(R.id.MuhammadRB1);
        RadioButton bt2 = findViewById(R.id.MuhammadRB2);
        RadioButton bt3 = findViewById(R.id.MuhammadRB3);
        RadioButton bt4 = findViewById(R.id.MuhammadRB4);

        if(bt1.isChecked()) {
           launch();
       }

       if(bt2.isChecked()){
           launch();
       }

        if(bt3.isChecked()){
            launch();
        }

        if(bt4.isChecked()){
            launch();
        }
    }


    void launch() {
        Intent act = new Intent(this, OrderActivity.class);
        startActivity(act);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder((this)).setMessage("Do you want to stay on app or exit ")
                .setCancelable(false).setPositiveButton("Exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        }).setNegativeButton("Stay",null)
                .show();
    }



}