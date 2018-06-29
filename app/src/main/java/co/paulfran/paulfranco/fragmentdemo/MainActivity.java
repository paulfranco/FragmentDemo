package co.paulfran.paulfranco.fragmentdemo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Preferred Method of adding a fragment is to add it programmatically by following these steps:
        // Steps to add a fragment programmatically
        // 1. Initialize the fragment
        HelloFragment helloFragment = new HelloFragment();
        // 2. Initialize the fragment manager
        FragmentManager manager = getFragmentManager();
        // 3. Get the reference to our fragment transaction
        FragmentTransaction transaction = manager.beginTransaction();
        // 4. Perform the operation (add, remove, replace, hide, show)
        transaction.add(R.id.container, helloFragment, "helloFragment");
        // 5. Commit the transaction
        transaction.commit();

    }
}
