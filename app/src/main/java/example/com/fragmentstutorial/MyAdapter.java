package example.com.fragmentstutorial;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private final Context context;
    int totalTabs;

    public MyAdapter( FragmentManager fm, Context context, int totalTabs) {
        super(fm);
        this.context = context;
        this.totalTabs = totalTabs;
    }


    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                CartFragment cartFragment = new CartFragment();
                return cartFragment;
            case 2:
                PaymentFragment paymentFragment = new PaymentFragment();
                return paymentFragment;
            default:
                return null;

        }

    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
