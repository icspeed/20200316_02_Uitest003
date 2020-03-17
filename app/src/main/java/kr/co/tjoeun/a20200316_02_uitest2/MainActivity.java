package kr.co.tjoeun.a20200316_02_uitest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView FindPwTxt = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);

//        로그인 버튼의 글자를 = 회원가입으로 바꾸자.
        loginBtn.setText("회원가입");

//        비밀번호 찾기 텍스트뷰 => JAVA에서 "비번 찾기"로 바꿔보기
//        findPwTxt 로 id로 부여하자.

        FindPwTxt = findViewById(R.id.findPwTxt);

        FindPwTxt.setText("비번 찾기");

//        로그인 버튼이 눌리면 => 비번 찾기 버튼을 "AAA"로 변경

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FindPwTxt.setText("AAA")

            }
        });
//      클릭은 버튼 뿐 아니라 모든 뷰가 다 눌릴 수 있다. => 텍스트뷰도 클릭.

        FindPwTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FindPwTxt.setText("비밀번호 찾기");
            }
        });
    }
}
