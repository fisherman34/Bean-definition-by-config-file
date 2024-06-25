package com.deviro.maven.services.impl;

import com.deviro.maven.services.BluePrinter;
import org.springframework.stereotype.Component;

/**
 * @author Sam
 * @create 2024-06-25 7:38 PM
 */

@Component
public class EnglishBluePrinter implements BluePrinter {

  @Override
  public String print() {return "blue";}
}
