package mulenagbwalyajeff.languageemulator.didyouknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.MainActivity;
import mulenagbwalyajeff.languageemulator.R;

public class didyouknow3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_didyouknow3);
    }

    public void home(View view) {
        Intent backtohome = new Intent(this, MainActivity.class);
        startActivity(backtohome);
    }
}