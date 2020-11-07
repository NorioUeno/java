package practice.training.no20_4InterfaceStub;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class AuthenticationTest {

  public static class アカウントが存在しない場合 {
    Authentication sut;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
      sut = new Authentication();
      sut.accountDao = mock(AccountDaoImp.class);
      when(sut.accountDao.findOrNull("aaa")).thenReturn(null);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {

      AccountDao ad = new AccountDaoImp();
      Account expected = ad.getAccount();
      Authentication sut = new Authentication();

      Account actual = sut.authenticate("ueno", "norio");

      assertThat(actual.getName(), is(expected.getName()));

    }

    @Test
    public void test1() throws Exception {
      assertThat(sut.authenticate("aaa", "pwd"), is(nullValue()));
    }
  }
  public static class アカウント存在しパスワードが一致 {

    Authentication sut;
    Account account;
    @Before
    public void setUp() throws Exception {
      sut = new Authentication();
      sut.accountDao = mock(AccountDaoImp.class);
      account = new Account("ueno","norio");
      when(sut.accountDao.findOrNull("ueno")).thenReturn(account);
    }
    @Test
    public void tes3() throws Exception {
      assertThat(sut.authenticate("ueno", "aaa"),is(nullValue()));
    }

  }

}
