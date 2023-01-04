package org.harmony.endofline.card;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link Card} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public abstract class AbstractCardAssert<S extends AbstractCardAssert<S, A>, A extends Card> extends AbstractObjectAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractCardAssert}</code> to make assertions on actual Card.
   * @param actual the Card we want to make assertions on.
   */
  protected AbstractCardAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual Card's down is equal to the given one.
   * @param down the given down to compare the actual Card's down to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Card's down is not equal to the given one.
   */
  public S hasDown(Side down) {
    // check that actual Card we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting down of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Side actualDown = actual.getDown();
    if (!Objects.areEqual(actualDown, down)) {
      failWithMessage(assertjErrorMessage, actual, down, actualDown);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Card's initiative is equal to the given one.
   * @param initiative the given initiative to compare the actual Card's initiative to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Card's initiative is not equal to the given one.
   */
  public S hasInitiative(Integer initiative) {
    // check that actual Card we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting initiative of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Integer actualInitiative = actual.getInitiative();
    if (!Objects.areEqual(actualInitiative, initiative)) {
      failWithMessage(assertjErrorMessage, actual, initiative, actualInitiative);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Card's left is equal to the given one.
   * @param left the given left to compare the actual Card's left to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Card's left is not equal to the given one.
   */
  public S hasLeft(Side left) {
    // check that actual Card we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting left of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Side actualLeft = actual.getLeft();
    if (!Objects.areEqual(actualLeft, left)) {
      failWithMessage(assertjErrorMessage, actual, left, actualLeft);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Card's right is equal to the given one.
   * @param right the given right to compare the actual Card's right to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Card's right is not equal to the given one.
   */
  public S hasRight(Side right) {
    // check that actual Card we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting right of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Side actualRight = actual.getRight();
    if (!Objects.areEqual(actualRight, right)) {
      failWithMessage(assertjErrorMessage, actual, right, actualRight);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual Card's up is equal to the given one.
   * @param up the given up to compare the actual Card's up to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Card's up is not equal to the given one.
   */
  public S hasUp(Side up) {
    // check that actual Card we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting up of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // null safe check
    Side actualUp = actual.getUp();
    if (!Objects.areEqual(actualUp, up)) {
      failWithMessage(assertjErrorMessage, actual, up, actualUp);
    }

    // return the current assertion for method chaining
    return myself;
  }

}
