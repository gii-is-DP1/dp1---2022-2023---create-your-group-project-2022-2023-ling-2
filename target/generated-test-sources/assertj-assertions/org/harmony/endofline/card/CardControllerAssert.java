package org.harmony.endofline.card;

/**
 * {@link CardController} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractCardControllerAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class CardControllerAssert extends AbstractCardControllerAssert<CardControllerAssert, CardController> {

  /**
   * Creates a new <code>{@link CardControllerAssert}</code> to make assertions on actual CardController.
   * @param actual the CardController we want to make assertions on.
   */
  public CardControllerAssert(CardController actual) {
    super(actual, CardControllerAssert.class);
  }

  /**
   * An entry point for CardControllerAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myCardController)</code> and get specific assertion with code completion.
   * @param actual the CardController we want to make assertions on.
   * @return a new <code>{@link CardControllerAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static CardControllerAssert assertThat(CardController actual) {
    return new CardControllerAssert(actual);
  }
}
