package com.kakaopay.assignment.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author doyoung hwang on 2019-07-28
 */

@ConfigurationProperties(prefix = "datasource")
@Getter
@Setter
public class FinanceConfig {

  private String url;
  private String username;
  private String password;
}
