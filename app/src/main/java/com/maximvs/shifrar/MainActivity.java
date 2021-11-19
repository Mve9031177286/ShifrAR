package com.maximvs.shifrar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button buttonCrypt;
    private Button buttonCopy;
    private Button buttonDeleteAll;
    private Button buttonGoDeCrypt;
    private EditText editTextInput;
    private TextView editTextCrypt;

    ClipboardManager clipboardManager;
    ClipData clipData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCrypt = (Button) findViewById(R.id.buttonCrypt);
        buttonCopy = (Button) findViewById(R.id.buttonCopy);
        buttonDeleteAll = (Button) findViewById(R.id.buttonDeleteAll);
        buttonGoDeCrypt = (Button) findViewById(R.id.buttonGoDeCrypt);
        editTextInput = (EditText) findViewById(R.id.editTextInput);
        editTextCrypt = (TextView) findViewById(R.id.editTextCrypt);

        clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        buttonCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextInput.getText().length() == 0)
                    Toast.makeText(MainActivity.this, R.string.instruction, Toast.LENGTH_SHORT).show();
                else {
                    String eTextInp = editTextInput.getText().toString();
                    editTextCrypt.setText(crypter(eTextInp));
                }
            }
        });

        buttonDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextInput.setText(" ");
                editTextCrypt.setText(" ");
            }
        });

        buttonGoDeCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        });

        buttonCopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String eTextCry = editTextCrypt.getText().toString();
                clipData = ClipData.newPlainText("text", eTextCry);
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(MainActivity.this, R.string.textCopy, Toast.LENGTH_SHORT).show();
            }
        });
    }

    public static String crypter(String string) {

        String newString = string.replace('ض', 'б');
        String newString1 = newString.replace('ص', 'г');
        String newString2 = newString1.replace('ث', 'д');
        String newString3 = newString2.replace('ق', 'ж');
        String newString4 = newString3.replace('ف', 'з');
        String newString5 = newString4.replace('غ', 'й');
        String newString6 = newString5.replace('ع', 'л');
        String newString7 = newString6.replace('ه', 'п');
        String newString8 = newString7.replace('خ', 'ф');
        String newString9 = newString8.replace('ح', 'ц');
        String newString10 = newString9.replace('ج', 'ч');
        String newString11 = newString10.replace('د', 'ш');
        String newString12 = newString11.replace('ش', 'щ');
        String newString13 = newString12.replace('س', 'ы');
        String newString14 = newString13.replace('ي', 'ь');
        String newString15 = newString14.replace('ب', 'ъ');
        String newString16 = newString15.replace('ل', 'э');
        String newString17 = newString16.replace('ا', 'ю');
        String newString18 = newString17.replace('ت', 'я');
        String newString19 = newString18.replace('ن', '1');
        String newString20 = newString19.replace('م', '2');
        String newString21 = newString20.replace('ك', '3');
        String newString22 = newString21.replace('ط', '4');
        String newString23 = newString22.replace('ئ', '5');
        String newString24 = newString23.replace('ء', '6');
        String newString25 = newString24.replace('ؤ', '7');
        String newString26 = newString25.replace(' ', '8');
        String newString27 = newString26.replace('ر', 'а');
        String newString29 = newString27.replace('ى', 'м');
        String newString30 = newString29.replace('ة', 'т');
        String newString31 = newString30.replace('و', 'у');
        String newString32 = newString31.replace('ز', 'р');
        String newString33 = newString32.replace('ظ', 'с');

        return newString33;
    }
}