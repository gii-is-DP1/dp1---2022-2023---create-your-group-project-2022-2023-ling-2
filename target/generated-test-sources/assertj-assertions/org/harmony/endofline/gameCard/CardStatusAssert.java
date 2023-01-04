package org.harmony.endofline.gameCard;

import org.harmony.endofline.gameCard.Status;

/**
 * {@link Status} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractCardStatusAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class CardStatusAssert extends AbstractCardStatusAssert<CardStatusAssert, Status> {

  /**
   * Creates a new <code>{@link CardStatusAssert}</code> to make assertions on actual Status.
   * @param actual the Status we want to make assertions on.
   */
  public CardStatusAssert(Status actual) {
    super(actual, CardStatusAssert.class);
  }

  /**
   * An entry point for CardStatusAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myStatus)</code> and get specific assertion with code completion.
   * @param actual the Status we want to make assertions on.
   * @return a new <code>{@link CardStatusAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static CardStatusAssert assertThat(Status actual) {
    return new CardStatusAssert(actual);
  }
}
