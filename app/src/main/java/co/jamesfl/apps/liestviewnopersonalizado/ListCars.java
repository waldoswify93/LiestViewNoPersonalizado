package co.jamesfl.apps.liestviewnopersonalizado;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListCars extends AppCompatActivity {

    private ListView list;
    private ArrayList<Car> cars;
    private Context context;
    private AdapterCar adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cars);

        list=(ListView)findViewById(R.id.lstCars);
        context = this.getApplicationContext();
        cars = Data.getCars();
        adapter = new AdapterCar(context, cars);
        list.setAdapter(adapter);
    }
}
