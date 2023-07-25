package jp.suntech.s22020.kadai12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HelloListener listener = new HelloListener();

        Button btSend = findViewById(R.id.btSend);
        btSend.setOnClickListener(listener);

        Button btConfirm = findViewById(R.id.btConfirm);
        btConfirm.setOnClickListener(listener);

        Button btClear = findViewById(R.id.btClear);
        btClear.setOnClickListener(listener);

    }

    private class HelloListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            EditText name = findViewById(R.id.etName);
            EditText mail = findViewById(R.id.etMail);
            EditText mailtitle = findViewById(R.id.etMailTitle);
            EditText commment = findViewById(R.id.etComment);

            String name_st = name.getText().toString();
            String mail_st = mail.getText().toString();
            String mailtitle_st = mailtitle.getText().toString();
            String comment_st = commment.getText().toString();

            ConfirmDialogFragment dialogFragment = new ConfirmDialogFragment();

            int id = v.getId();
            int id_dia = dialogFragment.getId();
            //送信
            if(id == R.id.btSend){
                String show = "名前："+name_st+"　メールアドレス："+mail_st+"　メールタイトル："+mailtitle_st+"　内容："+comment_st;
                Snackbar.make(v,show, Snackbar.LENGTH_LONG).show();
            }
            //クリア
            if(id == R.id.btClear){
                name.setText("");
                mail.setText("");
                mailtitle.setText("");
                commment.setText("");
            }
            //確認
            if(id == R.id.btConfirm) {
                dialogFragment.show(getSupportFragmentManager(), "ConfirmDialogFragment");
                    String show = "名前：" + name_st + "　メールアドレス：" + mail_st + "　メールタイトル：" + mailtitle_st + "　内容：" + comment_st;
                    Snackbar.make(v, show, Snackbar.LENGTH_LONG).show();

            }

            }
        }
    }
