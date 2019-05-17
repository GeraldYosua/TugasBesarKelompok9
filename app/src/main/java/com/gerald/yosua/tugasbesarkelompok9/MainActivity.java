package com.gerald.yosua.tugasbesarkelompok9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Motor> list;
    private ArrayList<Motor> listDua;
    private ArrayList<Motor> listTiga;
    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rvCategory =  findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list = new ArrayList<>();
        listDua = new ArrayList<>();
        listTiga = new ArrayList<>();

        if (savedInstanceState == null) {
            setActionBarTitle("Daftar motor 150cc");
            listTiga.addAll(MotorDataTiga.getListDataTiga());
            showRecyclerList3();
            mode = R.id.action_150cc;

        }if (savedInstanceState == null) {
            setActionBarTitle("Daftar motor 125cc");
            listDua.addAll(MotorDataDua.getListDataDua());
            showRecyclerList2();
            mode = R.id.action_125cc;

        }if (savedInstanceState == null) {
            setActionBarTitle("Daftar motor 110cc");
            list.addAll(MotorData.getListData());
            showRecyclerList();
            mode = R.id.action_110cc;

        } else  {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Motor> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);

        }
    }
    private void showRecyclerList() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAdapter listMotorAdapter = new ListMotorAdapter(this, new ListMotorAdapter.OnClick() {
            @Override
            public void onClick(Object motor) {
                Motor motor1 = (Motor) motor;
                Intent intent = new Intent(MainActivity.this, DetailMotorActivity.class);
                intent.putExtra("kunci", motor1);
                startActivity(intent);
            }
        });
        listMotorAdapter.setListMotor(list);
        rvCategory.setAdapter(listMotorAdapter);
    }

    private void showRecyclerList2() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAdapter listMotorAdapter = new ListMotorAdapter(this, new ListMotorAdapter.OnClick() {
            @Override
            public void onClick(Object motor) {
                Motor motor2 = (Motor) motor;
                Intent intent = new Intent(MainActivity.this, DetailMotorActivity.class);
                intent.putExtra("kunci", motor2);
                startActivity(intent);
            }
        });
        listMotorAdapter.setListMotor(listDua);
        rvCategory.setAdapter(listMotorAdapter);
    }
    private void showRecyclerList3() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListMotorAdapter listMotorAdapter = new ListMotorAdapter(this, new ListMotorAdapter.OnClick() {
            @Override
            public void onClick(Object motor) {
                Motor motor3 = (Motor) motor;
                Intent intent = new Intent(MainActivity.this, DetailMotorActivity.class);
                intent.putExtra("kunci", motor3);
                startActivity(intent);
            }
        });
        listMotorAdapter.setListMotor(listTiga);
        rvCategory.setAdapter(listMotorAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());

        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        String title = null;
        switch (selectedMode) {
            case R.id.action_110cc:
                title = "Daftar motor 110cc";
                showRecyclerList();
                break;

            case R.id.action_125cc:
                title = "Daftar motor 125cc";
                showRecyclerList2();
                break;

            case R.id.action_150cc:
                title = "Daftar motor 150cc";
                showRecyclerList3();
                break;
        }
        mode = selectedMode;
        setActionBarTitle(title);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list );
        outState.putInt(STATE_MODE, mode);
    }
}