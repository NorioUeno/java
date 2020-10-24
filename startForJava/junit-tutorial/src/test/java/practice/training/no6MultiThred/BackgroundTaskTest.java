package practice.training.no6MultiThred;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BackgroundTaskTest {

  @SuppressWarnings("deprecation")
  @Rule
  public Timeout timeout = new Timeout(1000);

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void test() {

    System.out.println(Thread.currentThread().getName());
    final AtomicReference<String> backgroundThreadName = new AtomicReference<String>();
    final CountDownLatch latch = new CountDownLatch(1);
    Runnable task = new Runnable() {
      @Override
      public void run() {
        backgroundThreadName.set(Thread.currentThread().getName());
        latch.countDown();
        System.out.println(backgroundThreadName);
      }
    };

    BackgroundTask sut = new BackgroundTask(task);
    sut.invoke();

//    verify
    assertThat(backgroundThreadName.get(), is(not(Thread.currentThread().getName())));

  }

}
