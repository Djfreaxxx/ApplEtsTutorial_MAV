package com.example.marcantvez.androidtuto;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.Hashtable;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private ListView listeClub;
    private Vector clubVect;
    private Operations op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listeClub = (ListView) findViewById(R.id.listeClubs);
        op = new Operations(this);
        clubVect = op.loadClubs();

        String[] from = {"icone", "nom", "local"};
        int[] to = {R.id.clubLogo, R.id.clubName, R.id.clubRoom,};
        SimpleAdapter sAdapter = new SimpleAdapter(this, clubVect, R.layout.club_item, from, to);
        listeClub.setAdapter(sAdapter);

        listeClub.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Hashtable h = (Hashtable) listeClub.getItemAtPosition(position);

                int index = (int) h.get("icone");
                String url = op.getClubWebSite(index);
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }

        });

    }
}
