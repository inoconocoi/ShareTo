package noco.com.shareto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;


public class Register extends Activity implements View.OnClickListener{

    private LinearLayout back;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        back = (LinearLayout) findViewById(R.id.register_back);
        register = (Button) findViewById(R.id.register_submit);
        back.setOnClickListener(this);
        register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.register_back:
                finish();
                Intent intent = new Intent(this,Welcome.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right);
                break;
            case R.id.register_submit:

            break;
        }
    }

    private void HideKeyboard()//隐藏虚拟键盘
    {
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);//直接关闭打开的输入法，没开就不管
        inputMethodManager.hideSoftInputFromWindow(this.getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);//直接关闭打开的输入法，没开就不管
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        HideKeyboard();
        return super.onTouchEvent(event);
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent intent = new Intent(this,Welcome.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
}
