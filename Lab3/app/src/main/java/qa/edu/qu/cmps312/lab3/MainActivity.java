package qa.edu.qu.cmps312.lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String chapters[] = getResources().getStringArray(R.array.chapters_array);

        String chaptersConcat = "\n";
        for (String chapter : chapters){
            chaptersConcat += chapter + "\n";
        }

        TextView chaptersTv = (TextView) findViewById(R.id.chapters);
        chaptersTv.setText(chaptersConcat);
    }
}
