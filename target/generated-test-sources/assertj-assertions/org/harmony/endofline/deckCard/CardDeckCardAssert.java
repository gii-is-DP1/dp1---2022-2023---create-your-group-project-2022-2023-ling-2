package org.harmony.endofline.deckCard;

import org.harmony.endofline.deckCard.DeckCard;

/**
 * {@link DeckCard} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractCardDeckCardAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class CardDeckCardAssert extends AbstractCardDeckCardAssert<CardDeckCardAssert, DeckCard> {

  /**
   * Creates a new <code>{@link CardDeckCardAssert}</code> to make assertions on actual DeckCard.
   * @param actual the DeckCard we want to make assertions on.
   */
  public CardDeckCardAssert(DeckCard actual) {
    super(actual, CardDeckCardAssert.class);
  }

  /**
   * An entry point for CardDeckCardAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDeckCard)</code> and get specific assertion with code completion.
   * @param actual the DeckCard we want to make assertions on.
   * @return a new <code>{@link CardDeckCardAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static CardDeckCardAssert assertThat(DeckCard actual) {
    return new CardDeckCardAssert(actual);
  }
}
