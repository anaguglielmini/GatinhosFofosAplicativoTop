package com.example.gatinhosfofosaplicativotop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dl = findViewById(R.id.dl);
        abdt = new ActionBarDrawerToggle(this,dl, R.string.Open,R.string.Close);
        abdt.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abdt);
        abdt.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView nav_view = (NavigationView)findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                int id = item.getItemId();

                if (id == R.id.myProfile){
                    Toast.makeText(MainActivity.this, "Meu Perfil", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.myCats){
                    Toast.makeText(MainActivity.this, "Meus Gatos", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.geolocation){
                    Toast.makeText(MainActivity.this, "Gatos pelo Mundo", Toast.LENGTH_SHORT).show();
                }
                else if (id == R.id.temperature){
                    Toast.makeText(MainActivity.this, "Temperatura Ideal para seu gato", Toast.LENGTH_SHORT).show();
                }

                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return abdt.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
}