package com.google.perpustakaandigital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.perpustakaandigital.Adapter.CardViewBookAdapter;
import com.google.perpustakaandigital.Adapter.GridBookAdapter;
import com.google.perpustakaandigital.Adapter.ListBookAdapter;
import com.google.perpustakaandigital.Model.Book;
import com.google.perpustakaandigital.Model.BooksData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<Book> list = new ArrayList<>();
    private String title = "Digital Library";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(BooksData.getListData());
        showRecyclerList();

        setActionBarTitle(title);
    }

    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListBookAdapter listBookAdapter = new ListBookAdapter(list);
        rvHeroes.setAdapter(listBookAdapter);

        listBookAdapter.setOnItemClickCallback(new ListBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                showSelectedBook(data);
            }
        });

    }
    private void showRecyclerGrid(){
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2));
        GridBookAdapter gridBookAdapter = new GridBookAdapter(list);
        rvHeroes.setAdapter(gridBookAdapter);

        gridBookAdapter.setOnItemClickCallback(new GridBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                showSelectedBook(data);
            }
        });
    }
    private void showRecyclerCardView(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        CardViewBookAdapter cardViewBookAdapter = new CardViewBookAdapter(list);
        rvHeroes.setAdapter(cardViewBookAdapter);

        cardViewBookAdapter.setOnItemClickCallback(new CardViewBookAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Book data) {
                showSelectedBook(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                title = "List Mode";
                showRecyclerList();
                break;
            case R.id.action_grid:
                title = "Grid Mode";
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                title = "Card Mode";
                showRecyclerCardView();
                break;
        }
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showSelectedBook(Book data) {
        Toast.makeText(this, "Kamu memilih " + data.getTitle(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(MainActivity.this, moveDetail.class);
        intent.putExtra(moveDetail.EXTRA_NAME, data.getTitle());
        intent.putExtra(moveDetail.EXTRA_DETAIL, data.getDetail());
        intent.putExtra(moveDetail.EXTRA_PHOTO, data.getPhoto());
        startActivity(intent);
    }
}


