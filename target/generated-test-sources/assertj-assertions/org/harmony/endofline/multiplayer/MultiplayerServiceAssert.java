package org.harmony.endofline.multiplayer;

/**
 * {@link MultiplayerService} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractMultiplayerServiceAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class MultiplayerServiceAssert extends AbstractMultiplayerServiceAssert<MultiplayerServiceAssert, MultiplayerService> {

  /**
   * Creates a new <code>{@link MultiplayerServiceAssert}</code> to make assertions on actual MultiplayerService.
   * @param actual the MultiplayerService we want to make assertions on.
   */
  public MultiplayerServiceAssert(MultiplayerService actual) {
    super(actual, MultiplayerServiceAssert.class);
  }

  /**
   * An entry point for MultiplayerServiceAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myMultiplayerService)</code> and get specific assertion with code completion.
   * @param actual the MultiplayerService we want to make assertions on.
   * @return a new <code>{@link MultiplayerServiceAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static MultiplayerServiceAssert assertThat(MultiplayerService actual) {
    return new MultiplayerServiceAssert(actual);
  }
}
