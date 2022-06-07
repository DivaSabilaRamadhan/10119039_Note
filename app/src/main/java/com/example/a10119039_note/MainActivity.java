package com.example.a10119039_note;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
// Nama    : Diva Sabila Ramadhan
// NIM     : 10119039
// Kelas   : IF-1
// Tanggal Pengerjaan : 05/06/2022

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    ProfileFragment profileFragment = new ProfileFragment();
    AboutFragment aboutFragment = new AboutFragment();
    NoteFragment noteFragment = new NoteFragment();
    TambahFragment tambahFragment = new TambahFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.container,noteFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.profile:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment).commit();
                        return true;
                    case R.id.about:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,aboutFragment).commit();
                        return true;
                    case R.id.note:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,noteFragment).commit();
                        return true;
                    case R.id.tambah:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,tambahFragment).commit();
                        return true;
                }
                return false;
                }
        });
    }
}