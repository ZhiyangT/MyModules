package sg.edu.rp.c346.mymodules;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C346, C349;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.textView1);
        C349 = findViewById(R.id.textView2);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module","C346");
                intent.putExtra("ModuleName","Android Programming");
                intent.putExtra("ModuleYear",2018);
                intent.putExtra("ModuleSemester",1);
                intent.putExtra("ModuleCredit",1);
                intent.putExtra("ModuleVenue","W66M");
                startActivity(intent);
            }
        });

        C349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("Module","C349");
                intent.putExtra("ModuleName","IPad Programming");
                intent.putExtra("ModuleYear",2018);
                intent.putExtra("ModuleSemester",1);
                intent.putExtra("ModuleCredit",1);
                intent.putExtra("ModuleVenue","W66R");
                startActivity(intent);
            }
        });
    }
}
