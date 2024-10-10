package com.example.bibliotecadigitalapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private BookAdapter bookAdapter;
    private List<Book> bookList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializar la lista de libros
        bookList = new ArrayList<>();
        bookList.add(new Book("Cien años de soledad", "Gabriel García Márquez", R.drawable.cien));
        bookList.add(new Book("El principito", "Antoine de Saint-Exupéry", R.drawable.elprincipito));
        bookList.add(new Book("1984", "George Orwell", R.drawable.nineteen_eighty_four));
        bookList.add(new Book("Fahrenheit 451", "Ray Bradbury", R.drawable.fahrenheit451));
        bookList.add(new Book("El túnel", "Ernesto Sabato", R.drawable.eltunel));

        bookAdapter = new BookAdapter(bookList);
        recyclerView.setAdapter(bookAdapter);
    }
}