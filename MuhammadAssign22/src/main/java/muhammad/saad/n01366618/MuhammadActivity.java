//Name: Muhammad Saad
//Section: RNA
//Student id: N01366618
package muhammad.saad.n01366618;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MuhammadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.Muhammadhelp:
                Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blazepizza.com/contact-us"));
                startActivity(web);
                return true;

            case R.id.Muhammadpizza:
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:6476420090"));
                startActivity(intent);
            default:
                return super.onOptionsItemSelected(item);

        }
    }

}