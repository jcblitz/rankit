/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.blitzstein.rankit.domain;

import java.util.Collection;

/**
 *
 * @author jcblitz
 */
public class Item {

    private long id;
    private Collection<Rank> rankings;

    public Collection<Rank> getRankings() {
        return rankings;
    }

    public void setRankings(Collection<Rank> rankings) {
        this.rankings = rankings;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
