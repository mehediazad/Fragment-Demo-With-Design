package com.example.fragment_demo_2;


import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class InfoFragment extends Fragment {

    RadioButton left_botton_Id, right_bottonId;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_info,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        left_botton_Id = view.findViewById(R.id.left_botton_Id);
        right_bottonId = view.findViewById(R.id.right_bottonId);
        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.left_botton_Id:
                        RadioButton btnLeft = view.findViewById(R.id.left_botton_Id);
                        btnLeft.setTextColor((Color.GREEN));
                        btnLeft.setChecked(true);

                        break;

                    case R.id.right_bottonId:
                        RadioButton btnRight = view.findViewById(R.id.right_bottonId);
                        btnRight.setTextColor((Color.RED));
                        btnRight.setChecked(true);

                        break;
                }
            }

        });


    }

}