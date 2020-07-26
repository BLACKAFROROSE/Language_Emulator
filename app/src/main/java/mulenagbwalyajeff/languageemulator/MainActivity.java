package mulenagbwalyajeff.languageemulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import mulenagbwalyajeff.languageemulator.didyouknow.didyouknow1;
import mulenagbwalyajeff.languageemulator.emuator_questions.comp_one;

public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn =findViewById(R.id.beginbutton);
    }

    public void begin_emu(View view) {
        Intent diduknow1 = new Intent(this, didyouknow1.class);
        startActivity(diduknow1);

    }

    public void question(View view) {
        Intent question = new Intent(this, comp_one.class);
        startActivity(question);
    }
}