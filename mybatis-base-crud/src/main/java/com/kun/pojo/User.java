package com.kun.pojo;

import lombok.Data;

@Data //lombok
public class User {
  private Integer id;
  private String name;
  private String url;
  private int alexa;
  private String country;
}