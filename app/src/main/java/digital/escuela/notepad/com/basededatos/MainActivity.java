package digital.escuela.notepad.com.basededatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
    EditText usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usuario=(EditText) findViewById(R.id.usuar);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("user",usuario.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        usuario.setText(savedInstanceState.getString("user"));

    }
     */
}

/*
A la hora de voltear el app se borra NO ES UN BUG
Se crea una activity automaticamente de la nada
https://developer.android.com/reference/android/app/Activity.html
(Lo de colores son ESTADOS)
Activity Launched
Activity Running
Activity Shutdown
*/

