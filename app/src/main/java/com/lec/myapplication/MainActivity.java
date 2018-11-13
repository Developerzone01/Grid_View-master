package com.lec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
GridView gridView;
ArrayList<Cartoon> cartoons= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gv_cartoon);

        Cartoon cartoon=new Cartoon();
        Cartoon cartoon2=new Cartoon();
        Cartoon cartoon3=new Cartoon();
        Cartoon cartoon4=new Cartoon();
        Cartoon cartoon5=new Cartoon();
        Cartoon cartoon6=new Cartoon();
        Cartoon cartoon7=new Cartoon();

        cartoon.setName("Dore");
        cartoon.setDescription("Doreamone");
        cartoon.setThumbnail(R.drawable.dore);

        cartoon2.setName("Frozon");
        cartoon2.setDescription("Frozon");
        cartoon2.setThumbnail(R.drawable.froz);

        cartoon3.setName("kiracso");
        cartoon3.setDescription("Kitracsu_Teen Ka Daba");
        cartoon3.setThumbnail(R.drawable.kit);

        cartoon4.setName("Rapunzel");
        cartoon4.setDescription("Rapunzel");
        cartoon4.setThumbnail(R.drawable.rapun);

        cartoon5.setName("Ice_Bear");
        cartoon5.setDescription("We_are_Bears");
        cartoon5.setThumbnail(R.drawable.bear);

        cartoon6.setName("Oggy");
        cartoon6.setDescription("Oggy And Cacroches");
        cartoon6.setThumbnail(R.drawable.oggy);

        cartoon7.setName("Raju");
        cartoon7.setDescription("Mighty_Raju");
        cartoon7.setThumbnail(R.drawable.raju);

        cartoons.add(cartoon);
        cartoons.add(cartoon2);
        cartoons.add(cartoon3);
        cartoons.add(cartoon4);
        cartoons.add(cartoon5);
        cartoons.add(cartoon6);
        cartoons.add(cartoon7);

        gridView.setAdapter(new CartoonAdapter(cartoons,this));





    }
}
