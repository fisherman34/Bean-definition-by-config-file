package com.deviro.maven.services.impl;

import com.deviro.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

/**
 * @author Sam
 * @create 2024-06-25 7:38 PM
 */

@Component
public class EnglishRedPrinter implements RedPrinter {

  @Override
  public String print() {return "red";}
}
