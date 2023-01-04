package org.harmony.endofline.deckCard;

import org.harmony.endofline.deckCard.DeckCardService;

/**
 * {@link DeckCardService} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractCardDeckCardServiceAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class CardDeckCardServiceAssert extends AbstractCardDeckCardServiceAssert<CardDeckCardServiceAssert, DeckCardService> {

  /**
   * Creates a new <code>{@link CardDeckCardServiceAssert}</code> to make assertions on actual DeckCardService.
   * @param actual the DeckCardService we want to make assertions on.
   */
  public CardDeckCardServiceAssert(DeckCardService actual) {
    super(actual, CardDeckCardServiceAssert.class);
  }

  /**
   * An entry point for CardDeckCardServiceAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDeckCardService)</code> and get specific assertion with code completion.
   * @param actual the DeckCardService we want to make assertions on.
   * @return a new <code>{@link CardDeckCardServiceAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static CardDeckCardServiceAssert assertThat(DeckCardService actual) {
    return new CardDeckCardServiceAssert(actual);
  }
}