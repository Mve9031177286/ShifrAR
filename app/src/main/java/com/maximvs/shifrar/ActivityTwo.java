package com.maximvs.shifrar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    private Button buttonDeCrypt;
    private Button buttonDeleteAllTwo;
    private Button buttonGoCrypt;
    private EditText editTextCryptTwo;
    private TextView editTextDeCrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        buttonDeCrypt = (Button) findViewById(R.id.buttonDeCrypt);
        buttonDeleteAllTwo = (Button) findViewById(R.id.buttonDeleteAllTwo);
        buttonGoCrypt = (Button) findViewById(R.id.buttonGoCrypt);
        editTextCryptTwo = (EditText) findViewById(R.id.editTextCryptTwo);
        editTextDeCrypt = (TextView) findViewById(R.id.editTextDeCrypt);

        buttonDeCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextCryptTwo.getText().length() == 0)
                    Toast.makeText(ActivityTwo.this, R.string.instruction5, Toast.LENGTH_SHORT).show();
                else {
                    String eTextCry = editTextCryptTwo.getText().toString();
                    editTextDeCrypt.setText(decrypter(eTextCry));
                }
            }
        });

        buttonDeleteAllTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextDeCrypt.setText(" ");
                editTextCryptTwo.setText(" ");
            }
        });

        buttonGoCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public static String decrypter(String string) {

        String newString = string.replace('??', '??');
        String newString1 = newString.replace('??', '??');
        String newString2 = newString1.replace('??', '??');
        String newString3 = newString2.replace('??', '??');
        String newString4 = newString3.replace('??', '??');
        String newString5 = newString4.replace('??', '??');
        String newString6 = newString5.replace('??', '??');
        String newString7 = newString6.replace('??', '??');
        String newString8 = newString7.replace('??', '??');
        String newString9 = newString8.replace('??', '??');
        String newString10 = newString9.replace('??', '??');
        String newString11 = newString10.replace('??', '??');
        String newString12 = newString11.replace('??', '??');
        String newString13 = newString12.replace('??', '??');
        String newString14 = newString13.replace('??', '??');
        String newString15 = newString14.replace('??', '??');
        String newString16 = newString15.replace('??', '??');
        String newString17 = newString16.replace('??', '??');
        String newString18 = newString17.replace('??', '??');
        String newString19 = newString18.replace('1', '??');
        String newString20 = newString19.replace('2', '??');
        String newString21 = newString20.replace('3', '??');
        String newString22 = newString21.replace('4', '??');
        String newString23 = newString22.replace('5', '??');
        String newString24 = newString23.replace('6', '??');
        String newString25 = newString24.replace('7', '??');
        String newString26 = newString25.replace('8', ' ');
        String newString27 = newString26.replace('??', '??');
        String newString29 = newString27.replace('??', '??');
        String newString30 = newString29.replace('??', '??');
        String newString31 = newString30.replace('??', '??');
        String newString32 = newString31.replace('??', '??');
        String newString33 = newString32.replace('??', '??');

        return newString33;
    }
}