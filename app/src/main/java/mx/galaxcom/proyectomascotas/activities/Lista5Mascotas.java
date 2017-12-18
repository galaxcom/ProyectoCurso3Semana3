package mx.galaxcom.proyectomascotas.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.*;

import java.util.ArrayList;

import mx.galaxcom.proyectomascotas.pojo.Mascota;
import mx.galaxcom.proyectomascotas.adapters.MascotaAdapter;
import mx.galaxcom.proyectomascotas.R;

public class Lista5Mascotas extends AppCompatActivity {

    ArrayList<Mascota> misMascotas;
    private RecyclerView miListaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista5_mascotas);

        android.support.v7.widget.Toolbar miToolbar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        miListaMascotas = (RecyclerView) findViewById(R.id.rvActivity2);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        miListaMascotas.setLayoutManager(linearLayoutManager);

        misMascotas = new ArrayList<Mascota>();

        misMascotas.add(new Mascota(R.drawable.perro1, "Nombre"));
        misMascotas.add(new Mascota(R.drawable.perro3, "Nombre"));
        misMascotas.add(new Mascota(R.drawable.perro4, "Nombre"));
        misMascotas.add(new Mascota(R.drawable.perro5, "Nombre"));
        misMascotas.add(new Mascota(R.drawable.perro2, "Nombre"));


        MascotaAdapter miAdapter = new MascotaAdapter(misMascotas);
        miListaMascotas.setAdapter(miAdapter);
    }
}
