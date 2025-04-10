package com.example.assignment_01;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Playlist extends AppCompatActivity {

    TextView name;
    ImageView img;
    String n,mo,g,url;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_playlist);
        name=findViewById(R.id.name);
        img=findViewById(R.id.img);
        Intent play=getIntent();
        n=play.getStringExtra("name");
        mo=play.getStringExtra("mood");
        g=play.getStringExtra("gender");
        name.setText(n);
        if (g.equals("Male")){
            if (mo.equals("happy")){
                img.setImageResource(R.drawable.happy);
            } else if (mo.equals("sad")) {
                img.setImageResource(R.drawable.sad);
            }else if (mo.equals("relaxed")) {
                img.setImageResource(R.drawable.relaxed);
            }else if(mo.equals("energetic")){
                img.setImageResource(R.drawable.energetic);
            }
        } else if(g.equals("Female")){
            if (mo.equals("happy")){
                img.setImageResource(R.drawable.happyf);
            } else if (mo.equals("sad")) {
                img.setImageResource(R.drawable.sadf);
            }else if (mo.equals("relaxed")) {
                img.setImageResource(R.drawable.relaxf);
            }else if(mo.equals("energetic")){
                img.setImageResource(R.drawable.energeticf);
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void songs(View view) {
        if (g.equals("Male")){
            if (mo.equals("happy")){
                url="https://youtu.be/gSaaNGMPl_g?si=2tKACRCgBjFPIQZJ";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            } else if (mo.equals("sad")) {
                url="https://youtu.be/KwiDJclWo44?si=NDQHhdlyXOsy-oA7";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }else if (mo.equals("relaxed")) {
                url="https://youtu.be/ZdFIOTWP4Og?si=GyrkrLq1PFjL7U1f";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }else if(mo.equals("energetic")){
                url="https://youtu.be/hciqzK-jlns?si=JK4SiBAGZfU0o1HG";
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }
        } else if(g.equals("Female")) {
            if (mo.equals("happy")) {
                url = "https://youtu.be/nD1jhw6F-J4?si=UQQgbZzayaYKoTcS";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            } else if (mo.equals("sad")) {
                url = "https://youtu.be/vzlXfZlH5dk?si=438U-J1as1679B39";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            } else if (mo.equals("relaxed")) {
                url = "https://youtu.be/H2f7MZaw3Yo?si=Q5mPumZxmbnszozj";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            } else if (mo.equals("energetic")) {
                url = "https://youtu.be/zC3UbTf4qrM?si=t1HFKfN1lJvrH55D";
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(i);
            }

        }
    }
}
