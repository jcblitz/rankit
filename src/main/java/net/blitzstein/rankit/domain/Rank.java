/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.blitzstein.rankit.domain;

import java.util.Date;

/**
 *
 * @author jcblitz
 */
public class Rank {

    private long id;
    private float score;
    private long itemId;
    private Date addedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Date addedAt) {
        this.addedAt = addedAt;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
