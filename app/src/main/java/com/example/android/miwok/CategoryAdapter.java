package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * adapter for producing category list
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    //container for title strings ids
    private int[] title = {R.string.category_numbers, R.string.category_family, R.string.category_colors, R.string.category_phrases};
    //reference to activity
    private Context context;

    public CategoryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumberFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                //
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {  //to set fragment title
        //return page title given by string ids
        return context.getText(title[position]);
    }
}
