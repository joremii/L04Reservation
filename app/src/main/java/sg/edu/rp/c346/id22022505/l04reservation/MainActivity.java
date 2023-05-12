package sg.edu.rp.c346.id22022505.l04reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    TextView name;
    TextView number;
    RadioGroup paxGroup;
    DatePicker dp;
    TimePicker tp;
    ToggleButton tbtnArea;
    Button confirm;
    Button reset;
    TextView tvDisplay;
    RadioButton one;
    RadioButton two;
    RadioButton three;
    RadioButton four;
    RadioButton five;
    RadioButton six;
    RadioButton seven;
    RadioButton eight;

    Integer pax = 0;
    String area = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameID);
        number = findViewById(R.id.numberID);
        paxGroup = findViewById(R.id.paxGroup);
        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        tbtnArea = findViewById(R.id.toggleButtonArea);
        confirm = findViewById(R.id.buttonConfirm);
        reset = findViewById(R.id.buttonReset);
        tvDisplay = findViewById(R.id.textViewDisplay);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();

                if (one.isChecked()) {
                    pax = 1;
                } else if (two.isChecked()) {
                    pax = 2;
                } else if (three.isChecked()) {
                    pax = 3;
                } else if (four.isChecked()) {
                    pax = 4;
                } else if (five.isChecked()) {
                    pax = 5;
                } else if (six.isChecked()) {
                    pax = 6;
                } else if (seven.isChecked()) {
                    pax = 7;
                } else if (eight.isChecked()) {
                    pax = 8;
                }

                if (tbtnArea.isChecked()) {
                    area = "Non-Smoking";
                } else {
                    area = "Smoking";
                }

                String stringName = name.getText().toString();
                String stringNumber = number.getText().toString();
                String stringPax = pax.toString();
                String day = String.valueOf(dp.getDayOfMonth());
                String month = String.valueOf(dp.getMonth() + 1);
                String year = String.valueOf(dp.getYear());
                String dateDisplay = day + "/" + month + "/" + year;
                String hour = String.valueOf(tp.getHour());
                String minute = String.valueOf(tp.getMinute());
                String timeDisplay = hour + ":" + minute;

                tvDisplay.setText(stringName + " " + stringNumber + " " + stringPax + " " + dateDisplay + " " + timeDisplay + " " + area);
            }
        });
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                tp.setHour(19);
                tp.setMinute(30);
                dp.updateDate(2020,5,01);
            }
        });
    }
}
