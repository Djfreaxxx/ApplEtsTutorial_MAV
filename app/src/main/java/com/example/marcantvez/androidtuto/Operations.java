package com.example.marcantvez.androidtuto;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.Vector;

/**
 * Created by MarcantVez on 2015-10-01.
 */
public class Operations {
    private DatabaseHelper dbHelper;
    private SQLiteDatabase sqlDB;

    public Operations(Context c) {
        dbHelper = new DatabaseHelper(c);
    }

    public void ouvrirDB()
    {
        sqlDB = dbHelper.getWritableDatabase();
        sqlDB.setForeignKeyConstraintsEnabled(true);
    }
    public void fermerBD()
    {
        sqlDB.close();
    }

    public Vector loadClubs(){
        // récupérer tous les clubs contenus dans la DB pour la liste
        Vector v = new Vector();
        Club club;
        ouvrirDB();
        Cursor c = sqlDB.rawQuery("SELECT nom, local, icone, siteweb FROM clubs;", null);

        while(c.moveToNext())
        {
            club = new Club(c.getString(0), c.getString(1), c.getInt(2), c.getString(3));
            v.add(club.getClubHashtable());
        }
        fermerBD();
        return v;
    }

    public String getClubWebSite(int index){
        String url;

        ouvrirDB();
        Cursor c = sqlDB.rawQuery("SELECT siteweb FROM clubs WHERE icone = ?;", new String[] {String.valueOf(index)});
        c.moveToFirst();
        url = c.getString(0);
        fermerBD();

        return url;
    }
}
