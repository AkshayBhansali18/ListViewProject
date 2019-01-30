package com.example.aksha.listviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int images[]={R.drawable.virat,R.drawable.kane,R.drawable.steve,R.drawable.joe,R.drawable.faf};
    String names[]={"Virat Kohli","Kane Williamson","Steve Smith","Joe Root","Faf Du Plessis"};
    String country[]={"India","New Zealand","Australia","England","South Africa"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView);
        class CustomAdapter extends BaseAdapter
        {

            @Override
            public int getCount() {
                return names.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
        convertView=getLayoutInflater().inflate(R.layout.customlayout,null);
       ImageView imageView=(ImageView)convertView.findViewById(R.id.imageView);
       TextView textView_names=(TextView)convertView.findViewById(R.id.textView_names);
       TextView textView_country=(TextView)convertView.findViewById(R.id.textView_country);
       imageView.setImageResource(images[position]);
       textView_names.setText(names[position]);
       textView_country.setText(country[position]);

       return convertView;
            }
        }
        CustomAdapter adapter=new CustomAdapter();
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent intent=new Intent(MainActivity.this,Virat_info.class);
                    startActivity(intent);
                }
                if(position==1)
                {
                    Intent intent=new Intent(MainActivity.this,Kane_info.class);
                    startActivity(intent);
                }
                if(position==2)
                {
                    Intent intent=new Intent(MainActivity.this,Steve_info.class);
                    startActivity(intent);
                }
                if(position==3)
                {
                    Intent intent=new Intent(MainActivity.this,Joe_info.class);
                    startActivity(intent);
                }
                if(position==4)
                {
                    Intent intent=new Intent(MainActivity.this,faf_info.class);
                    startActivity(intent);
                }
            }
        });
    }
}
