package watchtower.stain;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void goToQuestionOne(View v)
    {
        Intent intent = new Intent(this, QuestionOne.class);
        startActivity(intent);
        finish();

    }
}
