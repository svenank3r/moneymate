package com.srgms.moneymate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(scanBasePackages = "com.srgms.moneymate")
public class MoneymateApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(MoneymateApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        runJdbc();
    }

    void runJdbc() {
        jdbcTemplate.execute("DROP TABLE IF EXISTS ACCOUNTS;\n" + "\n" + "CREATE TABLE ACCOUNTS(\n" + "    ACCOUNT_ID          LONG                AUTO_INCREMENT  PRIMARY KEY,\n" + "    ACCOUNT_NAME        VARCHAR(255 CHAR)   NOT NULL,\n" + "    ACCOUNT_NUMBER      VARCHAR(255 CHAR)   NOT NULL,\n" + "    ACCOUNT_USER_NAME   VARCHAR(255 CHAR)   NOT NULL,\n" + "    ACCOUNT_TYPE        VARCHAR(255 CHAR)   NOT NULL,\n" + ");");
        jdbcTemplate.execute("INSERT INTO ACCOUNTS(\n" + "    ACCOUNT_NAME,\n" + "    ACCOUNT_NUMBER,\n" + "    ACCOUNT_USER_NAME,\n" + "    ACCOUNT_TYPE\n" + ") VALUES(\n" + "    'Betaalrekening', 'NL72RABO0102453942', 'S. Anker', 'payment'\n" + ");");
        jdbcTemplate.execute("DROP TABLE IF EXISTS TRANSACTIONS;\n" + "\n" + "CREATE TABLE TRANSACTIONS(\n" + "    TRANSACTION_ID          LONG                AUTO_INCREMENT  PRIMARY KEY,\n" + "    TRANSACTION_DATE        DATE                NOT NULL,\n" + "    ACCOUNT_NUMBER          VARCHAR(50 CHAR)    NOT NULL,\n" + "    CURRENCY                VARCHAR(10 CHAR)    NOT NULL,\n" + "    CREDIT                  BOOLEAN             NOT NULL,\n" + "    AMOUNT                  DECIMAL             NOT NULL,\n" + "    COUNTER_ACCOUNT_NAME    VARCHAR(255 CHAR),\n" + "    COUNTER_ACCOUNT_NUMBER  VARCHAR(255 CHAR),\n" + "    DESCRIPTION             VARCHAR(255 CHAR),\n" + ");");
    }
}
