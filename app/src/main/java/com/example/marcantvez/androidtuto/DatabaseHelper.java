package com.example.marcantvez.androidtuto;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Marcant on 2015-03-16.
 */
public class DatabaseHelper extends SQLiteOpenHelper
{
    private int exercCount = 0;

    public DatabaseHelper(Context context) {
        super(context, "DB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE clubs (_id INTEGER PRIMARY KEY AUTOINCREMENT, nom Text, local TEXT, icone INTEGER, siteweb TEXT);");

        //ajouter des clubs dans la base de données
        ajouterClub(new Club("ACE","A-1956",R.drawable.ic_ace,"http://www.avioncargoets.com/ets/"), db);
        ajouterClub(new Club("AEETS","A-1840",R.drawable.ic_aeets,"http://aeets.com/"), db);
        ajouterClub(new Club("Applets","A-1966",R.drawable.ic_applets,"http://www.clubapplets.ca/"), db);
        ajouterClub(new Club("AthlÉTSiques","A-1199",R.drawable.ic_athletsiques,"http://athletsiques.etsmtl.ca/"), db);
        ajouterClub(new Club("Baja","A-1332",R.drawable.ic_baja,"http://baja.etsmtl.ca/"), db);
        ajouterClub(new Club("Bibliotheque","A-1",R.drawable.ic_bibliotheque,"http://www.etsmtl.ca/Bibliotheque/Accueil"), db);
        ajouterClub(new Club("ACE","A-19",R.drawable.ic_canoedebeton,"http://canoe.etsmtl.ca/"), db);
        ajouterClub(new Club("Capra","A-1746",R.drawable.ic_capra,"http://www.clubcapra.com/"), db);
        ajouterClub(new Club("Centre Sportif","B-3",R.drawable.ic_centresportif,"http://centresportif.etsmtl.ca/"), db);
        ajouterClub(new Club("Chinook","A-1748",R.drawable.ic_chinook,"http://chinookets.com/"), db);
        ajouterClub(new Club("Conjure","A-1744",R.drawable.ic_conjure,"http://conjure.etsmtl.ca/"), db);
        ajouterClub(new Club("Coop Éts","B-0000",R.drawable.ic_coopets,"http://www.coopets.ca/fr"), db);
        ajouterClub(new Club("Crabe","A-1172",R.drawable.ic_crabeets,"http://crabe.etsmtl.ca/"), db);
        ajouterClub(new Club("Débat Piranha","A-1172",R.drawable.ic_debatpiranha,"http://debatpiranha.com/"), db);
        ajouterClub(new Club("Décliq","N/A",R.drawable.ic_decliq,"http://www.decliq.com/"), db);
        ajouterClub(new Club("Dronolab","A-1760",R.drawable.ic_dronolab,"http://dronolab.com/"), db);
        ajouterClub(new Club("Éclipse","A-2519",R.drawable.ic_eclipse,"http://eclipse.etsmtl.ca/"), db);
        ajouterClub(new Club("EsporTS","A-1950",R.drawable.ic_esports,"http://esports.etsmtl.ca/"), db);
        ajouterClub(new Club("Génie Football","N/A",R.drawable.ic_football,"http://geniefootball.com/"), db);
        ajouterClub(new Club("Formule ÉTS","A-1330",R.drawable.ic_formuleets,"http://www.formuleets.ca/"), db);
        ajouterClub(new Club("GéniAle","A-1244",R.drawable.ic_geniale,"https://sites.google.com/a/etsmtl.net/geniale/home"), db);
        ajouterClub(new Club("IEEE","A-3850",R.drawable.ic_ieee,"http://ieee.etsmtl.ca/"), db);
        ajouterClub(new Club("Les INGénieuses","N/A",R.drawable.ic_ingenieuses,"http://www.etsmtl.ca/Etudiants-actuels/Baccalaureat/Vie-etudiante/Clubs-regroupements-etudiants/INGenieuses"), db);
        ajouterClub(new Club("Intégrale","N/A",R.drawable.ic_integrale,"https://www.facebook.com/integrale.ets/info/?tab=page_info"), db);
        ajouterClub(new Club("LAN-ETS","B-0506",R.drawable.ic_lanets,"https://lanets.ca/"), db);
        ajouterClub(new Club("LIETS","N/A",R.drawable.ic_liets,"http://www.liets.ca/"), db);
        ajouterClub(new Club("Omer","A-1310",R.drawable.ic_omer,"http://www.omerets.com/"), db);
        ajouterClub(new Club("Phoenix","N/A",R.drawable.ic_phoenix,"http://phoenix.etsmtl.ca/"), db);
        ajouterClub(new Club("Pont-Pop","N/A",R.drawable.ic_pontpop,"http://pontpop.etsmtl.ca/"), db);
        ajouterClub(new Club("Préci","B-0512",R.drawable.ic_preci,"http://www.etsmtl.ca/Services/PRECI/Accueil"), db);
        ajouterClub(new Club("Quiets","N/A",R.drawable.ic_quiets,"http://www.teamquiets.com/"), db);
        ajouterClub(new Club("Radio Piranha","A-1199",R.drawable.ic_radiopiranha,"http://www.radiopiranha.com/"), db);
        ajouterClub(new Club("Radio Sans génie","A-1172",R.drawable.ic_radiosansgenie,"http://radiosansgenie.com/"), db);
        ajouterClub(new Club("Rafale Projet Class C","A-3850",R.drawable.ic_rafale,"http://etsclassc-rafale.ca/fr/projets.html"), db);
        ajouterClub(new Club("ReflETS","N/A",R.drawable.ic_reflets,"https://www.facebook.com/ets.reflets"), db);
        ajouterClub(new Club("Rock&Dance","N/A",R.drawable.ic_rockanddance,"http://rndets.com/"), db);
        ajouterClub(new Club("RockÉTS","A-1764",R.drawable.ic_rockets,"http://www.clubrockets.ca/views/index/index_fr.php"), db);
        ajouterClub(new Club("Rugby","N/A",R.drawable.ic_rugby,"http://centresportif.etsmtl.ca/sport-universitaire/piranhas/rugby.html"), db);
        ajouterClub(new Club("Sonia","A-1722",R.drawable.ic_sonia,"http://sonia.etsmtl.ca/fr/"), db);
        ajouterClub(new Club("Substance","N/A",R.drawable.ic_substance,"http://substance.etsmtl.ca/"), db);
        ajouterClub(new Club("Walking Machines","A-1956",R.drawable.ic_walkingmachine,"http://www.avioncargoets.com/ets/"), db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS club");
        onCreate(db);
    }

    public void ajouterClub (Club club, SQLiteDatabase db){
        ContentValues cv = new ContentValues();

        cv.put("nom", club.getName());
        cv.put("local",club.getRoom());
        cv.put("icone", club.getIcon());
        cv.put("siteweb", club.getWebsite());

        db.insert("clubs", null, cv);
    }
}