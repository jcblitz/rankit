/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.blitzstein.rankit.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import net.blitzstein.rankit.domain.Item;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

/**
 *
 * @author jcblitz
 */
public class ItemDaoImpl implements ItemDao {

    private SimpleJdbcTemplate simpleJdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
    }

    public Item getItem(long itemId) {
        String sql = "select id  from items where id = ?";
        return this.simpleJdbcTemplate.queryForObject(sql, mapper, itemId);

    }
    ParameterizedRowMapper<Item> mapper = new ParameterizedRowMapper<Item>() {

        // notice the return type with respect to Java 5 covariant return types
        public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
            Item item = new Item();
            item.setId(rs.getLong("id"));
            return item;
        }
    };
}
