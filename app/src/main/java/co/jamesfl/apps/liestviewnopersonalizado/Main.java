package co.jamesfl.apps.liestviewnopersonalizado;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main extends AppCompatActivity {
    private ListView list_options;
    private String opc[];
    private Resources res;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = this.getResources();
        list_options = (ListView)findViewById(R.id.lst_opciones);
        opc = res.getStringArray(R.array.lst_options);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        list_options.setAdapter(adapter);

        list_options.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                switch (pos){
                    case 0:
                        intent = new Intent(Main.this, AddCar.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(Main.this, ListCars.class);
                        startActivity(intent);
                        break;
                }

            }
        });
    }
}
