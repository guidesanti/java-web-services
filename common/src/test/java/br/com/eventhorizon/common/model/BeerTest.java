package br.com.eventhorizon.common.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BeerTest {

  private static final String BEER_ID = "Beer ID";

  private static final String BEER_NAME = "Beer Name";

  private static final String BEER_STYLE = "Beer Style";

  @Test
  public void testBeer() {
    // given
    Beer beer1 = new Beer();
    Beer beer2 = new Beer(BEER_ID, BEER_NAME, BEER_STYLE);

    // when
    beer1.setId(BEER_ID);
    beer1.setName(BEER_NAME);
    beer1.setStyle(BEER_STYLE);

    // then
    assertEquals(BEER_ID, beer1.getId());
    assertEquals(BEER_NAME, beer1.getName());
    assertEquals(BEER_STYLE, beer1.getStyle());
    assertEquals(BEER_ID, beer2.getId());
    assertEquals(BEER_NAME, beer2.getName());
    assertEquals(BEER_STYLE, beer2.getStyle());
  }

  @Test
  public void testToString() {
    // given
    Beer beer = new Beer(BEER_ID, BEER_NAME, BEER_STYLE);

    // when
    String str = beer.toString();

    // then
    assertTrue(str.contains(BEER_ID));
    assertTrue(str.contains(BEER_NAME));
    assertTrue(str.contains(BEER_STYLE));
  }

}
