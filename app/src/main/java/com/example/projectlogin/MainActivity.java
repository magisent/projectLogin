package com.example.projectlogin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Đảm bảo tên layout đúng

        // Liên kết các thành phần giao diện
        EditText usernameInput = findViewById(R.id.username_input);
        EditText passwordInput = findViewById(R.id.password_input);
        Button loginButton = findViewById(R.id.login_btn);
        TextView displayText = findViewById(R.id.display_text);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameInput.getText().toString();
                String password = passwordInput.getText().toString();

                // Kiểm tra nếu cần thiết (ví dụ: không để trống)
                if (!username.isEmpty() && !password.isEmpty()) {
                    // Hiển thị thông tin đã nhập
                    displayText.setText("Username: " + username + "\nPassword: " + password);
                    displayText.setVisibility(View.VISIBLE);
                } else {
                    displayText.setText("Vui lòng nhập đầy đủ tên người dùng và mật khẩu.");
                    displayText.setVisibility(View.VISIBLE);
                }
            }
        });

        // Nếu bạn có các nút mạng xã hội, bạn có thể thêm sự kiện click tương tự ở đây
    }
}
