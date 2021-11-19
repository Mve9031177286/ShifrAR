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

        String newString = string.replace('б', 'ض');
        String newString1 = newString.replace('г', 'ص');
        String newString2 = newString1.replace('д', 'ث');
        String newString3 = newString2.replace('ж', 'ق');
        String newString4 = newString3.replace('з', 'ف');
        String newString5 = newString4.replace('й', 'غ');
        String newString6 = newString5.replace('л', 'ع');
        String newString7 = newString6.replace('п', 'ه');
        String newString8 = newString7.replace('ф', 'خ');
        String newString9 = newString8.replace('ц', 'ح');
        String newString10 = newString9.replace('ч', 'ج');
        String newString11 = newString10.replace('ш', 'د');
        String newString12 = newString11.replace('щ', 'ش');
        String newString13 = newString12.replace('ы', 'س');
        String newString14 = newString13.replace('ь', 'ي');
        String newString15 = newString14.replace('ъ', 'ب');
        String newString16 = newString15.replace('э', 'ل');
        String newString17 = newString16.replace('ю', 'ا');
        String newString18 = newString17.replace('я', 'ت');
        String newString19 = newString18.replace('1', 'ن');
        String newString20 = newString19.replace('2', 'م');
        String newString21 = newString20.replace('3', 'ك');
        String newString22 = newString21.replace('4', 'ط');
        String newString23 = newString22.replace('5', 'ئ');
        String newString24 = newString23.replace('6', 'ء');
        String newString25 = newString24.replace('7', 'ؤ');
        String newString26 = newString25.replace('8', ' ');
        String newString27 = newString26.replace('а', 'ر');
        String newString29 = newString27.replace('м', 'ى');
        String newString30 = newString29.replace('т', 'ة');
        String newString31 = newString30.replace('у', 'و');
        String newString32 = newString31.replace('р', 'ز');
        String newString33 = newString32.replace('с', 'ظ');

        return newString33;
    }
}