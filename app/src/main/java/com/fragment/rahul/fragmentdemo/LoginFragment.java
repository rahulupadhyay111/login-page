package com.fragment.rahul.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.net.Credentials;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rahul on 1/28/2017.
 */

public class LoginFragment extends Fragment {

    Button btn;
    EditText ett1,ett2;
    TextView text;

    int counter = 3;
    Activity activity = getActivity();






    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.login,container,false);

        ett1=(EditText) view.findViewById(R.id.et1);
        ett2=(EditText) view.findViewById(R.id.et2);

        btn=(Button) view.findViewById(R.id.bt1);
        text=(TextView) view.findViewById(R.id.txtview);
        text.setVisibility(View.GONE);
        btn.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                if(ett1.getText().toString().equals("rahul") &&
                        ett2.getText().toString().equals("rahul123")) {
                    Toast.makeText(getActivity(),"Login Successfully",Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getActivity(), "Invalid usernamr or password", Toast.LENGTH_SHORT).show();
                }

                /*text.setVisibility(View.VISIBLE);
                text.setBackgroundColor(Color.RED);
      8          counter--;
                text.setText(Integer.toString(counter));*/

                /*if (counter == 0) {
                    btn.setEnabled(false);
                }*/


            }
        });



        return view;


    }




}
