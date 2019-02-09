package com.beangate.datta.fragmentscrolltabs;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_A extends Fragment {


    public Fragment_A() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Bean","On attach called");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState==null){
            Log.d("Bean","oncreate First Time");
        }else{
            Log.d("Bean","oncreate subsequint time");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Bean","Onactivitycreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Bean","onStart ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Bean","onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Bean","onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("Bean","onSaveInstancestate");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Bean","onStop ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Bean","onDestroView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Bean","OnDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Bean","OnDetach");
    }
}
