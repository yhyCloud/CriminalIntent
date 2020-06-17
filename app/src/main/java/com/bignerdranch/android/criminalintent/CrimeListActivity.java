package com.bignerdranch.android.criminalintent;

//import android.support.v4.app.Fragment;

import androidx.fragment.app.Fragment;

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
