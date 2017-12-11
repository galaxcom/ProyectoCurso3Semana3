package mx.galaxcom.proyectomascotas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        android.support.v7.widget.Toolbar miToolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miToolbar);

        listaMascotas = (RecyclerView) findViewById(R.id.miRecyclerView);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(layoutManager);

        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perro1, "Nombre"));
        mascotas.add(new Mascota(R.drawable.perro2, "Nombre"));
        mascotas.add(new Mascota(R.drawable.perro3, "Nombre"));
        mascotas.add(new Mascota(R.drawable.perro4, "Nombre"));
        mascotas.add(new Mascota(R.drawable.perro5, "Nombre"));
        mascotas.add(new Mascota(R.drawable.perro6, "Nombre"));

        MascotaAdapter adapter = new MascotaAdapter(mascotas);
        listaMascotas.setAdapter(adapter);
    }

    public void estrellaOnClick(MenuItem menuItem){
        Intent intent = new Intent(MainActivity.this, Lista5Mascotas.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }
}
