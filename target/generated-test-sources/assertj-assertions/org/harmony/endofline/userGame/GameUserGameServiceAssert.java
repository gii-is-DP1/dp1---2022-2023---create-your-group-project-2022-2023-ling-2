package org.harmony.endofline.userGame;

import org.harmony.endofline.userGame.UserGameService;

/**
 * {@link UserGameService} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractGameUserGameServiceAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class GameUserGameServiceAssert extends AbstractGameUserGameServiceAssert<GameUserGameServiceAssert, UserGameService> {

  /**
   * Creates a new <code>{@link GameUserGameServiceAssert}</code> to make assertions on actual UserGameService.
   * @param actual the UserGameService we want to make assertions on.
   */
  public GameUserGameServiceAssert(UserGameService actual) {
    super(actual, GameUserGameServiceAssert.class);
  }

  /**
   * An entry point for GameUserGameServiceAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myUserGameService)</code> and get specific assertion with code completion.
   * @param actual the UserGameService we want to make assertions on.
   * @return a new <code>{@link GameUserGameServiceAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static GameUserGameServiceAssert assertThat(UserGameService actual) {
    return new GameUserGameServiceAssert(actual);
  }
}