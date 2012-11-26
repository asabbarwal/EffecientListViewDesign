package com.abhisheksabbarwal.effecientlistviewdesign;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
	
	private ListView listview;
	private ListViewAdapter listAdapter;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        listview = (ListView) findViewById(R.id.mylist);
        listAdapter = new ListViewAdapter(this, R.layout.list_view_row, loadCountryNames());
        
        //Attach the adapter to the ListView
        listview.setAdapter(listAdapter);
        
        listview.setOnItemClickListener(new OnItemClickListener() {

    		public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
    			 // Notification when we click on one of the row
    			Toast.makeText(getApplicationContext(), listAdapter.getItem(position).toString(), Toast.LENGTH_SHORT).show();	
			} 	
        });
    }
    
    private List <String> loadCountryNames() {
        List <String> countryNames = new ArrayList<String>();
            
        countryNames.add("India");
        countryNames.add("USA");
        countryNames.add("UK");
        countryNames.add("Australia");
        countryNames.add("Canada");
        countryNames.add("Brazil");
        countryNames.add("France");
        countryNames.add("Ireland");
        countryNames.add("Germany");
        countryNames.add("South Africa");
        countryNames.add("Korea");
        countryNames.add("Indonesia");
        countryNames.add("China");
        countryNames.add("Japan");
        countryNames.add("Egypt");
        countryNames.add("Ecuador");
        countryNames.add("Peru");
        countryNames.add("Mexico");
        countryNames.add("New Zeland");
        countryNames.add("Sri Lanka");
        countryNames.add("Vietnam");
        countryNames.add("Turkey");
        countryNames.add("Scotland");
        return countryNames;
    }

}
