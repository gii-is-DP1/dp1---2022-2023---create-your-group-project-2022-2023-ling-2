package org.harmony.endofline.deck;

/**
 * {@link Deck} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractDeckAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class DeckAssert extends AbstractDeckAssert<DeckAssert, Deck> {

  /**
   * Creates a new <code>{@link DeckAssert}</code> to make assertions on actual Deck.
   * @param actual the Deck we want to make assertions on.
   */
  public DeckAssert(Deck actual) {
    super(actual, DeckAssert.class);
  }

  /**
   * An entry point for DeckAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myDeck)</code> and get specific assertion with code completion.
   * @param actual the Deck we want to make assertions on.
   * @return a new <code>{@link DeckAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static DeckAssert assertThat(Deck actual) {
    return new DeckAssert(actual);
  }
}
