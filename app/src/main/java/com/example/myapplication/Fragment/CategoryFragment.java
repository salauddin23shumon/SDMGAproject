package com.example.myapplication.Fragment;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.myapplication.Activity.CategoryRecylerView;
import com.example.myapplication.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {

    LinearLayout flat,apartment,store,office,garage,warehouse;
    Spinner loaction;

    ArrayAdapter<String> arrayAdapter;


    public CategoryFragment() {
        // Required empty public constructor
    }

    String TAG="AddPostFragment ";
    private Context context;
    private Context mCobtext;
    private static final String SHARED_PREF_NAME = "simplifiedcodingsharedpref";
    private static final String KEY_TOKEN = "keytoken";
    String token;
    // String TAG="AddPostFragment ";




    @Override
    public void onAttach(Context context) {
        this.context=context;
        super.onAttach(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        token = sharedPreferences.getString(KEY_TOKEN, "");
        Log.e(TAG, "onAttach: "+token );

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate( R.layout.fragment_category, container, false);

        flat = (LinearLayout)view.findViewById(R.id.flat);
        apartment = (LinearLayout)view.findViewById(R.id.apartment);
        store = (LinearLayout)view.findViewById(R.id.store);
        office = (LinearLayout)view.findViewById(R.id.office);
        garage = (LinearLayout)view.findViewById(R.id.garage);
        warehouse = (LinearLayout)view.findViewById(R.id.warehouse);





        flat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( getContext(), CategoryRecylerView.class );
                intent.putExtra("category","Flat");
                intent.putExtra("token",token);
                startActivity( intent );
            }
        } );

        apartment.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), CategoryRecylerView.class );
                intent.putExtra("category","Apartment");
                intent.putExtra("token",token);
                startActivity( intent );
            }
        } );

        store.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), CategoryRecylerView.class );
                intent.putExtra("category","Store");
                intent.putExtra("token",token);
                startActivity( intent );
            }
        } );

        office.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), CategoryRecylerView.class );
                intent.putExtra("category","Office");
                intent.putExtra("token",token);
                startActivity( intent );
            }
        } );

        garage.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), CategoryRecylerView.class );
                intent.putExtra("category","Garage");
                intent.putExtra("token",token);
                startActivity( intent );
            }
        } );

        warehouse.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( getContext(), CategoryRecylerView.class );
                intent.putExtra("category","Warehouse");
                intent.putExtra("token",token);
                startActivity( intent );
            }
        } );

        return view;
    }

}
