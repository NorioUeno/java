package practice.section7TestFixture;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * 自作ルール
 *
 * @author aa572057
 *
 */
public abstract class PreCondition implements TestRule {

  @Override
  public Statement apply(final Statement base, Description description) {
    return new Statement() {

      @Override
      public void evaluate() throws Throwable {
        verify();
        base.evaluate();
      }
    };
  }

  protected abstract void verify() throws Throwable;

}
