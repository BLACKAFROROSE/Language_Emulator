package mulenagbwalyajeff.languageemulator.emuator_questions;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.MainActivity;
import mulenagbwalyajeff.languageemulator.R;
import mulenagbwalyajeff.languageemulator.emulator_solutions.sol_three;

public class comp_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp_three);
    }

    public void question3(View view) {
        Intent question = new Intent(this, MainActivity.class);
        startActivity(question);
    }

    public void sol(View view) {
        Intent question = new Intent(this, sol_three.class);
        startActivity(question);
    }
}