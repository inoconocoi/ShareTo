package noco.com.shareto;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class Login extends Activity implements View.OnClickListener{

    private LinearLayout back;
    private Button loginSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        back = (LinearLayout) findViewById(R.id.login_back);
        loginSubmit = (Button) findViewById(R.id.login_submit);
        back.setOnClickListener(this);
        loginSubmit.setOnClickListener(this);
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
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_back:
                finish();
                Intent intent = new Intent(this,Welcome.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
                break;
            case R.id.login_submit:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
        Intent intent = new Intent(this,Welcome.class);
        startActivity(intent);
        overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);
    }
}
