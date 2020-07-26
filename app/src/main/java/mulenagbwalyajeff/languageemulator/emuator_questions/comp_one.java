package mulenagbwalyajeff.languageemulator.emuator_questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.R;
import mulenagbwalyajeff.languageemulator.emulator_solutions.sol_one;

public class comp_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_one);
    }

    public void question1(View view) {
        Intent question = new Intent(this, comp_two.class);
        startActivity(question);
    }

    public void sol_one(View view) {
        Intent solution = new Intent(this, sol_one.class);
        startActivity(solution);
    }
}