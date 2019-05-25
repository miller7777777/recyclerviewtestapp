package com.miller777.recyclerviewtestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView numbersList;
    private NumbersAdapter numbersAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numbersList = findViewById(R.id.rv_numbers);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        numbersList.setLayoutManager(layoutManager);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(numbersList.getContext(),
                layoutManager.getOrientation());

        numbersList.addItemDecoration(dividerItemDecoration);


        numbersList.setHasFixedSize(true);  // Если заранее знаем размер списка
        numbersAdapter = new NumbersAdapter(100, this);
        numbersList.setAdapter(numbersAdapter);




    }
}
