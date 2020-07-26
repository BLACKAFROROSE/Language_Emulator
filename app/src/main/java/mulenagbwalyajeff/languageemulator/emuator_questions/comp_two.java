package mulenagbwalyajeff.languageemulator.emuator_questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.R;
import mulenagbwalyajeff.languageemulator.emulator_solutions.sol_two;

public class comp_two extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_two);
    }

    public void question2(View view) {
        Intent question = new Intent(this, comp_three.class);
        startActivity(question);
    }

    public void soltwo(View view) {
        Intent sol = new Intent(this, sol_two.class);
        startActivity(sol);
    }
}