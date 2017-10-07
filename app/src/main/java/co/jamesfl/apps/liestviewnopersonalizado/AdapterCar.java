package co.jamesfl.apps.liestviewnopersonalizado;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by android on 07/10/2017.
 */

public class AdapterCar extends BaseAdapter {
    private Context context;
    private ArrayList<Car> cars;
    private Resources res;

    public AdapterCar(Context context, ArrayList<Car> cars) {
        this.context = context;
        this.cars = cars;
    }

    @Override
    public int getCount() {
        return cars.size();
    }

    @Override
    public Object getItem(int i) {
        return cars.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        res = context.getResources();
        View v = view;

        LayoutInflater inf = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inf.inflate(R.layout.item_car,null);
        String [] strBrand = res.getStringArray(R.array.brand_option);
        String [] strModel = res.getStringArray(R.array.model_option);
        String [] strColor = res.getStringArray(R.array.color_option);
        
        Car c = cars.get(i);
        
        ImageView picture = (ImageView)v.findViewById(R.id.picture);
        TextView brand = (TextView)v.findViewById(R.id.txtBrand);
        TextView model = (TextView)v.findViewById(R.id.txtModel);
        TextView color = (TextView) v.findViewById(R.id.txtColor);
        TextView price = (TextView)v.findViewById(R.id.txtPrice);


        //Setear elementos a la vista

        picture.setImageDrawable(ResourcesCompat.getDrawable(res,c.getPicture(),null));
        brand.setText(strBrand[c.getBrand()]);
        model.setText("Modelo: "+strModel[c.getModel()]);
        color.setText(strColor[c.getColor()]);
        price.setText("$ "+c.getPrice());

        return v;

    }
}
