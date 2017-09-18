package megha.g_play_store;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        TabLayout tabLayout=(TabLayout)findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }

   private  void setupViewPager(ViewPager viewPager){
        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new FragOne(),"one");
        adapter.addFragment(new FragTwo(),"two");
        viewPager.setAdapter(adapter);
   }
    class ViewPagerAdapter extends FragmentPagerAdapter{

       private  final List<Fragment>  fraglist=new ArrayList<>();
       private final List<String> fragtitle=new ArrayList<>();

       public  ViewPagerAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
       }

       @Override
        public Fragment getItem(int pos){
           return fraglist.get(pos);
       }

       @Override
        public int getCount(){
            return fraglist.size();
       }
       public  void addFragment(Fragment fragment,String s){
            fraglist.add(fragment);
            fragtitle.add(s);
       }
        public CharSequence getPageTitle(int pos){
           return fragtitle.get(pos);
        }
    }
}
