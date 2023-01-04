package org.harmony.endofline.userGame;

import org.harmony.endofline.userGame.UserGameRepository;

/**
 * {@link UserGameRepository} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractGameUserGameRepositoryAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class GameUserGameRepositoryAssert extends AbstractGameUserGameRepositoryAssert<GameUserGameRepositoryAssert, UserGameRepository> {

  /**
   * Creates a new <code>{@link GameUserGameRepositoryAssert}</code> to make assertions on actual UserGameRepository.
   * @param actual the UserGameRepository we want to make assertions on.
   */
  public GameUserGameRepositoryAssert(UserGameRepository actual) {
    super(actual, GameUserGameRepositoryAssert.class);
  }

  /**
   * An entry point for GameUserGameRepositoryAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myUserGameRepository)</code> and get specific assertion with code completion.
   * @param actual the UserGameRepository we want to make assertions on.
   * @return a new <code>{@link GameUserGameRepositoryAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static GameUserGameRepositoryAssert assertThat(UserGameRepository actual) {
    return new GameUserGameRepositoryAssert(actual);
  }
}