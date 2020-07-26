package mulenagbwalyajeff.languageemulator.didyouknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import mulenagbwalyajeff.languageemulator.R;

public class didyouknow1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_didyouknow1);
    }

    public void diduknow2(View view) {
        Intent diduknow2 = new Intent(this,didyouknow2.class );
        startActivity(diduknow2);
    }
}