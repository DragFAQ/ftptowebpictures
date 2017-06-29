package com.drag.ftptowebpictures.dao;

import com.drag.ftptowebpictures.model.File;
import com.drag.ftptowebpictures.util.ftp.CheckLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FileRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public boolean delete(int id) {
        return jdbcTemplate.update("DELETE FROM files WHERE id=?", id) != 0;
    }

    public File get(int id) {
     //   List<File> users = jdbcTemplate.query("SELECT * FROM files WHERE id=?", ROW_MAPPER, id);
        return null;//DataAccessUtils.singleResult(users);
    }

    public List<File> getAll() {
        return jdbcTemplate.query("SELECT id, name, path, size FROM files",
                (rs, rowNum) -> new File(rs.getInt("id"), rs.getString("name"),
                        rs.getString("path"), rs.getInt("size")));
    }

    public boolean login(String login, String password) {
        return CheckLogin.login(login, password);
    }
}
