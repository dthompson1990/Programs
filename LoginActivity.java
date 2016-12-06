/**
 * @Author Ricky Clevinger
 * LoginActivity.java
 */

package ricky.bookcomparison;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.UserText);
        password = (EditText) findViewById(R.id.PassText);
        password.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }

    public void openDatabaseActivity(View view) {
        String user = username.getText().toString();
        String pass = password.getText().toString();

        if (new String("Group7").equals(user) && new String("Nonce").equals(pass)) {
            Intent intent = new Intent(this, DatabaseActivity.class);
            startActivity(intent);
        }
        else {
            username.setText("");
            password.setText("");
            Toast.makeText(getBaseContext(), "Incorrect Username/Password Combination",
                    Toast.LENGTH_LONG).show();
        }

    }

    public void openHomeActivity(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }


}
