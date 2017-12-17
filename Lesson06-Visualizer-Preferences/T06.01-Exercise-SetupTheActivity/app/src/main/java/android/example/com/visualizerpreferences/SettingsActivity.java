package android.example.com.visualizerpreferences;

import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

// DONE (1) Create a new Empty Activity named SettingsActivity; make sure to generate the
// activity_settings.xml layout file as well and add the activity to the manifest

// DONE (2) Add a new resource folder called menu and create visualizer_menu.xml
// DONE (3) In visualizer_menu.xml create a menu item with a single item. The id should be
// "action_settings", title should be saved in strings.xml, the item should never
// be shown as an action, and orderInCategory should be 100
public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }
}
