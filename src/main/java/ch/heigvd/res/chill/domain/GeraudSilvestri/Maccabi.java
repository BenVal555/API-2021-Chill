package ch.heigvd.res.chill.domain.GeraudSilvestri;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Maccabi implements IProduct {

  public final static String NAME = "Sinalco";
  public final static BigDecimal PRICE = new BigDecimal(1.8);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
