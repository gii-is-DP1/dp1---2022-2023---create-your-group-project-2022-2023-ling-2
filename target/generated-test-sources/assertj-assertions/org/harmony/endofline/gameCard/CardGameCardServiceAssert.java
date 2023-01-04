package org.harmony.endofline.gameCard;

import org.harmony.endofline.gameCard.GameCardService;

/**
 * {@link GameCardService} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractCardGameCardServiceAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class CardGameCardServiceAssert extends AbstractCardGameCardServiceAssert<CardGameCardServiceAssert, GameCardService> {

  /**
   * Creates a new <code>{@link CardGameCardServiceAssert}</code> to make assertions on actual GameCardService.
   * @param actual the GameCardService we want to make assertions on.
   */
  public CardGameCardServiceAssert(GameCardService actual) {
    super(actual, CardGameCardServiceAssert.class);
  }

  /**
   * An entry point for CardGameCardServiceAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myGameCardService)</code> and get specific assertion with code completion.
   * @param actual the GameCardService we want to make assertions on.
   * @return a new <code>{@link CardGameCardServiceAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static CardGameCardServiceAssert assertThat(GameCardService actual) {
    return new CardGameCardServiceAssert(actual);
  }
}
