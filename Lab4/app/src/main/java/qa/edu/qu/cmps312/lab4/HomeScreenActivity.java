package qa.edu.qu.cmps312.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
    }

    public void exit(View view){
        finish();

    }

    public void openPlanetActivity(View view){
        Intent intent = new Intent(HomeScreenActivity.this, PlanetsActivity.class);
        startActivity(intent);

    }
}

