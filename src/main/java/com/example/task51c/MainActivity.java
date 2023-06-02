package com.example.task51c;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the fragment manager
        fragmentManager = getSupportFragmentManager();

        // Begin a fragment transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the fragment container with the MainFragment
        fragmentTransaction.replace(R.id.fragmentContainer, new MainFragment());

        // Add the transaction to the back stack and commit it
        fragmentTransaction.addToBackStack(null).commit();
    }

    @Override
    public void onBackPressed() {
        // Check if the currently displayed fragment is the DetailFragment
        if (fragmentManager.findFragmentById(R.id.fragmentContainer) instanceof DetailFragment) {
            // Begin a fragment transaction
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

            // Replace the fragment container with the MainFragment
            fragmentTransaction.replace(R.id.fragmentContainer, new MainFragment());

            // Add the transaction to the back stack and commit it
            fragmentTransaction.addToBackStack(null).commit();
        } else {
            // If the currently displayed fragment is not the DetailFragment, perform the default back button behavior
            super.onBackPressed();
        }
    }
}
