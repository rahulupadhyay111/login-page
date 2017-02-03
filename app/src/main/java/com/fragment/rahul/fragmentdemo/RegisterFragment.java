package com.fragment.rahul.fragmentdemo;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by rahul on 1/30/2017.
 */

public class RegisterFragment extends Fragment {

    //Activity activity = getActivity();
    EditText editText1,editText2,editText3;
    Button button1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_register,container,false);

        editText1=(EditText) view.findViewById(R.id.ett1);
        editText2=(EditText) view.findViewById(R.id.ett2);
        editText3=(EditText) view.findViewById(R.id.ett3);

        button1=(Button) view.findViewById(R.id.btt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equals("rahul") &&
                editText2.getText().toString().equals("123456789") &&
                 editText3.getText().toString().equals("123456789")) {
                    Toast.makeText(getActivity(), "signup successfully", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getActivity(), "signup failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }
}
