package com.example.guessanimal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.StackView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button dog,cat,squirrel;
    boolean isDog,isCat,isSquirrel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initClikers();
    }



    private void initClikers() {
        dog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(isDog){
                    isCat = false;
                    isSquirrel = false;
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isCat){
                    isDog = false;
                    isSquirrel = false;
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });

        squirrel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isSquirrel){
                    isDog = false;
                    isCat = false;
                    Toast.makeText(MainActivity.this, "Верно", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Не верно", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void initView() {
        imageView = findViewById(R.id.image_animal);
        dog = findViewById(R.id.dog_btn);
        cat = findViewById(R.id.cat_btn);
        squirrel = findViewById(R.id.squirrel_btn);
    }


    public void changeImage(View view) {
        switch (view.getId()){
            case R.id.change_image_btn1:
                imageView.setImageResource(R.drawable.dog);
                isDog = true;
                isCat = false;
                isSquirrel = false;
                break;

            case R.id.change_image_btn2:
                imageView.setImageResource(R.drawable.cat);
                isCat = true;
                isDog = false;
                isSquirrel = false;
                break;

            case R.id.change_image_btn3:
                imageView.setImageResource(R.drawable.squirrel);
                isSquirrel = true;
                isDog = false;
                isCat = false;
                break;
        }

    }
}