package noco.com.shareto;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Welcome extends Activity implements View.OnClickListener{

    private Button register,login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        register = (Button) findViewById(R.id.register);
        login = (Button) findViewById(R.id.login);
        register.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register:
                finish();
                Intent intent1 = new Intent(this,Register.class);
                startActivity(intent1);
                overridePendingTransition(R.anim.right_in, R.anim.left_out);
                break;
            case R.id.login:
                finish();
                Intent intent = new Intent(this,Login.class);
                startActivity(intent);
                overridePendingTransition(R.anim.right_in,R.anim.left_out);
        }
    }
}
