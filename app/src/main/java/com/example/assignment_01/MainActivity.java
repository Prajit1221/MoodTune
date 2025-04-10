package com.example.assignment_01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText playlist_name;
    RadioButton happy,sad,relaxed,energetic;
    Button go;
    String n,m,g;
    Spinner gender;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        playlist_name=findViewById(R.id.playlist_name);
        happy=findViewById(R.id.happy);
        sad=findViewById(R.id.sad);
        relaxed=findViewById(R.id.relaxed);
        energetic=findViewById(R.id.energetic);
        go=findViewById(R.id.go);
        gender=findViewById(R.id.gender);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                g=gender.getSelectedItem().toString();
                n= playlist_name.getText().toString();
                if (happy.isChecked()){
                    m= "happy";
                } else if (sad.isChecked()){
                    m="sad";
                }else if (relaxed.isChecked()){
                    m= "relaxed";
                }else if (energetic.isChecked()) {
                    m= "energetic";
                }
                Intent playlist=new Intent(getApplicationContext(), Playlist.class);
                playlist.putExtra("name",n);
                playlist.putExtra("mood",m);
                playlist.putExtra("gender",g);
                startActivity(playlist);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}