package sg.edu.rp.c346.mymodules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button bBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.textView);
        bBack = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String module = intentReceived.getStringExtra("Module");
        String moduleName = intentReceived.getStringExtra("ModuleName");
        int moduleSemester = intentReceived.getIntExtra("ModuleSemester",0);
        int moduleYear = intentReceived.getIntExtra("ModuleYear",0);
        int moduleCredit = intentReceived.getIntExtra("ModuleCredit",0);
        String moduleVenue = intentReceived.getStringExtra("ModuleVenue");

       String output=  String.format("Module Code: %s\n Module Name: %s\n Academic Year: %d\n Semester: %d\n Module Credit: %d \nVenue: %s",module,moduleName,moduleYear,moduleSemester,moduleCredit,moduleVenue);

        tvDisplay.setText(output);

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
