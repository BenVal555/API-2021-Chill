package ch.heigvd.res.chill.domain.chloefont;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Ichnusa implements IProduct {

  public final static String NAME = "Ichnusa";
  public final static BigDecimal PRICE = new BigDecimal(1.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
