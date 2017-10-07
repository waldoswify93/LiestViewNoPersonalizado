package co.jamesfl.apps.liestviewnopersonalizado;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class AddCar extends AppCompatActivity {
    private EditText tplate, tprice;
    private Spinner sbrand, smodel, scolor;
    private String strBrand[], strModel[], strColor[];
    private Resources res;
    private ArrayList<Integer> pictures ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car);
        res = this.getResources();

        tplate = (EditText)findViewById(R.id.txtPlate);
        tprice = (EditText)findViewById(R.id.txtPrice);

        sbrand = (Spinner)findViewById(R.id.spinBrand);
        smodel = (Spinner)findViewById(R.id.spinModel);
        scolor = (Spinner)findViewById(R.id.spinColor);

        strBrand = res.getStringArray(R.array.brand_option);
        ArrayAdapter<String> brand_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, strBrand);
        sbrand.setAdapter(brand_adapter);

        strModel = res.getStringArray(R.array.model_option);
        ArrayAdapter<String> model_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, strModel);
        smodel.setAdapter(model_adapter);

        strColor = res.getStringArray(R.array.color_option);
        ArrayAdapter<String> color_adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, strColor);
        scolor.setAdapter(color_adapter);

        pictures = new ArrayList<>();
        pictures.add(R.drawable.carro1);
        pictures.add(R.drawable.carro2);
        pictures.add(R.drawable.carro3);
        pictures.add(R.drawable.carro4);
    }

    public void saveCar(View v){
        String plate;
        int brand, model, color, price;

        plate = tplate.getText().toString();
        brand = sbrand.getSelectedItemPosition();
        model = smodel.getSelectedItemPosition();
        color = scolor.getSelectedItemPosition();
        price = Integer.parseInt(tprice.getText().toString());

        Car car = new Car(plate, brand, model, color, price, methods.fotoAleatoria(pictures));
        Data.addCar(car);

        Toast.makeText(this,res.getString(R.string.msjSave),Toast.LENGTH_SHORT).show();
        clear();
    }

    public void clear(View v){
        clear();
    }

    private void clear(){
        tplate.setText("");
        sbrand.setSelection(0);
        smodel.setSelection(0);
        scolor.setSelection(0);
        tprice.setText("");
    }
}
