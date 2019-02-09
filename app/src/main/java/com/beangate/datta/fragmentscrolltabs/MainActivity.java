package com.beangate.datta.fragmentscrolltabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
//first we need to change mainactivity extends FragmentActivity v4.
//second create al Fragment like 3 to 4 fragmenr
//create main.xml ViewPager
//and mainActivity me FragmentManager object and link Viewpager

public class MainActivity extends FragmentActivity {
ViewPager viewPager=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager) findViewById(R.id.pager);
        FragmentManager fragmentManager=getSupportFragmentManager();
        viewPager.setAdapter(new MyAdaptor(fragmentManager));
    }
}
class MyAdaptor extends FragmentPagerAdapter{

    public MyAdaptor(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment=null;
//        Log.d("Bean","get item is called");
        if (i==0){
            fragment=new Fragment_A();
        }if (i==1){
            fragment=new Fragment_B();
        }if (i==2){
            fragment=new Fragment_C();
        }
        return fragment;
    }

    @Override
    public int getCount() {
//        Log.d("Bean","get Count is called");
        return 3;
    }
}
