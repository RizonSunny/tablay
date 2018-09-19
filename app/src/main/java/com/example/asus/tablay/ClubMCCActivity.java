package com.example.asus.tablay;

import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class ClubMCCActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    MCCPageAdapter MCCPageAdapter;
    TabItem tabChats;
    TabItem tabStatus;
    TabItem tabCalls;


    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_mcc );


            toolbar =  findViewById(R.id.toolbar);

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            //toolbar.setTitle(getResources().getString(R.string.app_name));
            toolbar.setTitle("Mist Computer Club");
        //}
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);
        tabChats = findViewById(R.id.tabChats);
        tabStatus = findViewById(R.id.tabStatus);
        tabCalls = findViewById(R.id.tabCalls);
        viewPager = findViewById(R.id.viewPager);

        MCCPageAdapter = new MCCPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter( MCCPageAdapter );

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                /*if(tab.getPosition() == 1)
                {
                    toolbar.setBackgroundColor(ContextCompat.getColor(ClubMCCActivity.this, R.color.colorAccent));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(ClubMCCActivity.this , R.color.colorAccent));

                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    {
                        getWindow().setStatusBarColor(ContextCompat.getColor(ClubMCCActivity.this,R.color.colorAccent));
                    }
                }
                else if(tab.getPosition() == 2)
                {
                    toolbar.setBackgroundColor(ContextCompat.getColor(ClubMCCActivity.this, R.color.colorPrimary));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(ClubMCCActivity.this , R.color.colorPrimary));

                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    {
                        getWindow().setStatusBarColor(ContextCompat.getColor(ClubMCCActivity.this,R.color.colorPrimary));
                    }
                }
                else if(tab.getPosition() == 3)
                {*/
                    toolbar.setBackgroundColor(ContextCompat.getColor(ClubMCCActivity.this, R.color.colorPrimaryDark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(ClubMCCActivity.this , R.color.colorPrimaryDark));

                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
                    {
                        getWindow().setStatusBarColor(ContextCompat.getColor(ClubMCCActivity.this,R.color.colorPrimaryDark));
                    }
                //}
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

}
