package com.example.marcantvez.androidtuto;

import java.util.Hashtable;

/**
 * Created by MarcantVez on 2015-10-01.
 */
public class Club {
    private int indexIcon;
    private String name, room, website;
    private Hashtable clubHt;

    //getters
    public int getIcon() {return indexIcon;}
    public String getName() {return name;}
    public String getRoom() {return room;}
    public String getWebsite() {return website;}
    public Hashtable getClubHashtable() { return clubHt; }

    public Club (String name, String room, int indexIcon, String website){
        this.indexIcon = indexIcon;
        this.name = name;
        this.room = room;
        this.website = website;

        // création du hashtable du club (pour le simple adapter)
        clubHt = new Hashtable();
        clubHt.put("nom",name);
        clubHt.put("local",room);
        clubHt.put("icone",indexIcon);
        clubHt.put("siteweb",indexIcon);
    }
}
