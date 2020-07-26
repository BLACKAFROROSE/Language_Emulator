package mulenagbwalyajeff.languageemulator.emulator_solutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.R;
import mulenagbwalyajeff.languageemulator.emuator_questions.comp_one;

public class sol_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sol_one);
    }

    public void question1(View view) {
        Intent question = new Intent(this, comp_one.class);
        startActivity(question);
    }
}