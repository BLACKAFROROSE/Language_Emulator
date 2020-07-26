package mulenagbwalyajeff.languageemulator.emulator_solutions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.MainActivity;
import mulenagbwalyajeff.languageemulator.R;
import mulenagbwalyajeff.languageemulator.emuator_questions.comp_three;

public class sol_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sol_three);
    }

    public void back(View view) {
        Intent question = new Intent(this, comp_three.class);
        startActivity(question);
    }
}