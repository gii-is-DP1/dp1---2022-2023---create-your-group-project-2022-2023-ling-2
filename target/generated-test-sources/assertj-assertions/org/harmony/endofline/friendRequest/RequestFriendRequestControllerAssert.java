package org.harmony.endofline.friendRequest;

import org.harmony.endofline.friendRequest.FriendRequestController;

/**
 * {@link FriendRequestController} specific assertions - Generated by CustomAssertionGenerator.
 *
 * Although this class is not final to allow Soft assertions proxy, if you wish to extend it, 
 * extend {@link AbstractRequestFriendRequestControllerAssert} instead.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class RequestFriendRequestControllerAssert extends AbstractRequestFriendRequestControllerAssert<RequestFriendRequestControllerAssert, FriendRequestController> {

  /**
   * Creates a new <code>{@link RequestFriendRequestControllerAssert}</code> to make assertions on actual FriendRequestController.
   * @param actual the FriendRequestController we want to make assertions on.
   */
  public RequestFriendRequestControllerAssert(FriendRequestController actual) {
    super(actual, RequestFriendRequestControllerAssert.class);
  }

  /**
   * An entry point for RequestFriendRequestControllerAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myFriendRequestController)</code> and get specific assertion with code completion.
   * @param actual the FriendRequestController we want to make assertions on.
   * @return a new <code>{@link RequestFriendRequestControllerAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static RequestFriendRequestControllerAssert assertThat(FriendRequestController actual) {
    return new RequestFriendRequestControllerAssert(actual);
  }
}
