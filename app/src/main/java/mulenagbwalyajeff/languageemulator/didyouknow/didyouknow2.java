package mulenagbwalyajeff.languageemulator.didyouknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.R;

public class didyouknow2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_didyouknow2);
    }

    public void diduknow3(View view) {
        Intent diduknow3 = new Intent(this,didyouknow3.class);
        startActivity(diduknow3);
    }
}