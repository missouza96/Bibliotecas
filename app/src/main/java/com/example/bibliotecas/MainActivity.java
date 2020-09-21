package com.example.bibliotecas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bibliotecas.databinding.ActivityMainBinding;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        //view usando viewBinding
        img = binding.imgView;

        //add imagem da url
        String url = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRdFsoSv6bA_GXMkdj2w7ZJ9kozYJrANY_L1A&usqp=CAU";

        //mostrar imagem usando picasso
        Picasso.get().load(url).into(img);
    }
}
