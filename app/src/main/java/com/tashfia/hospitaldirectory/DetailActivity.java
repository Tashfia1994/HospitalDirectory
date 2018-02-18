package com.tashfia.hospitaldirectory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    ImageView imgview;
    TextView txtname,txtcell,txtaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgview=(ImageView)findViewById(R.id.img_cmc);
        txtcell=(TextView) findViewById(R.id.txt_cell);
        txtaddress=(TextView)findViewById(R.id.txt_address);
        txtname=(TextView)findViewById(R.id.txt_name);

        String getPlaceNo=getIntent().getExtras().getString("hospital_no");

        if (getPlaceNo.equals("cmc"))
        {
            imgview.setImageResource(R.drawable.cmch);
            txtname.setText(R.string.hospital_no1);
            txtcell.setText(R.string.cell_1);
            txtaddress.setText(R.string.Address_1);
        }
        else if (getPlaceNo.equals("max"))
        {
            imgview.setImageResource(R.drawable.max);
            txtname.setText(R.string.hospital_no2);
            txtcell.setText(R.string.cell_2);
            txtaddress.setText(R.string.Address_2);
        }
        else if (getPlaceNo.equals("ustc"))

        {
            imgview.setImageResource(R.drawable.ustc);
            txtname.setText(R.string.hospital_no3);
            txtcell.setText(R.string.cell_3);
            txtaddress.setText(R.string.Address_3);
        }

        else if (getPlaceNo.equals("royel"))
        {
            imgview.setImageResource(R.drawable.royal);
            txtname.setText(R.string.hospital_no4);
            txtcell.setText(R.string.cell_4);
            txtaddress.setText(R.string.Address_4);
        }
        else if(getPlaceNo.equals("metropoliton"))
        {
            imgview.setImageResource(R.drawable.metropoliton);
            txtname.setText(R.string.hospital_no5);
            txtcell.setText(R.string.cell_5);
            txtaddress.setText(R.string.Address_5);
        }

    }
}


