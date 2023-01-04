package org.harmony.endofline.user;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;

/**
 * Abstract base class for {@link UserService} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractUserServiceAssert<S extends AbstractUserServiceAssert<S, A>, A extends UserService> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractUserServiceAssert}</code> to make assertions on actual UserService.
   * @param actual the UserService we want to make assertions on.
   */
  protected AbstractUserServiceAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual UserService's allUsers contains the given User elements.
   * @param allUsers the given elements that should be contained in actual UserService's allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers does not contain all given User elements.
   */
  public S hasAllUsers(User... allUsers) {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // check that given User varargs is not null.
    if (allUsers == null) failWithMessage("Expecting allUsers parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getAllUsers(), allUsers);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual UserService's allUsers contains the given User elements in Collection.
   * @param allUsers the given elements that should be contained in actual UserService's allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers does not contain all given User elements.
   */
  public S hasAllUsers(java.util.Collection<? extends User> allUsers) {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // check that given User collection is not null.
    if (allUsers == null) {
      failWithMessage("Expecting allUsers parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getAllUsers(), allUsers.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual UserService's allUsers contains <b>only</b> the given User elements and nothing else in whatever order.
   * @param allUsers the given elements that should be contained in actual UserService's allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers does not contain all given User elements.
   */
  public S hasOnlyAllUsers(User... allUsers) {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // check that given User varargs is not null.
    if (allUsers == null) failWithMessage("Expecting allUsers parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getAllUsers(), allUsers);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual UserService's allUsers contains <b>only</b> the given User elements in Collection and nothing else in whatever order.
   * @param allUsers the given elements that should be contained in actual UserService's allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers does not contain all given User elements.
   */
  public S hasOnlyAllUsers(java.util.Collection<? extends User> allUsers) {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // check that given User collection is not null.
    if (allUsers == null) {
      failWithMessage("Expecting allUsers parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getAllUsers(), allUsers.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual UserService's allUsers does not contain the given User elements.
   *
   * @param allUsers the given elements that should not be in actual UserService's allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers contains any given User elements.
   */
  public S doesNotHaveAllUsers(User... allUsers) {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // check that given User varargs is not null.
    if (allUsers == null) failWithMessage("Expecting allUsers parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getAllUsers(), allUsers);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual UserService's allUsers does not contain the given User elements in Collection.
   *
   * @param allUsers the given elements that should not be in actual UserService's allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers contains any given User elements.
   */
  public S doesNotHaveAllUsers(java.util.Collection<? extends User> allUsers) {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // check that given User collection is not null.
    if (allUsers == null) {
      failWithMessage("Expecting allUsers parameter not to be null.");
      return myself; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getAllUsers(), allUsers.toArray());

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual UserService has no allUsers.
   * @return this assertion object.
   * @throws AssertionError if the actual UserService's allUsers is not empty.
   */
  public S hasNoAllUsers() {
    // check that actual UserService we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have allUsers but had :\n  <%s>";

    // check
    if (actual.getAllUsers().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getAllUsers());
    }

    // return the current assertion for method chaining
    return myself;
  }


}
