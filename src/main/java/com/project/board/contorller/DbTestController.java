package com.project.board.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;

@RestController
public class DbTestController {
    @Autowired
    private DataSource dataSource;

    @GetMapping("/db-test")
    public String testConnection() {
        try (Connection conn = dataSource.getConnection()) {
            return "✅ DB 연결 성공! URL = " + conn.getMetaData().getURL();
        } catch (Exception e) {
            e.printStackTrace();
            return "❌ DB 연결 실패: " + e.getMessage();
        }
    }
}
