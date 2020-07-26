package mulenagbwalyajeff.languageemulator.emulator_solutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.R;
import mulenagbwalyajeff.languageemulator.emuator_questions.comp_one;
import mulenagbwalyajeff.languageemulator.emuator_questions.comp_two;

public class sol_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sol);
    }

    public void back(View view) {
        Intent question = new Intent(this, comp_two.class);
        startActivity(question);
    }
}