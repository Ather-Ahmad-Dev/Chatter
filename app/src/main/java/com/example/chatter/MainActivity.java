package com.example.chatter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.chatter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // TODO: Change the color of Edit Text's Layout. Cant do via xml.
        //       Hint: Use onFocusedChangeListener
        // TODO: If number input contain any characters, update helper text.
        // TODO: Put a helper text below edit text. Login, Logo is already added with name "Visibility"
        //       change text type from password to text on logo clicked.
        // TODO: Set Conditions for login's edit text and password
        //       e.g if password limit is reached show some text, same with numbers
        // TODO: Check pass and phone via firebase
        // TODO: Make Screen go up while typing in fields like password.

    }

    @Override
    protected void onResume() {
        super.onResume();

        binding.signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        binding.login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(MainActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}