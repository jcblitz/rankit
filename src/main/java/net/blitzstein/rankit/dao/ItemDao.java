/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.blitzstein.rankit.dao;

import java.util.Collection;
import net.blitzstein.rankit.domain.Item;

/**
 *
 * @author jcblitz
 */
public interface ItemDao {
    public Item getItem(long itemId);
}
