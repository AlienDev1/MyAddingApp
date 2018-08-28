package comqxe.example.user1.myaddingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/*
This application was made for my son Rakeem to help him with basic
mathematical skills as well as usage of sight words. This is his first calculator.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // My Code Begins

        Button addBtn = (Button) findViewById(R.id.addBtn);
        /*
        Button the keyword to create a button
        addBtn == addBtn I created this button on the app ( ADD )
        (Button) is the call to find the button created in the XML files
        findViewById(Parameter) = this method allows you to locate the item that
            was previously created.
        R = Resources
        id = pulls the class of all Id's created
        addBtn = the button that was created
        */
        addBtn.setOnClickListener(new View.OnClickListener() {

            // An on click event has been created
            // what the button does when clicked goes here

            @Override
            public void onClick(View view) {
               EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
               EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView restultText = (TextView) findViewById(R.id.resultText);

                // parsInt converts String to Integer
                // Pulls the Input as a Integer Via getText()
                // Then Converts back to a string Via toString()
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int result = num1 + num2;

                // nameOfField.setText(answer is converted to a string here)
                restultText.setText(result + "");


            }
        });
                    // Subtraction button is defined
        Button subtractBtn = (Button) findViewById(R.id.subtractBtn);
        subtractBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 - num2 ;

                resultText.setText(result + "");
            }
        });
                    // Multiply button is defined
        Button multiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        multiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 * num2;

                resultText.setText(result + "");
            }
        });
                    // Divide Button is defined
        Button divideBtn = (Button) findViewById(R.id.divideBtn);
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText firstNum = (EditText) findViewById(R.id.firstNumEditText);
                EditText secNum = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultText = (TextView) findViewById(R.id.resultText);

                int num = Integer.parseInt(firstNum.getText().toString());
                int sNum = Integer.parseInt(secNum.getText().toString());
                int res = num / sNum;

                resultText.setText(res + "");
            }

        });

    }
}

