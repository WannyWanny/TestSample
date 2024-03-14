package com.example.Test.base;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public abstract class BaseAPITest {

    @Autowired
    private DataSource dataSource;

    /**
     * 입력받은 Object을 JSON 형태의 문자열로 변환하여 리턴한다.
     */
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 샘플 데이터 삽입
     */
    protected void connectDataSource() {
        try (Connection conn = dataSource.getConnection()) {
            ScriptUtils.executeSqlScript(conn, new ClassPathResource("/db/migration/sample/012.003.load_table_user.sql"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
