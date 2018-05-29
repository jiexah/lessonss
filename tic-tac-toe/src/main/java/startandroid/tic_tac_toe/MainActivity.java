package startandroid.tic_tac_toe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button turn;
    EditText number;
    ImageView x1;
    ImageView x2;
    ImageView x3;
    ImageView x4;
    ImageView x5;
    ImageView x6;
    ImageView x7;
    ImageView x8;
    ImageView x9;
    ImageView o1;
    ImageView o2;
    ImageView o3;
    ImageView o4;
    ImageView o5;
    ImageView o6;
    ImageView o7;
    ImageView o8;
    ImageView o9;
    int myArray[][] = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        turn = findViewById(R.id.turn);
        number = findViewById(R.id.number);

        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        o5 = findViewById(R.id.o5);
        o6 = findViewById(R.id.o6);
        o7 = findViewById(R.id.o7);
        o8 = findViewById(R.id.o8);
        o9 = findViewById(R.id.o9);
        x1 = findViewById(R.id.x1);
        x2 = findViewById(R.id.x2);
        x3 = findViewById(R.id.x3);
        x4 = findViewById(R.id.x4);
        x5 = findViewById(R.id.x5);
        x6 = findViewById(R.id.x6);
        x7 = findViewById(R.id.x7);
        x8 = findViewById(R.id.x8);
        x9 = findViewById(R.id.x9);

        turn.setOnClickListener(turn);
            @Override
            public void onClick(View v) {
                if (number.getText().equals(null)) {
                    //Toast.makeText(this, "Введите в какое поле хотите походить", Toast.LENGTH_LONG).show();
                } else {
                    int i = 1;
                        switch (number.getText().toString()) {
                            case "1":
                                if (i % 2 == 0) {
                                    o1.setVisibility(View.VISIBLE);
                                    myArray[1][1] = 0;
                                } else {
                                    x1.setVisibility(View.VISIBLE);
                                    myArray[1][1] = 1;
                                }
                                break;
                            case "2":
                                if (i % 2 == 0) {

                                    o2.setVisibility(View.VISIBLE);
                                    myArray[1][2] = 0;
                                } else {

                                    x2.setVisibility(View.VISIBLE);
                                    myArray[1][2] = 1;
                                }
                                break;
                            case "3":
                                if (i % 2 == 0) {

                                    o3.setVisibility(View.VISIBLE);
                                    myArray[1][3] = 0;
                                } else {

                                    x3.setVisibility(View.VISIBLE);
                                    myArray[1][3] = 1;
                                }
                                break;
                            case "4":
                                if (i % 2 == 0) {

                                    o4.setVisibility(View.VISIBLE);
                                    myArray[2][1] = 0;
                                } else {

                                    x4.setVisibility(View.VISIBLE);
                                    myArray[2][1] = 1;
                                }
                                break;
                            case "5":
                                if (i % 2 == 0) {

                                    o5.setVisibility(View.VISIBLE);
                                    myArray[2][2] = 0;
                                } else {

                                    x5.setVisibility(View.VISIBLE);
                                    myArray[2][2] = 1;
                                }
                                break;
                            case "6":
                                if (i % 2 == 0) {

                                    o6.setVisibility(View.VISIBLE);
                                    myArray[2][3] = 0;
                                } else {

                                    x6.setVisibility(View.VISIBLE);
                                    myArray[2][3] = 1;
                                }
                                break;
                            case "7":
                                if (i % 2 == 0) {

                                    o7.setVisibility(View.VISIBLE);
                                    myArray[3][1] = 0;
                                } else {

                                    x7.setVisibility(View.VISIBLE);
                                    myArray[3][1] = 1;
                                }
                                break;
                            case "8":
                                if (i % 2 == 0) {

                                    o8.setVisibility(View.VISIBLE);
                                    myArray[3][2] = 0;
                                } else {

                                    x8.setVisibility(View.VISIBLE);
                                    myArray[3][2] = 1;
                                }
                                break;
                            case "9":
                                if (i % 2 == 0) {
                                    o9.setVisibility(View.VISIBLE);
                                    myArray[3][3] = 0;
                                } else {
                                    x9.setVisibility(View.VISIBLE);
                                    myArray[3][3] = 1;
                                }
                                break;



                    }
                }

            }
        };
    }
}
